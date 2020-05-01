package com.bg.web.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.bg.web.model.MenuVO;

@Repository
public class MenuDAOImpl implements MenuDAO {

    @Inject
    private SqlSession sqlSession;

    @Override
    public List<MenuVO> getMenuList(String sParam) throws Exception {
        return sqlSession.selectList("com.bg.web.menu.menuMapper.getMenuList", sParam);
    }
    
    @Override
    public int insertMenuList(MenuVO menuVO) throws Exception {
        return sqlSession.insert("com.bg.web.menu.menuMapper.insertMenuList", menuVO);
    }
    
    @Override
    public int updateMenuList(MenuVO menuVO) throws Exception {
        return sqlSession.update("com.bg.web.menu.menuMapper.updateMenuList", menuVO);
    }
    
    @Override
    public int deleteMenuList(MenuVO menuVO) throws Exception {
        return sqlSession.delete("com.bg.web.menu.menuMapper.deleteMenuList", menuVO);
    }
}