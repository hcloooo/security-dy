package com.nacl.securitydy.bean;

import java.util.List;

/**
 * @author 赵益江
 * @version 1.0
 * @date 2020/2/11 0011 13:07
 */
public class Role {
    private Integer id;
    private String name;
    private String nameZh;
    private List<Menu> menus;

    public List<Menu> getMenus() {
        return menus;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameZh() {
        return nameZh;
    }

    public void setNameZh(String nameZh) {
        this.nameZh = nameZh;
    }
}