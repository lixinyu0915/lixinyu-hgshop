package com.lixinyu.hgshop.service.impl;

import javax.annotation.Resource;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.lixinyu.hgshop.config.AdminProperties;
import com.lixinyu.hgshop.service.UserService;

/**
 * 
 * @author 
 *
 */
@Service(interfaceClass=UserService.class,version="1.0.0")
public class UserServiceImpl implements UserService{
	
	// 得到管理员的信息
	@Resource
	AdminProperties adminPro;

	@Override
	public boolean login(String userName, String passWord) {
		
		// TODO Auto-generated method stub
		//判断用户和密码是否与配置文件一致
		return (adminPro.getAdminName().equals(userName) 
				&& adminPro.getPassword().equals(passWord));
		
		
	}

}
