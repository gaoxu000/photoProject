package com.foam.photo.config;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;

/**
 * 功能描述
 *
 * @author gWX792602
 * @since 2021-05-17
 */
class UserRealm extends AuthorizingRealm {


    //授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        System.out.println("执行授权doGetAuthorizationInfo");
        return null;
    }

    //认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        System.out.println("执行认证doGetAuthenticationInfo");
        String userName = "root";
        String password = "123";
        UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) token;
        if (!usernamePasswordToken.getUsername().equals(userName)){
            return null;
        }
        return new SimpleAuthenticationInfo("",password,"");
    }
}
