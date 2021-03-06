/**
 * This file is part of mycollab-mobile.
 *
 * mycollab-mobile is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-mobile is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-mobile.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.mycollab.mobile.module.project.view.milestone;

import com.esofthead.vaadin.navigationbarquickmenu.NavigationBarQuickMenu;
import com.hp.gagawa.java.elements.A;
import com.hp.gagawa.java.elements.Div;
import com.hp.gagawa.java.elements.Img;
import com.hp.gagawa.java.elements.Span;
import com.mycollab.configuration.StorageFactory;
import com.mycollab.core.utils.StringUtils;
import com.mycollab.db.arguments.SetSearchField;
import com.mycollab.db.arguments.StringSearchField;
import com.mycollab.eventmanager.EventBusFactory;
import com.mycollab.mobile.module.project.events.MilestoneEvent;
import com.mycollab.mobile.module.project.ui.AbstractListPageView;
import com.mycollab.mobile.ui.AbstractPagedBeanList;
import com.mycollab.mobile.ui.DefaultPagedBeanList;
import com.mycollab.mobile.ui.MobileUIConstants;
import com.mycollab.mobile.ui.SearchInputField;
import com.mycollab.module.project.CurrentProjectVariables;
import com.mycollab.module.project.ProjectLinkBuilder;
import com.mycollab.module.project.ProjectLinkGenerator;
import com.mycollab.module.project.ProjectTypeConstants;
import com.mycollab.module.project.domain.SimpleMilestone;
import com.mycollab.module.project.domain.criteria.MilestoneSearchCriteria;
import com.mycollab.module.project.i18n.MilestoneI18nEnum;
import com.mycollab.module.project.i18n.OptionI18nEnum.MilestoneStatus;
import com.mycollab.module.project.i18n.ProjectI18nEnum;
import com.mycollab.module.project.service.MilestoneService;
import com.mycollab.module.project.ui.ProjectAssetsManager;
import com.mycollab.spring.AppContextUtil;
import com.mycollab.vaadin.MyCollabUI;
import com.mycollab.vaadin.UserUIContext;
import com.mycollab.vaadin.mvp.ViewComponent;
import com.mycollab.vaadin.ui.ELabel;
import com.mycollab.vaadin.ui.IBeanList;
import com.mycollab.vaadin.ui.UIConstants;
import com.vaadin.addon.touchkit.ui.Toolbar;
import com.vaadin.server.FontAwesome;
import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.CssLayout;
import org.vaadin.viritin.layouts.MCssLayout;
import org.vaadin.viritin.layouts.MHorizontalLayout;
import org.vaadin.viritin.layouts.MVerticalLayout;

/**
 * @author MyCollab Ltd.
 * @since 4.5.2
 */
@ViewComponent
public class MilestoneListViewImpl extends AbstractListPageView<MilestoneSearchCriteria, SimpleMilestone> implements MilestoneListView {
    private static final long serialVersionUID = 2799191640785637556L;

    private MilestoneStatus status = MilestoneStatus.InProgress;
    private Button closedMilestoneBtn, inProgressMilestoneBtn, futureMilestoneBtn;

    @Override
    protected AbstractPagedBeanList<MilestoneSearchCriteria, SimpleMilestone> createBeanList() {
        return new DefaultPagedBeanList<>(AppContextUtil.getSpringBean(MilestoneService.class), new MilestoneRowDisplayHandler());
    }

    @Override
    protected SearchInputField<MilestoneSearchCriteria> createSearchField() {
        return new SearchInputField<MilestoneSearchCriteria>() {
            @Override
            protected MilestoneSearchCriteria fillUpSearchCriteria(String value) {
                MilestoneSearchCriteria searchCriteria = new MilestoneSearchCriteria();
                searchCriteria.setProjectIds(new SetSearchField<>(CurrentProjectVariables.getProjectId()));
                searchCriteria.setMilestoneName(StringSearchField.and(value));
                return searchCriteria;
            }
        };
    }

    @Override
    protected Component buildRightComponent() {
        NavigationBarQuickMenu menu = new NavigationBarQuickMenu();
        menu.setButtonCaption("...");
        MVerticalLayout content = new MVerticalLayout();
        content.with(new Button(UserUIContext.getMessage(MilestoneI18nEnum.NEW),
                clickEvent -> EventBusFactory.getInstance().post(new MilestoneEvent.GotoAdd(MilestoneListViewImpl.this, null))));
        menu.setContent(content);
        return menu;
    }

    @Override
    public void displayStatus(MilestoneStatus status) {
        this.status = status;
        MilestoneSearchCriteria searchCriteria = new MilestoneSearchCriteria();
        searchCriteria.setProjectIds(new SetSearchField<>(CurrentProjectVariables.getProjectId()));
        searchCriteria.setStatuses(new SetSearchField<>(status.name()));
        itemList.search(searchCriteria);
        updateTabStatus();
    }

    @Override
    public void onBecomingVisible() {
        super.onBecomingVisible();
        updateTabStatus();
    }

