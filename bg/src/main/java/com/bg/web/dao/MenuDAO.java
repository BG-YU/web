package com.bg.web.dao;

import java.util.List;

import com.bg.web.model.MenuVO;

public interface MenuDAO {
    public List<MenuVO> getMenuList(String sParam) throws Exception;
    public int insertMenuList(MenuVO menuVO) throws Exception;
    public int deleteMenuList(MenuVO menuVO) throws Exception;
    public int updateMenuList(MenuVO menuVO) throws Exception;
}
