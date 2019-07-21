package com.minelan.shiro.realm;

import com.minelan.console.service.UserService;
import com.minelan.entity.TbUser;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import javax.annotation.Resource;

public class UserRealm extends AuthorizingRealm {

    @Resource
    private UserService userService;
    /**
     * 授权
     * @param principals
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        return null;
    }

    /**
     * 认证
     * @param token
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        //根据用户名查询用户信息
        String username = (String) token.getPrincipal();
        TbUser user = userService.selectByUsername(username);
        if (null == user){
            throw new AccountException("用户名或密码错误");
        }
        if(!user.getPassword().equals(new String((char[]) token.getCredentials()))){
            throw new AccountException("用户名或密码错误");
        }
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(username,user.getPassword(),getName());
        return info;
    }
}
