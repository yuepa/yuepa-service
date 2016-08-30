/***************************************************************************
 *
 * This document contains confidential and proprietary information 
 * subject to non-disclosure agreements with AsiaInspection. This 
 * information shall not be distributed or copied without written 
 * permission from the AsiaInspection.
 *
 ***************************************************************************/

package com.yuepa.dao.mapper;

import java.util.List;
import java.util.Map;

import com.yuepa.bean.UserBean;

/***************************************************************************
 *<PRE>
 *  Project Name    : yuepa-service
 * 
 *  Package Name    : com.yuepa.dao.mapper
 * 
 *  File Name       : UserMapper.java
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
public interface UserMapper {
	public List<UserBean> getUser(Map<String,Object> param);
}
