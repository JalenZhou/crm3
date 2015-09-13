package com.model;
import java.sql.Timestamp;
public class UserLog {
	private Integer logID;
	private Timestamp logDate;
	private String ip;
	private String userName;
	private String modelName;
	private String executeResult;
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getExecuteResult() {
		return executeResult;
	}
	public void setExecuteResult(String executeResult) {
		this.executeResult = executeResult;
	}
	public Integer getLogID() {
		return logID;
	}
	public void setLogID(Integer logID) {
		this.logID = logID;
	}
	private Integer userID;
	public Integer getUserID() {
		return userID;
	}
	public void setUserID(Integer userID) {
		this.userID = userID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	public Timestamp getLogDate() {
		return logDate;
	}
	public void setLogDate(Timestamp logDate) {
		this.logDate = logDate;
	}
	

	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	
}
