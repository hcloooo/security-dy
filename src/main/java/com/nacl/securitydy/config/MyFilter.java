package com.nacl.securitydy.config;

import com.nacl.securitydy.bean.Menu;
import com.nacl.securitydy.bean.Role;
import com.nacl.securitydy.mapper.MenuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;

import java.util.Collection;
import java.util.List;

/**
 * @author 赵益江
 * @version 1.0
 * @date 2020/2/11 0011 14:25
 */
@Component
public class MyFilter implements FilterInvocationSecurityMetadataSource {
    AntPathMatcher antPathMatcher = new AntPathMatcher();
    @Autowired
    MenuMapper menuMapper;

    @Override
    public Collection<ConfigAttribute> getAttributes(Object o) throws IllegalArgumentException {
        String url = ((FilterInvocation) o).getRequestUrl();
        List<Menu> menus = menuMapper.getAllMenus();
        for (Menu menu : menus) {
            if (antPathMatcher.match(menu.getPattern(), url)) {
                List<Role> roles = menu.getRoles();
                String[] rolesStr = new String[roles.size()];
                for (int i = 0; i < roles.size(); i++) {
                    rolesStr[i] = roles.get(i).getName();
                }
                return SecurityConfig.createList(rolesStr);
            }
        }
        return SecurityConfig.createList("ROLE_login");
    }

    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return null;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return true;
    }
}
