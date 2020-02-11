package com.nacl.securitydy.service;

import com.nacl.securitydy.bean.User;
import com.nacl.securitydy.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * @author 赵益江
 * @version 1.0
 * @date 2020/2/11 13:21
 */
public class UserService implements UserDetailsService {
    @Autowired
    UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userMapper.loadUserByUsername(username);
        if (user == null) {
            new UsernameNotFoundException("用户名不存在");
        }
        user.setRoles(userMapper.getUserRolesById(user.getId()));
        return user;
    }
}