    private void updateTabStatus() {
        if (status == MilestoneStatus.Closed) {
            this.setCaption(UserUIContext.getMessage(MilestoneStatus.Closed));
            closedMilestoneBtn.setStyleName(MobileUIConstants.BUTTON_ACTION);
            inProgressMilestoneBtn.setStyleName(MobileUIConstants.BUTTON_OPTION);
            futureMilestoneBtn.setStyleName(MobileUIConstants.BUTTON_OPTION);
        } else if (status == MilestoneStatus.Future) {
            this.setCaption(UserUIContext.getMessage(MilestoneStatus.Future));
            closedMilestoneBtn.setStyleName(MobileUIConstants.BUTTON_OPTION);
            inProgressMilestoneBtn.setStyleName(MobileUIConstants.BUTTON_OPTION);
            futureMilestoneBtn.setStyleName(MobileUIConstants.BUTTON_ACTION);
        } else {
            this.setCaption(UserUIContext.getMessage(MilestoneStatus.InProgress));
            closedMilestoneBtn.setStyleName(MobileUIConstants.BUTTON_OPTION);
            inProgressMilestoneBtn.setStyleName(MobileUIConstants.BUTTON_ACTION);
            futureMilestoneBtn.setStyleName(MobileUIConstants.BUTTON_OPTION);
        }
    }

    @Override
    protected Component buildToolbar() {
        Toolbar toolbar = new Toolbar();
        closedMilestoneBtn = new Button(UserUIContext.getMessage(MilestoneI18nEnum.WIDGET_CLOSED_PHASE_TITLE),
                clickEvent -> displayStatus(MilestoneStatus.Closed));
        closedMilestoneBtn.setIcon(FontAwesome.MINUS);
        toolbar.addComponent(closedMilestoneBtn);

        inProgressMilestoneBtn = new Button(UserUIContext.getMessage(MilestoneI18nEnum.WIDGET_INPROGRESS_PHASE_TITLE),
                clickEvent -> displayStatus(MilestoneStatus.InProgress));
        inProgressMilestoneBtn.setIcon(FontAwesome.SPINNER);

        futureMilestoneBtn = new Button(UserUIContext.getMessage(MilestoneI18nEnum.WIDGET_FUTURE_PHASE_TITLE),
                clickEvent -> displayStatus(MilestoneStatus.Future));
        futureMilestoneBtn.setIcon(FontAwesome.CLOCK_O);

        toolbar.addComponents(closedMilestoneBtn, inProgressMilestoneBtn, futureMilestoneBtn);
        return toolbar;
    }

    private static class MilestoneRowDisplayHandler implements IBeanList.RowDisplayHandler<SimpleMilestone> {

        @Override
        public Component generateRow(IBeanList<SimpleMilestone> host, final SimpleMilestone milestone, int rowIndex) {
            MVerticalLayout milestoneInfoLayout = new MVerticalLayout().withSpacing(false).withFullWidth();

            A milestoneLink = new A(ProjectLinkBuilder.generateMilestonePreviewFullLink(CurrentProjectVariables
                    .getProjectId(), milestone.getId())).appendChild(new Span().appendText(milestone.getName()));
            MCssLayout milestoneWrap = new MCssLayout(ELabel.html(milestoneLink.write()));
            milestoneInfoLayout.addComponent(new MHorizontalLayout(ELabel.fontIcon(ProjectAssetsManager.getAsset
                    (ProjectTypeConstants.MILESTONE)), milestoneWrap).expand(milestoneWrap).withFullWidth());

            CssLayout metaLayout = new CssLayout();
            milestoneInfoLayout.addComponent(metaLayout);

            ELabel milestoneDatesInfo = new ELabel().withWidthUndefined();
            milestoneDatesInfo.setValue(UserUIContext.getMessage(MilestoneI18nEnum.M_LIST_DATE_INFO,
                    UserUIContext.formatDate(milestone.getStartdate(), " N/A "),
                    UserUIContext.formatDate(milestone.getEnddate(), " N/A ")));
            milestoneDatesInfo.addStyleName(UIConstants.META_INFO);
            metaLayout.addComponent(milestoneDatesInfo);

            A assigneeLink = new A(ProjectLinkGenerator.generateProjectMemberFullLink(MyCollabUI.getSiteUrl(),
                    CurrentProjectVariables.getProjectId(), milestone.getAssignuser()))
                    .appendText(StringUtils.trim(milestone.getOwnerFullName(), 30, true));
            Div assigneeDiv = new Div().appendChild(new Img("", StorageFactory.getAvatarPath(milestone
                    .getOwnerAvatarId(), 16)).setCSSClass(UIConstants.CIRCLE_BOX)).appendChild(assigneeLink);

            ELabel assigneeLbl = ELabel.html(assigneeDiv.write()).withStyleName(UIConstants.META_INFO)
                    .withWidthUndefined();
            metaLayout.addComponent(assigneeLbl);

            int openAssignments = milestone.getNumOpenBugs() + milestone.getNumOpenTasks() + milestone.getNumOpenRisks();
            int totalAssignments = milestone.getNumBugs() + milestone.getNumTasks() + milestone.getNumRisks();
            ELabel progressInfoLbl;
            if (totalAssignments > 0) {
                progressInfoLbl = new ELabel(UserUIContext.getMessage(ProjectI18nEnum.OPT_PROJECT_TICKET,
                        (totalAssignments - openAssignments), totalAssignments, (totalAssignments - openAssignments)
                                * 100 / totalAssignments)).withStyleName(UIConstants.META_INFO);
            } else {
                progressInfoLbl = new ELabel(UserUIContext.getMessage(ProjectI18nEnum.OPT_NO_TICKET))
                        .withStyleName(UIConstants.META_INFO);
            }
            metaLayout.addComponent(progressInfoLbl);

            return milestoneInfoLayout;
        }
    }
}
