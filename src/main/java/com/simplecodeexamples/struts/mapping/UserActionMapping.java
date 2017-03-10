package com.simplecodeexamples.struts.mapping;

import org.apache.struts.action.ActionMapping;

public class UserActionMapping extends ActionMapping{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected boolean requireSignIn = false;
	protected String role;
	protected String userType;
	
	protected boolean disabled = false;
	
	public UserActionMapping() {
		super();
	}

	public boolean getRequireSignIn() {
		return requireSignIn;
	}

	public void setRequireSignIn(boolean requireSignIn) {
		this.requireSignIn = requireSignIn;
	}

	/**
	 * Returns the role.
	 * @return String
	 */
	public String getRole() {
		return role;
	}

	/**
	 * Sets the role.
	 * @param role The role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}

	/**
	 * @return
	 */
	public String getUserType() {
		return userType;
	}

	/**
	 * @param string
	 */
	public void setUserType(String string) {
		userType = string;
	}

	public boolean isDisabled() {
		return disabled;
	}

	public void setDisabled(boolean disabled) {
		this.disabled = disabled;
	}

}
