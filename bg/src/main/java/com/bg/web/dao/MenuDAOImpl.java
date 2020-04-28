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
    public List<MenuVO> getCateList() throws Exception {
        return sqlSession.selectList("com.bg.web.menu.menuMapper.getCateList");
    }

}
