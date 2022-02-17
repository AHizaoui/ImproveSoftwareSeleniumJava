package com.improvefr.improvesoftware ;

public class UserAccountDTO {
	private String username;
	private String password;
	private String tabDevloppment;
	private String tabIstqb; 
	
	
	/**
	 * @return the tabIstqb
	 */
	
	public String gettabIstqb() {
		return tabIstqb;
	}
	/**
	 * @param setIstqb the setIstqb to set
	 */
	public void settabIstqb(String tabIstqb) {
		this.tabIstqb = tabIstqb ;
	}
	
	/**
	 * @return the username
	 */
	public String getusername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setusername(String username) {
		this.username = username;
	}
	
	/**
	 * @return the tabDevloppment
	 */
	public String getTabDevloppment() {
		return tabDevloppment;
	}
	/**
	 * @param TabDevloppment the TabDevloppment to set
	 */
	public void setTabDevloppment(String tabDevloppment) {
		this.tabDevloppment = tabDevloppment;
	}
	/**
	 * @return the password
	 */
	public String getpassword() {
		return password;
	}
	/**
	 * @param theme the theme to set
	 */
	public void setpassword(String password) {
		this.password = password;
	}

	

//	public String gettabDevloppment () {
//		return tabDevloppment;
//	}
//	
//	public void settabDevloppment(String tabDevloppment) {
//		this.tabDevloppment = tabDevloppment;
//	}
}
