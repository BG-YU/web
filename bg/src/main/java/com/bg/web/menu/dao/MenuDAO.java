package com.bg.web.menu.dao;

import java.util.List;

import com.bg.web.menu.model.MenuVO;

public interface MenuDAO {
    public List<MenuVO> getCateList() throws Exception;
}
