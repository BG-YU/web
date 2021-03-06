package com.bg.web.dao;

import java.util.List;

import com.bg.web.model.BoardVO;

public interface BoardDAO {
    public List<BoardVO> getBoardList(BoardVO boardVO) throws Exception;

    public int getBoardRowCount(String cate_cd) throws Exception;
    
    public BoardVO getBoardContent(int bid) throws Exception;

    public int insertBoard(BoardVO boardVO) throws Exception;

    public int updateBoard(BoardVO boardVO) throws Exception;

    public int deleteBoard(int bid) throws Exception;

    public int updateViewCnt(int bid) throws Exception;
}
