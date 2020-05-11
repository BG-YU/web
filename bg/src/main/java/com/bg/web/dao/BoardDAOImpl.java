package com.bg.web.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.bg.web.model.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO {

    @Inject
    private SqlSession sqlSession;

    @Override
    public List<BoardVO> getBoardList(BoardVO boardVO) throws Exception {
        return sqlSession.selectList("com.bg.web.board.boardMapper.getBoardList", boardVO);
    }
    
    @Override
    public BoardVO getBoardCount(BoardVO boardVO) throws Exception {
        return sqlSession.selectOne("com.bg.web.board.boardMapper.getBoardCount", boardVO);
    }
    
    @Override
    public BoardVO getBoardContent(int bid) throws Exception {
        return sqlSession.selectOne("com.bg.web.board.boardMapper.getBoardContent", bid);
    }

    @Override
    public int insertBoard(BoardVO boardVO) throws Exception {
        return sqlSession.insert("com.bg.web.board.boardMapper.insertBoard", boardVO);
    }

    @Override
    public int updateBoard(BoardVO boardVO) throws Exception {
        return sqlSession.update("com.bg.web.board.boardMapper.updateBoard", boardVO);
    }

    @Override
    public int deleteBoard(int bid) throws Exception {
        return sqlSession.insert("com.bg.web.board.boardMapper.deleteBoard", bid);
    }

    @Override
    public int updateViewCnt(int bid) throws Exception {
        return sqlSession.update("com.bg.web.board.boardMapper.updateViewCnt", bid);
    }
}
