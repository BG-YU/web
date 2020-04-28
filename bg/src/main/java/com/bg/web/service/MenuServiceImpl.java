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
    public List<MenuVO> getCateList() throws Exception {
        return menuDAO.getCateList();
    }
}
