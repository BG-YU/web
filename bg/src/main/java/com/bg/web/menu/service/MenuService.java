package com.bg.web.menu.service;

import java.util.List;

import com.bg.web.menu.model.MenuVO;

public interface MenuService {
    public List<MenuVO> getCateList() throws Exception;
}
