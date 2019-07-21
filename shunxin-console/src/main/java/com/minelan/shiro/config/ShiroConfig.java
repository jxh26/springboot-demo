package com.minelan.shiro.config;

import com.minelan.shiro.realm.UserRealm;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class ShiroConfig {


    @Bean
    public ShiroFilterFactoryBean shrioFilter(){
        ShiroFilterFactoryBean shiroFilter = new ShiroFilterFactoryBean();

        shiroFilter.setLoginUrl("/login");
        shiroFilter.setSuccessUrl("/index");
        shiroFilter.setSecurityManager(securityManager());

        //配置拦截器
        Map<String,String> filterChainDefinitionMap  = new HashMap<String, String>();
        filterChainDefinitionMap.put("/static/**","anon");
        filterChainDefinitionMap.put("/login/","anon");
        filterChainDefinitionMap.put("/**","authc");
        shiroFilter.setFilterChainDefinitionMap(filterChainDefinitionMap);
        return shiroFilter;
    }

    @Bean
    public SecurityManager securityManager(){
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        securityManager.setRealm(myUserRealm());
        return  securityManager;
    }

    @Bean
    public UserRealm myUserRealm(){
        return  new UserRealm();
    }
}
