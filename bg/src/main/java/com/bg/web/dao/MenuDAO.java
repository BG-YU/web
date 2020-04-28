package com.bg.web.dao;

import java.util.List;

import com.bg.web.model.MenuVO;

public interface MenuDAO {
    public List<MenuVO> getCateList() throws Exception;
}
