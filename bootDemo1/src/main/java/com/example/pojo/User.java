package com.example.pojo;

public class User {
	private Integer user_id;
	private String user_name;
	private String user_pwd;
	private String user_type;
	private String user_extra;
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_pwd() {
		return user_pwd;
	}
	public void setUser_pwd(String user_pwd) {
		this.user_pwd = user_pwd;
	}
	public String getUser_type() {
		return user_type;
	}
	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}
	public String getUser_extra() {
		return user_extra;
	}
	public void setUser_extra(String user_extra) {
		this.user_extra = user_extra;
	}
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_name=" + user_name + ", user_pwd=" + user_pwd + ", user_type="
				+ user_type + ", user_extra=" + user_extra + "]";
	}
	
	
	
}
