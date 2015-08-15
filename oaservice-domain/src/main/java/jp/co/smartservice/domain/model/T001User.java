package jp.co.smartservice.domain.model;

import java.io.Serializable;
import java.util.Date;

public class T001User extends T001UserKey implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t001_user.password
	 * @mbggenerated  Sat Aug 15 10:48:28 JST 2015
	 */
	private String password;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t001_user.name_kanji
	 * @mbggenerated  Sat Aug 15 10:48:28 JST 2015
	 */
	private String nameKanji;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t001_user.name_katakana
	 * @mbggenerated  Sat Aug 15 10:48:28 JST 2015
	 */
	private String nameKatakana;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t001_user.gender
	 * @mbggenerated  Sat Aug 15 10:48:28 JST 2015
	 */
	private String gender;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t001_user.birthday
	 * @mbggenerated  Sat Aug 15 10:48:28 JST 2015
	 */
	private String birthday;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t001_user.joined_date
	 * @mbggenerated  Sat Aug 15 10:48:28 JST 2015
	 */
	private String joinedDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t001_user.email
	 * @mbggenerated  Sat Aug 15 10:48:28 JST 2015
	 */
	private String email;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t001_user.address
	 * @mbggenerated  Sat Aug 15 10:48:28 JST 2015
	 */
	private String address;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t001_user.tel_no
	 * @mbggenerated  Sat Aug 15 10:48:28 JST 2015
	 */
	private String telNo;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t001_user.kyk_type
	 * @mbggenerated  Sat Aug 15 10:48:28 JST 2015
	 */
	private String kykType;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t001_user.job_stat
	 * @mbggenerated  Sat Aug 15 10:48:28 JST 2015
	 */
	private String jobStat;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t001_user.user_role
	 * @mbggenerated  Sat Aug 15 10:48:28 JST 2015
	 */
	private String userRole;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t001_user.del_flg
	 * @mbggenerated  Sat Aug 15 10:48:28 JST 2015
	 */
	private String delFlg;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t001_user.insert_date
	 * @mbggenerated  Sat Aug 15 10:48:28 JST 2015
	 */
	private Date insertDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t001_user.update_date
	 * @mbggenerated  Sat Aug 15 10:48:28 JST 2015
	 */
	private Date updateDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table t001_user
	 * @mbggenerated  Sat Aug 15 10:48:28 JST 2015
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t001_user.password
	 * @return  the value of t001_user.password
	 * @mbggenerated  Sat Aug 15 10:48:28 JST 2015
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t001_user.password
	 * @param password  the value for t001_user.password
	 * @mbggenerated  Sat Aug 15 10:48:28 JST 2015
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t001_user.name_kanji
	 * @return  the value of t001_user.name_kanji
	 * @mbggenerated  Sat Aug 15 10:48:28 JST 2015
	 */
	public String getNameKanji() {
		return nameKanji;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t001_user.name_kanji
	 * @param nameKanji  the value for t001_user.name_kanji
	 * @mbggenerated  Sat Aug 15 10:48:28 JST 2015
	 */
	public void setNameKanji(String nameKanji) {
		this.nameKanji = nameKanji;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t001_user.name_katakana
	 * @return  the value of t001_user.name_katakana
	 * @mbggenerated  Sat Aug 15 10:48:28 JST 2015
	 */
	public String getNameKatakana() {
		return nameKatakana;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t001_user.name_katakana
	 * @param nameKatakana  the value for t001_user.name_katakana
	 * @mbggenerated  Sat Aug 15 10:48:28 JST 2015
	 */
	public void setNameKatakana(String nameKatakana) {
		this.nameKatakana = nameKatakana;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t001_user.gender
	 * @return  the value of t001_user.gender
	 * @mbggenerated  Sat Aug 15 10:48:28 JST 2015
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t001_user.gender
	 * @param gender  the value for t001_user.gender
	 * @mbggenerated  Sat Aug 15 10:48:28 JST 2015
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t001_user.birthday
	 * @return  the value of t001_user.birthday
	 * @mbggenerated  Sat Aug 15 10:48:28 JST 2015
	 */
	public String getBirthday() {
		return birthday;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t001_user.birthday
	 * @param birthday  the value for t001_user.birthday
	 * @mbggenerated  Sat Aug 15 10:48:28 JST 2015
	 */
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t001_user.joined_date
	 * @return  the value of t001_user.joined_date
	 * @mbggenerated  Sat Aug 15 10:48:28 JST 2015
	 */
	public String getJoinedDate() {
		return joinedDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t001_user.joined_date
	 * @param joinedDate  the value for t001_user.joined_date
	 * @mbggenerated  Sat Aug 15 10:48:28 JST 2015
	 */
	public void setJoinedDate(String joinedDate) {
		this.joinedDate = joinedDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t001_user.email
	 * @return  the value of t001_user.email
	 * @mbggenerated  Sat Aug 15 10:48:28 JST 2015
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t001_user.email
	 * @param email  the value for t001_user.email
	 * @mbggenerated  Sat Aug 15 10:48:28 JST 2015
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t001_user.address
	 * @return  the value of t001_user.address
	 * @mbggenerated  Sat Aug 15 10:48:28 JST 2015
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t001_user.address
	 * @param address  the value for t001_user.address
	 * @mbggenerated  Sat Aug 15 10:48:28 JST 2015
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t001_user.tel_no
	 * @return  the value of t001_user.tel_no
	 * @mbggenerated  Sat Aug 15 10:48:28 JST 2015
	 */
	public String getTelNo() {
		return telNo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t001_user.tel_no
	 * @param telNo  the value for t001_user.tel_no
	 * @mbggenerated  Sat Aug 15 10:48:28 JST 2015
	 */
	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t001_user.kyk_type
	 * @return  the value of t001_user.kyk_type
	 * @mbggenerated  Sat Aug 15 10:48:28 JST 2015
	 */
	public String getKykType() {
		return kykType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t001_user.kyk_type
	 * @param kykType  the value for t001_user.kyk_type
	 * @mbggenerated  Sat Aug 15 10:48:28 JST 2015
	 */
	public void setKykType(String kykType) {
		this.kykType = kykType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t001_user.job_stat
	 * @return  the value of t001_user.job_stat
	 * @mbggenerated  Sat Aug 15 10:48:28 JST 2015
	 */
	public String getJobStat() {
		return jobStat;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t001_user.job_stat
	 * @param jobStat  the value for t001_user.job_stat
	 * @mbggenerated  Sat Aug 15 10:48:28 JST 2015
	 */
	public void setJobStat(String jobStat) {
		this.jobStat = jobStat;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t001_user.user_role
	 * @return  the value of t001_user.user_role
	 * @mbggenerated  Sat Aug 15 10:48:28 JST 2015
	 */
	public String getUserRole() {
		return userRole;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t001_user.user_role
	 * @param userRole  the value for t001_user.user_role
	 * @mbggenerated  Sat Aug 15 10:48:28 JST 2015
	 */
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t001_user.del_flg
	 * @return  the value of t001_user.del_flg
	 * @mbggenerated  Sat Aug 15 10:48:28 JST 2015
	 */
	public String getDelFlg() {
		return delFlg;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t001_user.del_flg
	 * @param delFlg  the value for t001_user.del_flg
	 * @mbggenerated  Sat Aug 15 10:48:28 JST 2015
	 */
	public void setDelFlg(String delFlg) {
		this.delFlg = delFlg;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t001_user.insert_date
	 * @return  the value of t001_user.insert_date
	 * @mbggenerated  Sat Aug 15 10:48:28 JST 2015
	 */
	public Date getInsertDate() {
		return insertDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t001_user.insert_date
	 * @param insertDate  the value for t001_user.insert_date
	 * @mbggenerated  Sat Aug 15 10:48:28 JST 2015
	 */
	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t001_user.update_date
	 * @return  the value of t001_user.update_date
	 * @mbggenerated  Sat Aug 15 10:48:28 JST 2015
	 */
	public Date getUpdateDate() {
		return updateDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t001_user.update_date
	 * @param updateDate  the value for t001_user.update_date
	 * @mbggenerated  Sat Aug 15 10:48:28 JST 2015
	 */
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	@Override
    public int hashCode() {
        int hash = 0;
        hash += (getUserId() != null ? getUserId().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // not set
        if (!(object instanceof T001User)) {
            return false;
        }
        T001User other = (T001User) object;
        if ((this.getUserId() == null && other.getUserId() != null)
                || (this.getUserId() != null && !this.getUserId().equals(other.getUserId()))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jp.co.smartservice.domain.model.T001User[ userId=" + this.getUserId() + " ]";
    }

}