package com.bg.web.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class AdminDAOImpl {
    @Inject
    private SqlSession sqlSession;
    
    
}
