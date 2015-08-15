package jp.co.smartservice.domain.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class T001UserExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table t001_user
	 * @mbggenerated  Sat Aug 15 10:48:28 JST 2015
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table t001_user
	 * @mbggenerated  Sat Aug 15 10:48:28 JST 2015
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table t001_user
	 * @mbggenerated  Sat Aug 15 10:48:28 JST 2015
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t001_user
	 * @mbggenerated  Sat Aug 15 10:48:28 JST 2015
	 */
	public T001UserExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t001_user
	 * @mbggenerated  Sat Aug 15 10:48:28 JST 2015
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t001_user
	 * @mbggenerated  Sat Aug 15 10:48:28 JST 2015
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t001_user
	 * @mbggenerated  Sat Aug 15 10:48:28 JST 2015
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t001_user
	 * @mbggenerated  Sat Aug 15 10:48:28 JST 2015
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t001_user
	 * @mbggenerated  Sat Aug 15 10:48:28 JST 2015
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t001_user
	 * @mbggenerated  Sat Aug 15 10:48:28 JST 2015
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t001_user
	 * @mbggenerated  Sat Aug 15 10:48:28 JST 2015
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t001_user
	 * @mbggenerated  Sat Aug 15 10:48:28 JST 2015
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t001_user
	 * @mbggenerated  Sat Aug 15 10:48:28 JST 2015
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t001_user
	 * @mbggenerated  Sat Aug 15 10:48:28 JST 2015
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table t001_user
	 * @mbggenerated  Sat Aug 15 10:48:28 JST 2015
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

		public Criteria andUserIdIsNull() {
			addCriterion("user_id is null");
			return (Criteria) this;
		}

		public Criteria andUserIdIsNotNull() {
			addCriterion("user_id is not null");
			return (Criteria) this;
		}

		public Criteria andUserIdEqualTo(String value) {
			addCriterion("user_id =", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotEqualTo(String value) {
			addCriterion("user_id <>", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdGreaterThan(String value) {
			addCriterion("user_id >", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdGreaterThanOrEqualTo(String value) {
			addCriterion("user_id >=", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLessThan(String value) {
			addCriterion("user_id <", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLessThanOrEqualTo(String value) {
			addCriterion("user_id <=", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLike(String value) {
			addCriterion("user_id like", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotLike(String value) {
			addCriterion("user_id not like", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdIn(List<String> values) {
			addCriterion("user_id in", values, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotIn(List<String> values) {
			addCriterion("user_id not in", values, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdBetween(String value1, String value2) {
			addCriterion("user_id between", value1, value2, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotBetween(String value1, String value2) {
			addCriterion("user_id not between", value1, value2, "userId");
			return (Criteria) this;
		}

		public Criteria andPasswordIsNull() {
			addCriterion("password is null");
			return (Criteria) this;
		}

		public Criteria andPasswordIsNotNull() {
			addCriterion("password is not null");
			return (Criteria) this;
		}

		public Criteria andPasswordEqualTo(String value) {
			addCriterion("password =", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotEqualTo(String value) {
			addCriterion("password <>", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordGreaterThan(String value) {
			addCriterion("password >", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordGreaterThanOrEqualTo(String value) {
			addCriterion("password >=", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordLessThan(String value) {
			addCriterion("password <", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordLessThanOrEqualTo(String value) {
			addCriterion("password <=", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordLike(String value) {
			addCriterion("password like", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotLike(String value) {
			addCriterion("password not like", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordIn(List<String> values) {
			addCriterion("password in", values, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotIn(List<String> values) {
			addCriterion("password not in", values, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordBetween(String value1, String value2) {
			addCriterion("password between", value1, value2, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotBetween(String value1, String value2) {
			addCriterion("password not between", value1, value2, "password");
			return (Criteria) this;
		}

		public Criteria andNameKanjiIsNull() {
			addCriterion("name_kanji is null");
			return (Criteria) this;
		}

		public Criteria andNameKanjiIsNotNull() {
			addCriterion("name_kanji is not null");
			return (Criteria) this;
		}

		public Criteria andNameKanjiEqualTo(String value) {
			addCriterion("name_kanji =", value, "nameKanji");
			return (Criteria) this;
		}

		public Criteria andNameKanjiNotEqualTo(String value) {
			addCriterion("name_kanji <>", value, "nameKanji");
			return (Criteria) this;
		}

		public Criteria andNameKanjiGreaterThan(String value) {
			addCriterion("name_kanji >", value, "nameKanji");
			return (Criteria) this;
		}

		public Criteria andNameKanjiGreaterThanOrEqualTo(String value) {
			addCriterion("name_kanji >=", value, "nameKanji");
			return (Criteria) this;
		}

		public Criteria andNameKanjiLessThan(String value) {
			addCriterion("name_kanji <", value, "nameKanji");
			return (Criteria) this;
		}

		public Criteria andNameKanjiLessThanOrEqualTo(String value) {
			addCriterion("name_kanji <=", value, "nameKanji");
			return (Criteria) this;
		}

		public Criteria andNameKanjiLike(String value) {
			addCriterion("name_kanji like", value, "nameKanji");
			return (Criteria) this;
		}

		public Criteria andNameKanjiNotLike(String value) {
			addCriterion("name_kanji not like", value, "nameKanji");
			return (Criteria) this;
		}

		public Criteria andNameKanjiIn(List<String> values) {
			addCriterion("name_kanji in", values, "nameKanji");
			return (Criteria) this;
		}

		public Criteria andNameKanjiNotIn(List<String> values) {
			addCriterion("name_kanji not in", values, "nameKanji");
			return (Criteria) this;
		}

		public Criteria andNameKanjiBetween(String value1, String value2) {
			addCriterion("name_kanji between", value1, value2, "nameKanji");
			return (Criteria) this;
		}

		public Criteria andNameKanjiNotBetween(String value1, String value2) {
			addCriterion("name_kanji not between", value1, value2, "nameKanji");
			return (Criteria) this;
		}

		public Criteria andNameKatakanaIsNull() {
			addCriterion("name_katakana is null");
			return (Criteria) this;
		}

		public Criteria andNameKatakanaIsNotNull() {
			addCriterion("name_katakana is not null");
			return (Criteria) this;
		}

		public Criteria andNameKatakanaEqualTo(String value) {
			addCriterion("name_katakana =", value, "nameKatakana");
			return (Criteria) this;
		}

		public Criteria andNameKatakanaNotEqualTo(String value) {
			addCriterion("name_katakana <>", value, "nameKatakana");
			return (Criteria) this;
		}

		public Criteria andNameKatakanaGreaterThan(String value) {
			addCriterion("name_katakana >", value, "nameKatakana");
			return (Criteria) this;
		}

		public Criteria andNameKatakanaGreaterThanOrEqualTo(String value) {
			addCriterion("name_katakana >=", value, "nameKatakana");
			return (Criteria) this;
		}

		public Criteria andNameKatakanaLessThan(String value) {
			addCriterion("name_katakana <", value, "nameKatakana");
			return (Criteria) this;
		}

		public Criteria andNameKatakanaLessThanOrEqualTo(String value) {
			addCriterion("name_katakana <=", value, "nameKatakana");
			return (Criteria) this;
		}

		public Criteria andNameKatakanaLike(String value) {
			addCriterion("name_katakana like", value, "nameKatakana");
			return (Criteria) this;
		}

		public Criteria andNameKatakanaNotLike(String value) {
			addCriterion("name_katakana not like", value, "nameKatakana");
			return (Criteria) this;
		}

		public Criteria andNameKatakanaIn(List<String> values) {
			addCriterion("name_katakana in", values, "nameKatakana");
			return (Criteria) this;
		}

		public Criteria andNameKatakanaNotIn(List<String> values) {
			addCriterion("name_katakana not in", values, "nameKatakana");
			return (Criteria) this;
		}

		public Criteria andNameKatakanaBetween(String value1, String value2) {
			addCriterion("name_katakana between", value1, value2, "nameKatakana");
			return (Criteria) this;
		}

		public Criteria andNameKatakanaNotBetween(String value1, String value2) {
			addCriterion("name_katakana not between", value1, value2, "nameKatakana");
			return (Criteria) this;
		}

		public Criteria andGenderIsNull() {
			addCriterion("gender is null");
			return (Criteria) this;
		}

		public Criteria andGenderIsNotNull() {
			addCriterion("gender is not null");
			return (Criteria) this;
		}

		public Criteria andGenderEqualTo(String value) {
			addCriterion("gender =", value, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderNotEqualTo(String value) {
			addCriterion("gender <>", value, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderGreaterThan(String value) {
			addCriterion("gender >", value, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderGreaterThanOrEqualTo(String value) {
			addCriterion("gender >=", value, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderLessThan(String value) {
			addCriterion("gender <", value, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderLessThanOrEqualTo(String value) {
			addCriterion("gender <=", value, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderLike(String value) {
			addCriterion("gender like", value, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderNotLike(String value) {
			addCriterion("gender not like", value, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderIn(List<String> values) {
			addCriterion("gender in", values, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderNotIn(List<String> values) {
			addCriterion("gender not in", values, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderBetween(String value1, String value2) {
			addCriterion("gender between", value1, value2, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderNotBetween(String value1, String value2) {
			addCriterion("gender not between", value1, value2, "gender");
			return (Criteria) this;
		}

		public Criteria andBirthdayIsNull() {
			addCriterion("birthday is null");
			return (Criteria) this;
		}

		public Criteria andBirthdayIsNotNull() {
			addCriterion("birthday is not null");
			return (Criteria) this;
		}

		public Criteria andBirthdayEqualTo(String value) {
			addCriterion("birthday =", value, "birthday");
			return (Criteria) this;
		}

		public Criteria andBirthdayNotEqualTo(String value) {
			addCriterion("birthday <>", value, "birthday");
			return (Criteria) this;
		}

		public Criteria andBirthdayGreaterThan(String value) {
			addCriterion("birthday >", value, "birthday");
			return (Criteria) this;
		}

		public Criteria andBirthdayGreaterThanOrEqualTo(String value) {
			addCriterion("birthday >=", value, "birthday");
			return (Criteria) this;
		}

		public Criteria andBirthdayLessThan(String value) {
			addCriterion("birthday <", value, "birthday");
			return (Criteria) this;
		}

		public Criteria andBirthdayLessThanOrEqualTo(String value) {
			addCriterion("birthday <=", value, "birthday");
			return (Criteria) this;
		}

		public Criteria andBirthdayLike(String value) {
			addCriterion("birthday like", value, "birthday");
			return (Criteria) this;
		}

		public Criteria andBirthdayNotLike(String value) {
			addCriterion("birthday not like", value, "birthday");
			return (Criteria) this;
		}

		public Criteria andBirthdayIn(List<String> values) {
			addCriterion("birthday in", values, "birthday");
			return (Criteria) this;
		}

		public Criteria andBirthdayNotIn(List<String> values) {
			addCriterion("birthday not in", values, "birthday");
			return (Criteria) this;
		}

		public Criteria andBirthdayBetween(String value1, String value2) {
			addCriterion("birthday between", value1, value2, "birthday");
			return (Criteria) this;
		}

		public Criteria andBirthdayNotBetween(String value1, String value2) {
			addCriterion("birthday not between", value1, value2, "birthday");
			return (Criteria) this;
		}

		public Criteria andJoinedDateIsNull() {
			addCriterion("joined_date is null");
			return (Criteria) this;
		}

		public Criteria andJoinedDateIsNotNull() {
			addCriterion("joined_date is not null");
			return (Criteria) this;
		}

		public Criteria andJoinedDateEqualTo(String value) {
			addCriterion("joined_date =", value, "joinedDate");
			return (Criteria) this;
		}

		public Criteria andJoinedDateNotEqualTo(String value) {
			addCriterion("joined_date <>", value, "joinedDate");
			return (Criteria) this;
		}

		public Criteria andJoinedDateGreaterThan(String value) {
			addCriterion("joined_date >", value, "joinedDate");
			return (Criteria) this;
		}

		public Criteria andJoinedDateGreaterThanOrEqualTo(String value) {
			addCriterion("joined_date >=", value, "joinedDate");
			return (Criteria) this;
		}

		public Criteria andJoinedDateLessThan(String value) {
			addCriterion("joined_date <", value, "joinedDate");
			return (Criteria) this;
		}

		public Criteria andJoinedDateLessThanOrEqualTo(String value) {
			addCriterion("joined_date <=", value, "joinedDate");
			return (Criteria) this;
		}

		public Criteria andJoinedDateLike(String value) {
			addCriterion("joined_date like", value, "joinedDate");
			return (Criteria) this;
		}

		public Criteria andJoinedDateNotLike(String value) {
			addCriterion("joined_date not like", value, "joinedDate");
			return (Criteria) this;
		}

		public Criteria andJoinedDateIn(List<String> values) {
			addCriterion("joined_date in", values, "joinedDate");
			return (Criteria) this;
		}

		public Criteria andJoinedDateNotIn(List<String> values) {
			addCriterion("joined_date not in", values, "joinedDate");
			return (Criteria) this;
		}

		public Criteria andJoinedDateBetween(String value1, String value2) {
			addCriterion("joined_date between", value1, value2, "joinedDate");
			return (Criteria) this;
		}

		public Criteria andJoinedDateNotBetween(String value1, String value2) {
			addCriterion("joined_date not between", value1, value2, "joinedDate");
			return (Criteria) this;
		}

		public Criteria andEmailIsNull() {
			addCriterion("email is null");
			return (Criteria) this;
		}

		public Criteria andEmailIsNotNull() {
			addCriterion("email is not null");
			return (Criteria) this;
		}

		public Criteria andEmailEqualTo(String value) {
			addCriterion("email =", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotEqualTo(String value) {
			addCriterion("email <>", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailGreaterThan(String value) {
			addCriterion("email >", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailGreaterThanOrEqualTo(String value) {
			addCriterion("email >=", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailLessThan(String value) {
			addCriterion("email <", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailLessThanOrEqualTo(String value) {
			addCriterion("email <=", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailLike(String value) {
			addCriterion("email like", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotLike(String value) {
			addCriterion("email not like", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailIn(List<String> values) {
			addCriterion("email in", values, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotIn(List<String> values) {
			addCriterion("email not in", values, "email");
			return (Criteria) this;
		}

		public Criteria andEmailBetween(String value1, String value2) {
			addCriterion("email between", value1, value2, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotBetween(String value1, String value2) {
			addCriterion("email not between", value1, value2, "email");
			return (Criteria) this;
		}

		public Criteria andAddressIsNull() {
			addCriterion("address is null");
			return (Criteria) this;
		}

		public Criteria andAddressIsNotNull() {
			addCriterion("address is not null");
			return (Criteria) this;
		}

		public Criteria andAddressEqualTo(String value) {
			addCriterion("address =", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressNotEqualTo(String value) {
			addCriterion("address <>", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressGreaterThan(String value) {
			addCriterion("address >", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressGreaterThanOrEqualTo(String value) {
			addCriterion("address >=", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressLessThan(String value) {
			addCriterion("address <", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressLessThanOrEqualTo(String value) {
			addCriterion("address <=", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressLike(String value) {
			addCriterion("address like", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressNotLike(String value) {
			addCriterion("address not like", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressIn(List<String> values) {
			addCriterion("address in", values, "address");
			return (Criteria) this;
		}

		public Criteria andAddressNotIn(List<String> values) {
			addCriterion("address not in", values, "address");
			return (Criteria) this;
		}

		public Criteria andAddressBetween(String value1, String value2) {
			addCriterion("address between", value1, value2, "address");
			return (Criteria) this;
		}

		public Criteria andAddressNotBetween(String value1, String value2) {
			addCriterion("address not between", value1, value2, "address");
			return (Criteria) this;
		}

		public Criteria andTelNoIsNull() {
			addCriterion("tel_no is null");
			return (Criteria) this;
		}

		public Criteria andTelNoIsNotNull() {
			addCriterion("tel_no is not null");
			return (Criteria) this;
		}

		public Criteria andTelNoEqualTo(String value) {
			addCriterion("tel_no =", value, "telNo");
			return (Criteria) this;
		}

		public Criteria andTelNoNotEqualTo(String value) {
			addCriterion("tel_no <>", value, "telNo");
			return (Criteria) this;
		}

		public Criteria andTelNoGreaterThan(String value) {
			addCriterion("tel_no >", value, "telNo");
			return (Criteria) this;
		}

		public Criteria andTelNoGreaterThanOrEqualTo(String value) {
			addCriterion("tel_no >=", value, "telNo");
			return (Criteria) this;
		}

		public Criteria andTelNoLessThan(String value) {
			addCriterion("tel_no <", value, "telNo");
			return (Criteria) this;
		}

		public Criteria andTelNoLessThanOrEqualTo(String value) {
			addCriterion("tel_no <=", value, "telNo");
			return (Criteria) this;
		}

		public Criteria andTelNoLike(String value) {
			addCriterion("tel_no like", value, "telNo");
			return (Criteria) this;
		}

		public Criteria andTelNoNotLike(String value) {
			addCriterion("tel_no not like", value, "telNo");
			return (Criteria) this;
		}

		public Criteria andTelNoIn(List<String> values) {
			addCriterion("tel_no in", values, "telNo");
			return (Criteria) this;
		}

		public Criteria andTelNoNotIn(List<String> values) {
			addCriterion("tel_no not in", values, "telNo");
			return (Criteria) this;
		}

		public Criteria andTelNoBetween(String value1, String value2) {
			addCriterion("tel_no between", value1, value2, "telNo");
			return (Criteria) this;
		}

		public Criteria andTelNoNotBetween(String value1, String value2) {
			addCriterion("tel_no not between", value1, value2, "telNo");
			return (Criteria) this;
		}

		public Criteria andKykTypeIsNull() {
			addCriterion("kyk_type is null");
			return (Criteria) this;
		}

		public Criteria andKykTypeIsNotNull() {
			addCriterion("kyk_type is not null");
			return (Criteria) this;
		}

		public Criteria andKykTypeEqualTo(String value) {
			addCriterion("kyk_type =", value, "kykType");
			return (Criteria) this;
		}

		public Criteria andKykTypeNotEqualTo(String value) {
			addCriterion("kyk_type <>", value, "kykType");
			return (Criteria) this;
		}

		public Criteria andKykTypeGreaterThan(String value) {
			addCriterion("kyk_type >", value, "kykType");
			return (Criteria) this;
		}

		public Criteria andKykTypeGreaterThanOrEqualTo(String value) {
			addCriterion("kyk_type >=", value, "kykType");
			return (Criteria) this;
		}

		public Criteria andKykTypeLessThan(String value) {
			addCriterion("kyk_type <", value, "kykType");
			return (Criteria) this;
		}

		public Criteria andKykTypeLessThanOrEqualTo(String value) {
			addCriterion("kyk_type <=", value, "kykType");
			return (Criteria) this;
		}

		public Criteria andKykTypeLike(String value) {
			addCriterion("kyk_type like", value, "kykType");
			return (Criteria) this;
		}

		public Criteria andKykTypeNotLike(String value) {
			addCriterion("kyk_type not like", value, "kykType");
			return (Criteria) this;
		}

		public Criteria andKykTypeIn(List<String> values) {
			addCriterion("kyk_type in", values, "kykType");
			return (Criteria) this;
		}

		public Criteria andKykTypeNotIn(List<String> values) {
			addCriterion("kyk_type not in", values, "kykType");
			return (Criteria) this;
		}

		public Criteria andKykTypeBetween(String value1, String value2) {
			addCriterion("kyk_type between", value1, value2, "kykType");
			return (Criteria) this;
		}

		public Criteria andKykTypeNotBetween(String value1, String value2) {
			addCriterion("kyk_type not between", value1, value2, "kykType");
			return (Criteria) this;
		}

		public Criteria andJobStatIsNull() {
			addCriterion("job_stat is null");
			return (Criteria) this;
		}

		public Criteria andJobStatIsNotNull() {
			addCriterion("job_stat is not null");
			return (Criteria) this;
		}

		public Criteria andJobStatEqualTo(String value) {
			addCriterion("job_stat =", value, "jobStat");
			return (Criteria) this;
		}

		public Criteria andJobStatNotEqualTo(String value) {
			addCriterion("job_stat <>", value, "jobStat");
			return (Criteria) this;
		}

		public Criteria andJobStatGreaterThan(String value) {
			addCriterion("job_stat >", value, "jobStat");
			return (Criteria) this;
		}

		public Criteria andJobStatGreaterThanOrEqualTo(String value) {
			addCriterion("job_stat >=", value, "jobStat");
			return (Criteria) this;
		}

		public Criteria andJobStatLessThan(String value) {
			addCriterion("job_stat <", value, "jobStat");
			return (Criteria) this;
		}

		public Criteria andJobStatLessThanOrEqualTo(String value) {
			addCriterion("job_stat <=", value, "jobStat");
			return (Criteria) this;
		}

		public Criteria andJobStatLike(String value) {
			addCriterion("job_stat like", value, "jobStat");
			return (Criteria) this;
		}

		public Criteria andJobStatNotLike(String value) {
			addCriterion("job_stat not like", value, "jobStat");
			return (Criteria) this;
		}

		public Criteria andJobStatIn(List<String> values) {
			addCriterion("job_stat in", values, "jobStat");
			return (Criteria) this;
		}

		public Criteria andJobStatNotIn(List<String> values) {
			addCriterion("job_stat not in", values, "jobStat");
			return (Criteria) this;
		}

		public Criteria andJobStatBetween(String value1, String value2) {
			addCriterion("job_stat between", value1, value2, "jobStat");
			return (Criteria) this;
		}

		public Criteria andJobStatNotBetween(String value1, String value2) {
			addCriterion("job_stat not between", value1, value2, "jobStat");
			return (Criteria) this;
		}

		public Criteria andUserRoleIsNull() {
			addCriterion("user_role is null");
			return (Criteria) this;
		}

		public Criteria andUserRoleIsNotNull() {
			addCriterion("user_role is not null");
			return (Criteria) this;
		}

		public Criteria andUserRoleEqualTo(String value) {
			addCriterion("user_role =", value, "userRole");
			return (Criteria) this;
		}

		public Criteria andUserRoleNotEqualTo(String value) {
			addCriterion("user_role <>", value, "userRole");
			return (Criteria) this;
		}

		public Criteria andUserRoleGreaterThan(String value) {
			addCriterion("user_role >", value, "userRole");
			return (Criteria) this;
		}

		public Criteria andUserRoleGreaterThanOrEqualTo(String value) {
			addCriterion("user_role >=", value, "userRole");
			return (Criteria) this;
		}

		public Criteria andUserRoleLessThan(String value) {
			addCriterion("user_role <", value, "userRole");
			return (Criteria) this;
		}

		public Criteria andUserRoleLessThanOrEqualTo(String value) {
			addCriterion("user_role <=", value, "userRole");
			return (Criteria) this;
		}

		public Criteria andUserRoleLike(String value) {
			addCriterion("user_role like", value, "userRole");
			return (Criteria) this;
		}

		public Criteria andUserRoleNotLike(String value) {
			addCriterion("user_role not like", value, "userRole");
			return (Criteria) this;
		}

		public Criteria andUserRoleIn(List<String> values) {
			addCriterion("user_role in", values, "userRole");
			return (Criteria) this;
		}

		public Criteria andUserRoleNotIn(List<String> values) {
			addCriterion("user_role not in", values, "userRole");
			return (Criteria) this;
		}

		public Criteria andUserRoleBetween(String value1, String value2) {
			addCriterion("user_role between", value1, value2, "userRole");
			return (Criteria) this;
		}

		public Criteria andUserRoleNotBetween(String value1, String value2) {
			addCriterion("user_role not between", value1, value2, "userRole");
			return (Criteria) this;
		}

		public Criteria andDelFlgIsNull() {
			addCriterion("del_flg is null");
			return (Criteria) this;
		}

		public Criteria andDelFlgIsNotNull() {
			addCriterion("del_flg is not null");
			return (Criteria) this;
		}

		public Criteria andDelFlgEqualTo(String value) {
			addCriterion("del_flg =", value, "delFlg");
			return (Criteria) this;
		}

		public Criteria andDelFlgNotEqualTo(String value) {
			addCriterion("del_flg <>", value, "delFlg");
			return (Criteria) this;
		}

		public Criteria andDelFlgGreaterThan(String value) {
			addCriterion("del_flg >", value, "delFlg");
			return (Criteria) this;
		}

		public Criteria andDelFlgGreaterThanOrEqualTo(String value) {
			addCriterion("del_flg >=", value, "delFlg");
			return (Criteria) this;
		}

		public Criteria andDelFlgLessThan(String value) {
			addCriterion("del_flg <", value, "delFlg");
			return (Criteria) this;
		}

		public Criteria andDelFlgLessThanOrEqualTo(String value) {
			addCriterion("del_flg <=", value, "delFlg");
			return (Criteria) this;
		}

		public Criteria andDelFlgLike(String value) {
			addCriterion("del_flg like", value, "delFlg");
			return (Criteria) this;
		}

		public Criteria andDelFlgNotLike(String value) {
			addCriterion("del_flg not like", value, "delFlg");
			return (Criteria) this;
		}

		public Criteria andDelFlgIn(List<String> values) {
			addCriterion("del_flg in", values, "delFlg");
			return (Criteria) this;
		}

		public Criteria andDelFlgNotIn(List<String> values) {
			addCriterion("del_flg not in", values, "delFlg");
			return (Criteria) this;
		}

		public Criteria andDelFlgBetween(String value1, String value2) {
			addCriterion("del_flg between", value1, value2, "delFlg");
			return (Criteria) this;
		}

		public Criteria andDelFlgNotBetween(String value1, String value2) {
			addCriterion("del_flg not between", value1, value2, "delFlg");
			return (Criteria) this;
		}

		public Criteria andInsertDateIsNull() {
			addCriterion("insert_date is null");
			return (Criteria) this;
		}

		public Criteria andInsertDateIsNotNull() {
			addCriterion("insert_date is not null");
			return (Criteria) this;
		}

		public Criteria andInsertDateEqualTo(Date value) {
			addCriterion("insert_date =", value, "insertDate");
			return (Criteria) this;
		}

		public Criteria andInsertDateNotEqualTo(Date value) {
			addCriterion("insert_date <>", value, "insertDate");
			return (Criteria) this;
		}

		public Criteria andInsertDateGreaterThan(Date value) {
			addCriterion("insert_date >", value, "insertDate");
			return (Criteria) this;
		}

		public Criteria andInsertDateGreaterThanOrEqualTo(Date value) {
			addCriterion("insert_date >=", value, "insertDate");
			return (Criteria) this;
		}

		public Criteria andInsertDateLessThan(Date value) {
			addCriterion("insert_date <", value, "insertDate");
			return (Criteria) this;
		}

		public Criteria andInsertDateLessThanOrEqualTo(Date value) {
			addCriterion("insert_date <=", value, "insertDate");
			return (Criteria) this;
		}

		public Criteria andInsertDateIn(List<Date> values) {
			addCriterion("insert_date in", values, "insertDate");
			return (Criteria) this;
		}

		public Criteria andInsertDateNotIn(List<Date> values) {
			addCriterion("insert_date not in", values, "insertDate");
			return (Criteria) this;
		}

		public Criteria andInsertDateBetween(Date value1, Date value2) {
			addCriterion("insert_date between", value1, value2, "insertDate");
			return (Criteria) this;
		}

		public Criteria andInsertDateNotBetween(Date value1, Date value2) {
			addCriterion("insert_date not between", value1, value2, "insertDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateIsNull() {
			addCriterion("update_date is null");
			return (Criteria) this;
		}

		public Criteria andUpdateDateIsNotNull() {
			addCriterion("update_date is not null");
			return (Criteria) this;
		}

		public Criteria andUpdateDateEqualTo(Date value) {
			addCriterion("update_date =", value, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateNotEqualTo(Date value) {
			addCriterion("update_date <>", value, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateGreaterThan(Date value) {
			addCriterion("update_date >", value, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
			addCriterion("update_date >=", value, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateLessThan(Date value) {
			addCriterion("update_date <", value, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
			addCriterion("update_date <=", value, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateIn(List<Date> values) {
			addCriterion("update_date in", values, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateNotIn(List<Date> values) {
			addCriterion("update_date not in", values, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateBetween(Date value1, Date value2) {
			addCriterion("update_date between", value1, value2, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
			addCriterion("update_date not between", value1, value2, "updateDate");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table t001_user
	 * @mbggenerated  Sat Aug 15 10:48:28 JST 2015
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t001_user
     *
     * @mbggenerated do_not_delete_during_merge Fri Aug 14 01:10:04 JST 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}