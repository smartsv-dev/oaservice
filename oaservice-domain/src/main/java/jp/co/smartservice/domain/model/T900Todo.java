package jp.co.smartservice.domain.model;

import java.io.Serializable;
import java.util.Date;

public class T900Todo extends T900TodoKey implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t900_todo.todo_title
	 * @mbggenerated  Sat Aug 15 10:45:51 JST 2015
	 */
	private String todoTitle;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t900_todo.finished
	 * @mbggenerated  Sat Aug 15 10:45:51 JST 2015
	 */
	private Boolean finished;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t900_todo.created_at
	 * @mbggenerated  Sat Aug 15 10:45:51 JST 2015
	 */
	private Date createdAt;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table t900_todo
	 * @mbggenerated  Sat Aug 15 10:45:51 JST 2015
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t900_todo.todo_title
	 * @return  the value of t900_todo.todo_title
	 * @mbggenerated  Sat Aug 15 10:45:51 JST 2015
	 */
	public String getTodoTitle() {
		return todoTitle;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t900_todo.todo_title
	 * @param todoTitle  the value for t900_todo.todo_title
	 * @mbggenerated  Sat Aug 15 10:45:51 JST 2015
	 */
	public void setTodoTitle(String todoTitle) {
		this.todoTitle = todoTitle;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t900_todo.finished
	 * @return  the value of t900_todo.finished
	 * @mbggenerated  Sat Aug 15 10:45:51 JST 2015
	 */
	public Boolean getFinished() {
		return finished;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t900_todo.finished
	 * @param finished  the value for t900_todo.finished
	 * @mbggenerated  Sat Aug 15 10:45:51 JST 2015
	 */
	public void setFinished(Boolean finished) {
		this.finished = finished;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t900_todo.created_at
	 * @return  the value of t900_todo.created_at
	 * @mbggenerated  Sat Aug 15 10:45:51 JST 2015
	 */
	public Date getCreatedAt() {
		return createdAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t900_todo.created_at
	 * @param createdAt  the value for t900_todo.created_at
	 * @mbggenerated  Sat Aug 15 10:45:51 JST 2015
	 */
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
}