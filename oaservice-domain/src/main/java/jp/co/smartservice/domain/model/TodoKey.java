package jp.co.smartservice.domain.model;

import java.io.Serializable;

public class TodoKey implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column todo.todo_id
     *
     * @mbggenerated Wed Aug 12 23:25:20 JST 2015
     */
    private String todoId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table todo
     *
     * @mbggenerated Wed Aug 12 23:25:20 JST 2015
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column todo.todo_id
     *
     * @return the value of todo.todo_id
     *
     * @mbggenerated Wed Aug 12 23:25:20 JST 2015
     */
    public String getTodoId() {
        return todoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column todo.todo_id
     *
     * @param todoId the value for todo.todo_id
     *
     * @mbggenerated Wed Aug 12 23:25:20 JST 2015
     */
    public void setTodoId(String todoId) {
        this.todoId = todoId;
    }
}