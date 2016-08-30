/***************************************************************************
 *
 * This document contains confidential and proprietary information 
 * subject to non-disclosure agreements with AsiaInspection. This 
 * information shall not be distributed or copied without written 
 * permission from the AsiaInspection.
 *
 ***************************************************************************/

package com.yuepa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuepa.bean.UserBean;
import com.yuepa.dao.mapper.UserMapper;
import com.yuepa.service.AbstractService;
import com.yuepa.service.UserService;

/***************************************************************************
 *<PRE>
 *  Project Name    : yuepa-service
 * 
 *  Package Name    : com.yuepa.service.impl
 * 
 *  File Name       : UserServiceImpl.java
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
@Service("userService")
public class UserServiceImpl extends AbstractService  implements UserService  {
	
	@Autowired
	private UserMapper userMapper;
	@Override
	public UserBean getUser() {
		// TODO Auto-generated method stub
		return userMapper.getUser(null).get(0);
	}

}
