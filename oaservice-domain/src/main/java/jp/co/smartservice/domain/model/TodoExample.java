package jp.co.smartservice.domain.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TodoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table todo
     *
     * @mbggenerated Wed Aug 12 23:25:20 JST 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table todo
     *
     * @mbggenerated Wed Aug 12 23:25:20 JST 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table todo
     *
     * @mbggenerated Wed Aug 12 23:25:20 JST 2015
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table todo
     *
     * @mbggenerated Wed Aug 12 23:25:20 JST 2015
     */
    public TodoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table todo
     *
     * @mbggenerated Wed Aug 12 23:25:20 JST 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table todo
     *
     * @mbggenerated Wed Aug 12 23:25:20 JST 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table todo
     *
     * @mbggenerated Wed Aug 12 23:25:20 JST 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table todo
     *
     * @mbggenerated Wed Aug 12 23:25:20 JST 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table todo
     *
     * @mbggenerated Wed Aug 12 23:25:20 JST 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table todo
     *
     * @mbggenerated Wed Aug 12 23:25:20 JST 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table todo
     *
     * @mbggenerated Wed Aug 12 23:25:20 JST 2015
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table todo
     *
     * @mbggenerated Wed Aug 12 23:25:20 JST 2015
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
     * This method corresponds to the database table todo
     *
     * @mbggenerated Wed Aug 12 23:25:20 JST 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table todo
     *
     * @mbggenerated Wed Aug 12 23:25:20 JST 2015
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table todo
     *
     * @mbggenerated Wed Aug 12 23:25:20 JST 2015
     */
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

        public Criteria andTodoIdIsNull() {
            addCriterion("todo_id is null");
            return (Criteria) this;
        }

        public Criteria andTodoIdIsNotNull() {
            addCriterion("todo_id is not null");
            return (Criteria) this;
        }

        public Criteria andTodoIdEqualTo(String value) {
            addCriterion("todo_id =", value, "todoId");
            return (Criteria) this;
        }

        public Criteria andTodoIdNotEqualTo(String value) {
            addCriterion("todo_id <>", value, "todoId");
            return (Criteria) this;
        }

        public Criteria andTodoIdGreaterThan(String value) {
            addCriterion("todo_id >", value, "todoId");
            return (Criteria) this;
        }

        public Criteria andTodoIdGreaterThanOrEqualTo(String value) {
            addCriterion("todo_id >=", value, "todoId");
            return (Criteria) this;
        }

        public Criteria andTodoIdLessThan(String value) {
            addCriterion("todo_id <", value, "todoId");
            return (Criteria) this;
        }

        public Criteria andTodoIdLessThanOrEqualTo(String value) {
            addCriterion("todo_id <=", value, "todoId");
            return (Criteria) this;
        }

        public Criteria andTodoIdLike(String value) {
            addCriterion("todo_id like", value, "todoId");
            return (Criteria) this;
        }

        public Criteria andTodoIdNotLike(String value) {
            addCriterion("todo_id not like", value, "todoId");
            return (Criteria) this;
        }

        public Criteria andTodoIdIn(List<String> values) {
            addCriterion("todo_id in", values, "todoId");
            return (Criteria) this;
        }

        public Criteria andTodoIdNotIn(List<String> values) {
            addCriterion("todo_id not in", values, "todoId");
            return (Criteria) this;
        }

        public Criteria andTodoIdBetween(String value1, String value2) {
            addCriterion("todo_id between", value1, value2, "todoId");
            return (Criteria) this;
        }

        public Criteria andTodoIdNotBetween(String value1, String value2) {
            addCriterion("todo_id not between", value1, value2, "todoId");
            return (Criteria) this;
        }

        public Criteria andTodoTitleIsNull() {
            addCriterion("todo_title is null");
            return (Criteria) this;
        }

        public Criteria andTodoTitleIsNotNull() {
            addCriterion("todo_title is not null");
            return (Criteria) this;
        }

        public Criteria andTodoTitleEqualTo(String value) {
            addCriterion("todo_title =", value, "todoTitle");
            return (Criteria) this;
        }

        public Criteria andTodoTitleNotEqualTo(String value) {
            addCriterion("todo_title <>", value, "todoTitle");
            return (Criteria) this;
        }

        public Criteria andTodoTitleGreaterThan(String value) {
            addCriterion("todo_title >", value, "todoTitle");
            return (Criteria) this;
        }

        public Criteria andTodoTitleGreaterThanOrEqualTo(String value) {
            addCriterion("todo_title >=", value, "todoTitle");
            return (Criteria) this;
        }

        public Criteria andTodoTitleLessThan(String value) {
            addCriterion("todo_title <", value, "todoTitle");
            return (Criteria) this;
        }

        public Criteria andTodoTitleLessThanOrEqualTo(String value) {
            addCriterion("todo_title <=", value, "todoTitle");
            return (Criteria) this;
        }

        public Criteria andTodoTitleLike(String value) {
            addCriterion("todo_title like", value, "todoTitle");
            return (Criteria) this;
        }

        public Criteria andTodoTitleNotLike(String value) {
            addCriterion("todo_title not like", value, "todoTitle");
            return (Criteria) this;
        }

        public Criteria andTodoTitleIn(List<String> values) {
            addCriterion("todo_title in", values, "todoTitle");
            return (Criteria) this;
        }

        public Criteria andTodoTitleNotIn(List<String> values) {
            addCriterion("todo_title not in", values, "todoTitle");
            return (Criteria) this;
        }

        public Criteria andTodoTitleBetween(String value1, String value2) {
            addCriterion("todo_title between", value1, value2, "todoTitle");
            return (Criteria) this;
        }

        public Criteria andTodoTitleNotBetween(String value1, String value2) {
            addCriterion("todo_title not between", value1, value2, "todoTitle");
            return (Criteria) this;
        }

        public Criteria andFinishedIsNull() {
            addCriterion("finished is null");
            return (Criteria) this;
        }

        public Criteria andFinishedIsNotNull() {
            addCriterion("finished is not null");
            return (Criteria) this;
        }

        public Criteria andFinishedEqualTo(Boolean value) {
            addCriterion("finished =", value, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedNotEqualTo(Boolean value) {
            addCriterion("finished <>", value, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedGreaterThan(Boolean value) {
            addCriterion("finished >", value, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("finished >=", value, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedLessThan(Boolean value) {
            addCriterion("finished <", value, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedLessThanOrEqualTo(Boolean value) {
            addCriterion("finished <=", value, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedIn(List<Boolean> values) {
            addCriterion("finished in", values, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedNotIn(List<Boolean> values) {
            addCriterion("finished not in", values, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedBetween(Boolean value1, Boolean value2) {
            addCriterion("finished between", value1, value2, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("finished not between", value1, value2, "finished");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Date value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table todo
     *
     * @mbggenerated do_not_delete_during_merge Wed Aug 12 23:25:20 JST 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table todo
     *
     * @mbggenerated Wed Aug 12 23:25:20 JST 2015
     */
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