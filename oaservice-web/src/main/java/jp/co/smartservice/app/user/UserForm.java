package jp.co.smartservice.app.user;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import jp.co.smartservice.app.common.validation.DateStringFormat;

public class UserForm implements Serializable {

	private static final long serialVersionUID = 1L;

	public static interface UserRegister{};

	public static interface UserUpdate{};

	public static interface UserDelete{};

	private String keywords;

	private String userId;

	private String password;

	@NotNull
	@Size(min = 1, max = 30)
	private String nameKanji;

	@NotNull
	@Size(min = 1, max = 30)
	private String nameKatakana;

	@NotEmpty
	@Size(min = 1, max = 1)
	private String gender;

	@DateStringFormat(pattern = "yyyyMMdd")
	private String birthday;

	@DateStringFormat(pattern = "yyyyMMdd")
	private String joinedDate;

	@NotNull
	@Email
	@Size(min = 1, max = 100)
	private String email;

	@Size(max = 300)
	private String address;

	@Size(max = 20)
	@Pattern(regexp = "[0-9\\-]*")
	private String telNo;

	@NotEmpty
	@Size(min = 1, max = 1)
	private String kykType;

	private String jobStat;

	private String userRole;

	private String delFlg;

	private Date insertDate;

	private Date updateDate;

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNameKanji() {
		return nameKanji;
	}

	public void setNameKanji(String nameKanji) {
		this.nameKanji = nameKanji;
	}

	public String getNameKatakana() {
		return nameKatakana;
	}

	public void setNameKatakana(String nameKatakana) {
		this.nameKatakana = nameKatakana;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getJoinedDate() {
		return joinedDate;
	}

	public void setJoinedDate(String joinedDate) {
		this.joinedDate = joinedDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelNo() {
		return telNo;
	}

	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}

	public String getKykType() {
		return kykType;
	}

	public void setKykType(String kykType) {
		this.kykType = kykType;
	}

	public String getJobStat() {
		return jobStat;
	}

	public void setJobStat(String jobStat) {
		this.jobStat = jobStat;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public String getDelFlg() {
		return delFlg;
	}

	public void setDelFlg(String delFlg) {
		this.delFlg = delFlg;
	}

	public Date getInsertDate() {
		return insertDate;
	}

	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
}