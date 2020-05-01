package com.bg.web.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.bg.web.dao.MenuDAO;
import com.bg.web.model.MenuVO;

@Service
public class MenuServiceImpl implements MenuService {

    @Inject
    private MenuDAO menuDAO;

    @Override
    public List<MenuVO> getMenuList(String sParam) throws Exception {
        return menuDAO.getMenuList(sParam);
    }

    @Override
    public int insertMenuList(MenuVO menuVO) throws Exception {
        return menuDAO.insertMenuList(menuVO);
    }

    @Override
    public int updateMenuList(MenuVO menuVO) throws Exception {
        return menuDAO.updateMenuList(menuVO);
    }

    @Override
    public int deleteMenuList(MenuVO menuVO) throws Exception {
        return menuDAO.deleteMenuList(menuVO);
    }
}
