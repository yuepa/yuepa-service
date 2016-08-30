/***************************************************************************
 *
 * This document contains confidential and proprietary information 
 * subject to non-disclosure agreements with AsiaInspection. This 
 * information shall not be distributed or copied without written 
 * permission from the AsiaInspection.
 *
 ***************************************************************************/

package com.yuepa.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


/***************************************************************************
 *<PRE>
 *  Project Name    : yuepa-service
 * 
 *  Package Name    : com.yuepa.beans
 * 
 *  File Name       : User.java
 * 
 *  Creation Date   : Aug 30, 2016
 * 
 *  Author          : Leo
 * 
 *  Purpose         : TODO
 * 
 * 
 *  History         : TODO
 * 
 *</PRE>
 ***************************************************************************/
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserBean {
	private String userName;
	private String password;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
