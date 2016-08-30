/***************************************************************************
 *
 * This document contains confidential and proprietary information 
 * subject to non-disclosure agreements with AsiaInspection. This 
 * information shall not be distributed or copied without written 
 * permission from the AsiaInspection.
 *
 ***************************************************************************/

package com.yuepa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yuepa.bean.UserBean;
import com.yuepa.service.UserService;

/***************************************************************************
 *<PRE>
 *  Project Name    : yuepa-service
 * 
 *  Package Name    : com.yuepa.controller
 * 
 *  File Name       : UserController.java
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
@RestController
@RequestMapping("/user")
public class UserController extends AbstractController {
	@Autowired
	@Qualifier("userService")
	private UserService userService;
	
	@RequestMapping(value = "/users",method = RequestMethod.GET)
	public UserBean getUser(){
		return userService.getUser();
	}
}
