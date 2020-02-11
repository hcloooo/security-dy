package com.nacl.securitydy.service;

import com.nacl.securitydy.bean.Menu;
import com.nacl.securitydy.mapper.MenuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 赵益江
 * @version 1.0
 * @date 2020/2/11 0011 14:31
 */
@Service
public class MenuService {
    @Autowired
    MenuMapper menuMapper;

    public List<Menu> getAllMenus() {
        return menuMapper.getAllMenus();
    }
}
