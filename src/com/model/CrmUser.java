package com.model;

import java.util.Date;

/**
 * CrmUser entity. @author MyEclipse Persistence Tools
 */
public class CrmUser extends AbstractCrmUser implements java.io.Serializable {

	private String deptName;

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	/** default constructor */
	public CrmUser() {
	}

	/** full constructor */
	public CrmUser(String userName, String userPwd, String userRole,
			Date userDate,  String userStatus,Integer deptID) {
		super(userName, userPwd, userRole, userDate, userStatus,deptID);
	}

}
