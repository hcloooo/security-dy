package com.nacl.securitydy.mapper;

import com.nacl.securitydy.bean.Role;
import com.nacl.securitydy.bean.User;

import java.util.List;

/**
 * @author 赵益江
 * @version 1.0
 * @date 2020/2/11 0011 13:22
 */
public interface UserMapper {

    User loadUserByUsername(String username);

    List<Role> getUserRolesById(Integer id);
}
