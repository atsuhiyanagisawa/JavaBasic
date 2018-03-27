package practice13.common;

public class Employee extends practice13.common.Person {


	private String departmentNm;
	private int departmentCnt;

	public String getDepartmentNm(){
		return this.departmentNm;
	}
	public int departmentCnt() {
		return this.departmentCnt;
	}
	public void setDepartmentNm(String name) {
		this.departmentNm = name;
	}
	public void setDepartmentCnt(int n) {
		this.departmentCnt = n;
	}
}
