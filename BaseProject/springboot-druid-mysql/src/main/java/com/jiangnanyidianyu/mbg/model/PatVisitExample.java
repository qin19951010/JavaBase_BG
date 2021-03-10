package com.jiangnanyidianyu.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PatVisitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PatVisitExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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

        public Criteria andPatientIdIsNull() {
            addCriterion("PATIENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andPatientIdIsNotNull() {
            addCriterion("PATIENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPatientIdEqualTo(String value) {
            addCriterion("PATIENT_ID =", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdNotEqualTo(String value) {
            addCriterion("PATIENT_ID <>", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdGreaterThan(String value) {
            addCriterion("PATIENT_ID >", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdGreaterThanOrEqualTo(String value) {
            addCriterion("PATIENT_ID >=", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdLessThan(String value) {
            addCriterion("PATIENT_ID <", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdLessThanOrEqualTo(String value) {
            addCriterion("PATIENT_ID <=", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdLike(String value) {
            addCriterion("PATIENT_ID like", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdNotLike(String value) {
            addCriterion("PATIENT_ID not like", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdIn(List<String> values) {
            addCriterion("PATIENT_ID in", values, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdNotIn(List<String> values) {
            addCriterion("PATIENT_ID not in", values, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdBetween(String value1, String value2) {
            addCriterion("PATIENT_ID between", value1, value2, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdNotBetween(String value1, String value2) {
            addCriterion("PATIENT_ID not between", value1, value2, "patientId");
            return (Criteria) this;
        }

        public Criteria andVisitIdIsNull() {
            addCriterion("VISIT_ID is null");
            return (Criteria) this;
        }

        public Criteria andVisitIdIsNotNull() {
            addCriterion("VISIT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andVisitIdEqualTo(String value) {
            addCriterion("VISIT_ID =", value, "visitId");
            return (Criteria) this;
        }

        public Criteria andVisitIdNotEqualTo(String value) {
            addCriterion("VISIT_ID <>", value, "visitId");
            return (Criteria) this;
        }

        public Criteria andVisitIdGreaterThan(String value) {
            addCriterion("VISIT_ID >", value, "visitId");
            return (Criteria) this;
        }

        public Criteria andVisitIdGreaterThanOrEqualTo(String value) {
            addCriterion("VISIT_ID >=", value, "visitId");
            return (Criteria) this;
        }

        public Criteria andVisitIdLessThan(String value) {
            addCriterion("VISIT_ID <", value, "visitId");
            return (Criteria) this;
        }

        public Criteria andVisitIdLessThanOrEqualTo(String value) {
            addCriterion("VISIT_ID <=", value, "visitId");
            return (Criteria) this;
        }

        public Criteria andVisitIdLike(String value) {
            addCriterion("VISIT_ID like", value, "visitId");
            return (Criteria) this;
        }

        public Criteria andVisitIdNotLike(String value) {
            addCriterion("VISIT_ID not like", value, "visitId");
            return (Criteria) this;
        }

        public Criteria andVisitIdIn(List<String> values) {
            addCriterion("VISIT_ID in", values, "visitId");
            return (Criteria) this;
        }

        public Criteria andVisitIdNotIn(List<String> values) {
            addCriterion("VISIT_ID not in", values, "visitId");
            return (Criteria) this;
        }

        public Criteria andVisitIdBetween(String value1, String value2) {
            addCriterion("VISIT_ID between", value1, value2, "visitId");
            return (Criteria) this;
        }

        public Criteria andVisitIdNotBetween(String value1, String value2) {
            addCriterion("VISIT_ID not between", value1, value2, "visitId");
            return (Criteria) this;
        }

        public Criteria andInpNoIsNull() {
            addCriterion("INP_NO is null");
            return (Criteria) this;
        }

        public Criteria andInpNoIsNotNull() {
            addCriterion("INP_NO is not null");
            return (Criteria) this;
        }

        public Criteria andInpNoEqualTo(String value) {
            addCriterion("INP_NO =", value, "inpNo");
            return (Criteria) this;
        }

        public Criteria andInpNoNotEqualTo(String value) {
            addCriterion("INP_NO <>", value, "inpNo");
            return (Criteria) this;
        }

        public Criteria andInpNoGreaterThan(String value) {
            addCriterion("INP_NO >", value, "inpNo");
            return (Criteria) this;
        }

        public Criteria andInpNoGreaterThanOrEqualTo(String value) {
            addCriterion("INP_NO >=", value, "inpNo");
            return (Criteria) this;
        }

        public Criteria andInpNoLessThan(String value) {
            addCriterion("INP_NO <", value, "inpNo");
            return (Criteria) this;
        }

        public Criteria andInpNoLessThanOrEqualTo(String value) {
            addCriterion("INP_NO <=", value, "inpNo");
            return (Criteria) this;
        }

        public Criteria andInpNoLike(String value) {
            addCriterion("INP_NO like", value, "inpNo");
            return (Criteria) this;
        }

        public Criteria andInpNoNotLike(String value) {
            addCriterion("INP_NO not like", value, "inpNo");
            return (Criteria) this;
        }

        public Criteria andInpNoIn(List<String> values) {
            addCriterion("INP_NO in", values, "inpNo");
            return (Criteria) this;
        }

        public Criteria andInpNoNotIn(List<String> values) {
            addCriterion("INP_NO not in", values, "inpNo");
            return (Criteria) this;
        }

        public Criteria andInpNoBetween(String value1, String value2) {
            addCriterion("INP_NO between", value1, value2, "inpNo");
            return (Criteria) this;
        }

        public Criteria andInpNoNotBetween(String value1, String value2) {
            addCriterion("INP_NO not between", value1, value2, "inpNo");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andDeptAdmissionToIsNull() {
            addCriterion("DEPT_ADMISSION_TO is null");
            return (Criteria) this;
        }

        public Criteria andDeptAdmissionToIsNotNull() {
            addCriterion("DEPT_ADMISSION_TO is not null");
            return (Criteria) this;
        }

        public Criteria andDeptAdmissionToEqualTo(String value) {
            addCriterion("DEPT_ADMISSION_TO =", value, "deptAdmissionTo");
            return (Criteria) this;
        }

        public Criteria andDeptAdmissionToNotEqualTo(String value) {
            addCriterion("DEPT_ADMISSION_TO <>", value, "deptAdmissionTo");
            return (Criteria) this;
        }

        public Criteria andDeptAdmissionToGreaterThan(String value) {
            addCriterion("DEPT_ADMISSION_TO >", value, "deptAdmissionTo");
            return (Criteria) this;
        }

        public Criteria andDeptAdmissionToGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_ADMISSION_TO >=", value, "deptAdmissionTo");
            return (Criteria) this;
        }

        public Criteria andDeptAdmissionToLessThan(String value) {
            addCriterion("DEPT_ADMISSION_TO <", value, "deptAdmissionTo");
            return (Criteria) this;
        }

        public Criteria andDeptAdmissionToLessThanOrEqualTo(String value) {
            addCriterion("DEPT_ADMISSION_TO <=", value, "deptAdmissionTo");
            return (Criteria) this;
        }

        public Criteria andDeptAdmissionToLike(String value) {
            addCriterion("DEPT_ADMISSION_TO like", value, "deptAdmissionTo");
            return (Criteria) this;
        }

        public Criteria andDeptAdmissionToNotLike(String value) {
            addCriterion("DEPT_ADMISSION_TO not like", value, "deptAdmissionTo");
            return (Criteria) this;
        }

        public Criteria andDeptAdmissionToIn(List<String> values) {
            addCriterion("DEPT_ADMISSION_TO in", values, "deptAdmissionTo");
            return (Criteria) this;
        }

        public Criteria andDeptAdmissionToNotIn(List<String> values) {
            addCriterion("DEPT_ADMISSION_TO not in", values, "deptAdmissionTo");
            return (Criteria) this;
        }

        public Criteria andDeptAdmissionToBetween(String value1, String value2) {
            addCriterion("DEPT_ADMISSION_TO between", value1, value2, "deptAdmissionTo");
            return (Criteria) this;
        }

        public Criteria andDeptAdmissionToNotBetween(String value1, String value2) {
            addCriterion("DEPT_ADMISSION_TO not between", value1, value2, "deptAdmissionTo");
            return (Criteria) this;
        }

        public Criteria andAdmissionDateTimeIsNull() {
            addCriterion("ADMISSION_DATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andAdmissionDateTimeIsNotNull() {
            addCriterion("ADMISSION_DATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andAdmissionDateTimeEqualTo(Date value) {
            addCriterion("ADMISSION_DATE_TIME =", value, "admissionDateTime");
            return (Criteria) this;
        }

        public Criteria andAdmissionDateTimeNotEqualTo(Date value) {
            addCriterion("ADMISSION_DATE_TIME <>", value, "admissionDateTime");
            return (Criteria) this;
        }

        public Criteria andAdmissionDateTimeGreaterThan(Date value) {
            addCriterion("ADMISSION_DATE_TIME >", value, "admissionDateTime");
            return (Criteria) this;
        }

        public Criteria andAdmissionDateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ADMISSION_DATE_TIME >=", value, "admissionDateTime");
            return (Criteria) this;
        }

        public Criteria andAdmissionDateTimeLessThan(Date value) {
            addCriterion("ADMISSION_DATE_TIME <", value, "admissionDateTime");
            return (Criteria) this;
        }

        public Criteria andAdmissionDateTimeLessThanOrEqualTo(Date value) {
            addCriterion("ADMISSION_DATE_TIME <=", value, "admissionDateTime");
            return (Criteria) this;
        }

        public Criteria andAdmissionDateTimeIn(List<Date> values) {
            addCriterion("ADMISSION_DATE_TIME in", values, "admissionDateTime");
            return (Criteria) this;
        }

        public Criteria andAdmissionDateTimeNotIn(List<Date> values) {
            addCriterion("ADMISSION_DATE_TIME not in", values, "admissionDateTime");
            return (Criteria) this;
        }

        public Criteria andAdmissionDateTimeBetween(Date value1, Date value2) {
            addCriterion("ADMISSION_DATE_TIME between", value1, value2, "admissionDateTime");
            return (Criteria) this;
        }

        public Criteria andAdmissionDateTimeNotBetween(Date value1, Date value2) {
            addCriterion("ADMISSION_DATE_TIME not between", value1, value2, "admissionDateTime");
            return (Criteria) this;
        }

        public Criteria andDeptDischargeFromIsNull() {
            addCriterion("DEPT_DISCHARGE_FROM is null");
            return (Criteria) this;
        }

        public Criteria andDeptDischargeFromIsNotNull() {
            addCriterion("DEPT_DISCHARGE_FROM is not null");
            return (Criteria) this;
        }

        public Criteria andDeptDischargeFromEqualTo(String value) {
            addCriterion("DEPT_DISCHARGE_FROM =", value, "deptDischargeFrom");
            return (Criteria) this;
        }

        public Criteria andDeptDischargeFromNotEqualTo(String value) {
            addCriterion("DEPT_DISCHARGE_FROM <>", value, "deptDischargeFrom");
            return (Criteria) this;
        }

        public Criteria andDeptDischargeFromGreaterThan(String value) {
            addCriterion("DEPT_DISCHARGE_FROM >", value, "deptDischargeFrom");
            return (Criteria) this;
        }

        public Criteria andDeptDischargeFromGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_DISCHARGE_FROM >=", value, "deptDischargeFrom");
            return (Criteria) this;
        }

        public Criteria andDeptDischargeFromLessThan(String value) {
            addCriterion("DEPT_DISCHARGE_FROM <", value, "deptDischargeFrom");
            return (Criteria) this;
        }

        public Criteria andDeptDischargeFromLessThanOrEqualTo(String value) {
            addCriterion("DEPT_DISCHARGE_FROM <=", value, "deptDischargeFrom");
            return (Criteria) this;
        }

        public Criteria andDeptDischargeFromLike(String value) {
            addCriterion("DEPT_DISCHARGE_FROM like", value, "deptDischargeFrom");
            return (Criteria) this;
        }

        public Criteria andDeptDischargeFromNotLike(String value) {
            addCriterion("DEPT_DISCHARGE_FROM not like", value, "deptDischargeFrom");
            return (Criteria) this;
        }

        public Criteria andDeptDischargeFromIn(List<String> values) {
            addCriterion("DEPT_DISCHARGE_FROM in", values, "deptDischargeFrom");
            return (Criteria) this;
        }

        public Criteria andDeptDischargeFromNotIn(List<String> values) {
            addCriterion("DEPT_DISCHARGE_FROM not in", values, "deptDischargeFrom");
            return (Criteria) this;
        }

        public Criteria andDeptDischargeFromBetween(String value1, String value2) {
            addCriterion("DEPT_DISCHARGE_FROM between", value1, value2, "deptDischargeFrom");
            return (Criteria) this;
        }

        public Criteria andDeptDischargeFromNotBetween(String value1, String value2) {
            addCriterion("DEPT_DISCHARGE_FROM not between", value1, value2, "deptDischargeFrom");
            return (Criteria) this;
        }

        public Criteria andDischargeDateTimeIsNull() {
            addCriterion("DISCHARGE_DATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDischargeDateTimeIsNotNull() {
            addCriterion("DISCHARGE_DATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDischargeDateTimeEqualTo(Date value) {
            addCriterion("DISCHARGE_DATE_TIME =", value, "dischargeDateTime");
            return (Criteria) this;
        }

        public Criteria andDischargeDateTimeNotEqualTo(Date value) {
            addCriterion("DISCHARGE_DATE_TIME <>", value, "dischargeDateTime");
            return (Criteria) this;
        }

        public Criteria andDischargeDateTimeGreaterThan(Date value) {
            addCriterion("DISCHARGE_DATE_TIME >", value, "dischargeDateTime");
            return (Criteria) this;
        }

        public Criteria andDischargeDateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DISCHARGE_DATE_TIME >=", value, "dischargeDateTime");
            return (Criteria) this;
        }

        public Criteria andDischargeDateTimeLessThan(Date value) {
            addCriterion("DISCHARGE_DATE_TIME <", value, "dischargeDateTime");
            return (Criteria) this;
        }

        public Criteria andDischargeDateTimeLessThanOrEqualTo(Date value) {
            addCriterion("DISCHARGE_DATE_TIME <=", value, "dischargeDateTime");
            return (Criteria) this;
        }

        public Criteria andDischargeDateTimeIn(List<Date> values) {
            addCriterion("DISCHARGE_DATE_TIME in", values, "dischargeDateTime");
            return (Criteria) this;
        }

        public Criteria andDischargeDateTimeNotIn(List<Date> values) {
            addCriterion("DISCHARGE_DATE_TIME not in", values, "dischargeDateTime");
            return (Criteria) this;
        }

        public Criteria andDischargeDateTimeBetween(Date value1, Date value2) {
            addCriterion("DISCHARGE_DATE_TIME between", value1, value2, "dischargeDateTime");
            return (Criteria) this;
        }

        public Criteria andDischargeDateTimeNotBetween(Date value1, Date value2) {
            addCriterion("DISCHARGE_DATE_TIME not between", value1, value2, "dischargeDateTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

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