package jp.co.smartservice.domain.model;

import java.io.Serializable;

public class T001UserKey implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t001_user.user_id
	 * @mbggenerated  Sat Aug 15 10:48:28 JST 2015
	 */
	private String userId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table t001_user
	 * @mbggenerated  Sat Aug 15 10:48:28 JST 2015
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t001_user.user_id
	 * @return  the value of t001_user.user_id
	 * @mbggenerated  Sat Aug 15 10:48:28 JST 2015
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t001_user.user_id
	 * @param userId  the value for t001_user.user_id
	 * @mbggenerated  Sat Aug 15 10:48:28 JST 2015
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
}