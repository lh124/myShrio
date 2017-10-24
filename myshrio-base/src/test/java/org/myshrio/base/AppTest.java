package org.myshrio.base;


import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.util.Factory;

import junit.framework.TestCase;
public class AppTest  extends TestCase{
	public void testApp(){
		Factory<org.apache.shiro.mgt.SecurityManager> factory=new IniSecurityManagerFactory("classpath:shrio.ini");
		org.apache.shiro.mgt.SecurityManager manager=factory.getInstance();
		SecurityUtils.setSecurityManager(manager);
		org.apache.shiro.subject.Subject subject=SecurityUtils.getSubject();
		AuthenticationToken authenticationToken=new UsernamePasswordToken("mldn", "1234");
		subject.login(authenticationToken);
		System.out.println("用户名:"+authenticationToken.getPrincipal());
		System.out.println("密码："+authenticationToken.getCredentials());

	}
}
