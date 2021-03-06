/**
 * This file is part of mycollab-services.
 *
 * mycollab-services is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-services is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-services.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.mycollab.form.domain;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("ucd")
public class FormSectionExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table m_form_section
     *
     * @mbg.generated Mon Oct 03 14:51:48 ICT 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table m_form_section
     *
     * @mbg.generated Mon Oct 03 14:51:48 ICT 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table m_form_section
     *
     * @mbg.generated Mon Oct 03 14:51:48 ICT 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_form_section
     *
     * @mbg.generated Mon Oct 03 14:51:48 ICT 2016
     */
    public FormSectionExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_form_section
     *
     * @mbg.generated Mon Oct 03 14:51:48 ICT 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_form_section
     *
     * @mbg.generated Mon Oct 03 14:51:48 ICT 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_form_section
     *
     * @mbg.generated Mon Oct 03 14:51:48 ICT 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_form_section
     *
     * @mbg.generated Mon Oct 03 14:51:48 ICT 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_form_section
     *
     * @mbg.generated Mon Oct 03 14:51:48 ICT 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_form_section
     *
     * @mbg.generated Mon Oct 03 14:51:48 ICT 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_form_section
     *
     * @mbg.generated Mon Oct 03 14:51:48 ICT 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_form_section
     *
     * @mbg.generated Mon Oct 03 14:51:48 ICT 2016
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_form_section
     *
     * @mbg.generated Mon Oct 03 14:51:48 ICT 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_form_section
     *
     * @mbg.generated Mon Oct 03 14:51:48 ICT 2016
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table m_form_section
     *
     * @mbg.generated Mon Oct 03 14:51:48 ICT 2016
     */
    @SuppressWarnings("ucd")
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andLayoutindexIsNull() {
            addCriterion("layoutIndex is null");
            return (Criteria) this;
        }

        public Criteria andLayoutindexIsNotNull() {
            addCriterion("layoutIndex is not null");
            return (Criteria) this;
        }

        public Criteria andLayoutindexEqualTo(Integer value) {
            addCriterion("layoutIndex =", value, "layoutindex");
            return (Criteria) this;
        }

        public Criteria andLayoutindexNotEqualTo(Integer value) {
            addCriterion("layoutIndex <>", value, "layoutindex");
            return (Criteria) this;
        }

        public Criteria andLayoutindexGreaterThan(Integer value) {
            addCriterion("layoutIndex >", value, "layoutindex");
            return (Criteria) this;
        }

        public Criteria andLayoutindexGreaterThanOrEqualTo(Integer value) {
            addCriterion("layoutIndex >=", value, "layoutindex");
            return (Criteria) this;
        }

        public Criteria andLayoutindexLessThan(Integer value) {
            addCriterion("layoutIndex <", value, "layoutindex");
            return (Criteria) this;
        }

        public Criteria andLayoutindexLessThanOrEqualTo(Integer value) {
            addCriterion("layoutIndex <=", value, "layoutindex");
            return (Criteria) this;
        }

        public Criteria andLayoutindexIn(List<Integer> values) {
            addCriterion("layoutIndex in", values, "layoutindex");
            return (Criteria) this;
        }

        public Criteria andLayoutindexNotIn(List<Integer> values) {
            addCriterion("layoutIndex not in", values, "layoutindex");
            return (Criteria) this;
        }

        public Criteria andLayoutindexBetween(Integer value1, Integer value2) {
            addCriterion("layoutIndex between", value1, value2, "layoutindex");
            return (Criteria) this;
        }

        public Criteria andLayoutindexNotBetween(Integer value1, Integer value2) {
            addCriterion("layoutIndex not between", value1, value2, "layoutindex");
            return (Criteria) this;
        }

        public Criteria andModuleIsNull() {
            addCriterion("module is null");
            return (Criteria) this;
        }

        public Criteria andModuleIsNotNull() {
            addCriterion("module is not null");
            return (Criteria) this;
        }

        public Criteria andModuleEqualTo(String value) {
            addCriterion("module =", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleNotEqualTo(String value) {
            addCriterion("module <>", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleGreaterThan(String value) {
            addCriterion("module >", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleGreaterThanOrEqualTo(String value) {
            addCriterion("module >=", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleLessThan(String value) {
            addCriterion("module <", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleLessThanOrEqualTo(String value) {
            addCriterion("module <=", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleLike(String value) {
            addCriterion("module like", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleNotLike(String value) {
            addCriterion("module not like", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleIn(List<String> values) {
            addCriterion("module in", values, "module");
            return (Criteria) this;
        }

        public Criteria andModuleNotIn(List<String> values) {
            addCriterion("module not in", values, "module");
            return (Criteria) this;
        }

        public Criteria andModuleBetween(String value1, String value2) {
            addCriterion("module between", value1, value2, "module");
            return (Criteria) this;
        }

        public Criteria andModuleNotBetween(String value1, String value2) {
            addCriterion("module not between", value1, value2, "module");
            return (Criteria) this;
        }

        public Criteria andSaccountidIsNull() {
            addCriterion("sAccountId is null");
            return (Criteria) this;
        }

        public Criteria andSaccountidIsNotNull() {
            addCriterion("sAccountId is not null");
            return (Criteria) this;
        }

        public Criteria andSaccountidEqualTo(Integer value) {
            addCriterion("sAccountId =", value, "saccountid");
            return (Criteria) this;
        }

        public Criteria andSaccountidNotEqualTo(Integer value) {
            addCriterion("sAccountId <>", value, "saccountid");
            return (Criteria) this;
        }

        public Criteria andSaccountidGreaterThan(Integer value) {
            addCriterion("sAccountId >", value, "saccountid");
            return (Criteria) this;
        }

        public Criteria andSaccountidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sAccountId >=", value, "saccountid");
            return (Criteria) this;
        }

        public Criteria andSaccountidLessThan(Integer value) {
            addCriterion("sAccountId <", value, "saccountid");
            return (Criteria) this;
        }

        public Criteria andSaccountidLessThanOrEqualTo(Integer value) {
            addCriterion("sAccountId <=", value, "saccountid");
            return (Criteria) this;
        }

        public Criteria andSaccountidIn(List<Integer> values) {
            addCriterion("sAccountId in", values, "saccountid");
            return (Criteria) this;
        }

        public Criteria andSaccountidNotIn(List<Integer> values) {
            addCriterion("sAccountId not in", values, "saccountid");
            return (Criteria) this;
        }

        public Criteria andSaccountidBetween(Integer value1, Integer value2) {
            addCriterion("sAccountId between", value1, value2, "saccountid");
            return (Criteria) this;
        }

        public Criteria andSaccountidNotBetween(Integer value1, Integer value2) {
            addCriterion("sAccountId not between", value1, value2, "saccountid");
            return (Criteria) this;
        }

        public Criteria andLayouttypeIsNull() {
            addCriterion("layoutType is null");
            return (Criteria) this;
        }

        public Criteria andLayouttypeIsNotNull() {
            addCriterion("layoutType is not null");
            return (Criteria) this;
        }

        public Criteria andLayouttypeEqualTo(Integer value) {
            addCriterion("layoutType =", value, "layouttype");
            return (Criteria) this;
        }

        public Criteria andLayouttypeNotEqualTo(Integer value) {
            addCriterion("layoutType <>", value, "layouttype");
            return (Criteria) this;
        }

        public Criteria andLayouttypeGreaterThan(Integer value) {
            addCriterion("layoutType >", value, "layouttype");
            return (Criteria) this;
        }

        public Criteria andLayouttypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("layoutType >=", value, "layouttype");
            return (Criteria) this;
        }

        public Criteria andLayouttypeLessThan(Integer value) {
            addCriterion("layoutType <", value, "layouttype");
            return (Criteria) this;
        }

        public Criteria andLayouttypeLessThanOrEqualTo(Integer value) {
            addCriterion("layoutType <=", value, "layouttype");
            return (Criteria) this;
        }

        public Criteria andLayouttypeIn(List<Integer> values) {
            addCriterion("layoutType in", values, "layouttype");
            return (Criteria) this;
        }

        public Criteria andLayouttypeNotIn(List<Integer> values) {
            addCriterion("layoutType not in", values, "layouttype");
            return (Criteria) this;
        }

        public Criteria andLayouttypeBetween(Integer value1, Integer value2) {
            addCriterion("layoutType between", value1, value2, "layouttype");
            return (Criteria) this;
        }

        public Criteria andLayouttypeNotBetween(Integer value1, Integer value2) {
            addCriterion("layoutType not between", value1, value2, "layouttype");
            return (Criteria) this;
        }

        public Criteria andIsdeletesectionIsNull() {
            addCriterion("isDeleteSection is null");
            return (Criteria) this;
        }

        public Criteria andIsdeletesectionIsNotNull() {
            addCriterion("isDeleteSection is not null");
            return (Criteria) this;
        }

        public Criteria andIsdeletesectionEqualTo(Boolean value) {
            addCriterion("isDeleteSection =", value, "isdeletesection");
            return (Criteria) this;
        }

        public Criteria andIsdeletesectionNotEqualTo(Boolean value) {
            addCriterion("isDeleteSection <>", value, "isdeletesection");
            return (Criteria) this;
        }

        public Criteria andIsdeletesectionGreaterThan(Boolean value) {
            addCriterion("isDeleteSection >", value, "isdeletesection");
            return (Criteria) this;
        }

        public Criteria andIsdeletesectionGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isDeleteSection >=", value, "isdeletesection");
            return (Criteria) this;
        }

        public Criteria andIsdeletesectionLessThan(Boolean value) {
            addCriterion("isDeleteSection <", value, "isdeletesection");
            return (Criteria) this;
        }

        public Criteria andIsdeletesectionLessThanOrEqualTo(Boolean value) {
            addCriterion("isDeleteSection <=", value, "isdeletesection");
            return (Criteria) this;
        }

        public Criteria andIsdeletesectionIn(List<Boolean> values) {
            addCriterion("isDeleteSection in", values, "isdeletesection");
            return (Criteria) this;
        }

        public Criteria andIsdeletesectionNotIn(List<Boolean> values) {
            addCriterion("isDeleteSection not in", values, "isdeletesection");
            return (Criteria) this;
        }

        public Criteria andIsdeletesectionBetween(Boolean value1, Boolean value2) {
            addCriterion("isDeleteSection between", value1, value2, "isdeletesection");
            return (Criteria) this;
        }

        public Criteria andIsdeletesectionNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isDeleteSection not between", value1, value2, "isdeletesection");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table m_form_section
     *
     * @mbg.generated do_not_delete_during_merge Mon Oct 03 14:51:48 ICT 2016
     */
    @SuppressWarnings("ucd")
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table m_form_section
     *
     * @mbg.generated Mon Oct 03 14:51:48 ICT 2016
     */
    @SuppressWarnings("ucd")
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}