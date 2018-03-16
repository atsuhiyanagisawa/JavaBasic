/*
 * Student.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice12.common;

/**
 * 受講生の情報を格納します
 * @author Rhizome
 *
 */
public class Student {
	/** 受講生ID */
	private int studentId;

	/** 受講生氏名 */
	private String studentName;

	/** 会社名 */
	private String companyName;

	/** 教室名 */
	private String className;

	/** メールアドレス */
	private String mail;

	/** パスワード */
	private String password;

	//setter and getter

	public int getStudentId() {
		return this.studentId;
	}
	public String getStudentName() {
		return this.studentName;
	}
	public String getCompanyName() {
		return this.companyName;
	}
	public String getClassName() {
		return this.className;
	}
	public String getMail() {
		return this.mail;
	}
	public String getPassword() {
		return this.password;
	}


	public void setStudentId(int a) {
		this.studentId = a;
	}
	public void setStudentName(String a) {
		this.studentName = a;
	}
	public void setCompanyName(String a) {
		this.companyName = a;
	}
	public void setClassName(String a) {
		this.className = a;
	}
	public void setMail(String a) {
		this.mail = a;
	}
	public void setPassword(String a) {
		this.password = a;
	}
}
