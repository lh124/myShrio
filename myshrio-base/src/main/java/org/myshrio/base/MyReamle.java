package org.myshrio.base;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.realm.Realm;

public class MyReamle /*implements Realm*/{

	/*@Override
	public String getName() {
		return "shrio-myrealm";
	}

	@Override
	public boolean supports(AuthenticationToken token) {
		return token instanceof UsernamePasswordToken;
	}
	@Override
	public AuthenticationInfo getAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
	String mid=(String) token.getPrincipal();
	String password=new String(((char[])token.getCredentials()));
	if(!"mldn".equals(mid)) {
		throw new UnknownAccountException("用户不存在");
	}
	if(!"1234".equals(password)) {
		throw new IncorrectCredentialsException("用户名或密码错误");
	}
		return new SimpleAuthenticationInfo(token.getPrincipal(), token.getCredentials(),this.getName());
	}*/
}
