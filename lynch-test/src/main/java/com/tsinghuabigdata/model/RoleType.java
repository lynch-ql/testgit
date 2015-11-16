package com.tsinghuabigdata.model;

public enum RoleType {
	
	ADMIN("admin"),
	USER("user"),
	MEMBER("member");
	private String rolename;
	
	RoleType(String rolename){
		this.rolename = rolename;
	};
	
	public String getValue(){
		return this.rolename;
	}
	
	public static RoleType parse(String type){
		RoleType roleType = null;
		for (RoleType obj : RoleType.values()) {
			if (obj.getValue().equals(type)) {
				roleType = obj;
				break;
			}
		}
		return roleType;
	};
	
}
