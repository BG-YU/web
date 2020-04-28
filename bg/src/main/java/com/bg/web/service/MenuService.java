package com.bg.web.service;

import java.util.List;

import com.bg.web.model.MenuVO;

public interface MenuService {
    public List<MenuVO> getCateList() throws Exception;
}
