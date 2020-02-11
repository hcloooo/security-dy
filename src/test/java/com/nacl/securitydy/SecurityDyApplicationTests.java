package com.nacl.securitydy;

import com.nacl.securitydy.bean.Menu;
import com.nacl.securitydy.service.MenuService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SecurityDyApplicationTests {
    @Autowired
    MenuService menuService;

    @Test
    void contextLoads() {
        List<Menu> menus = menuService.getAllMenus();
        System.out.println(menus);
        for (Menu menu : menus) {
            System.out.println(menu);
        }
    }

}
