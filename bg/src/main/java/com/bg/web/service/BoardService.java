package com.bg.web.service;

import java.util.List;
import com.bg.web.model.BoardVO;

public interface BoardService {
    public List<BoardVO> getBoardList(String cate_cd, int page) throws Exception;
    
    public BoardVO getBoardPaging(String cate_cd, int page_start) throws Exception;

    public void insertBoard(BoardVO boardVO) throws Exception;

    public void updateBoard(BoardVO boardVO) throws Exception;

    public void deleteBoard(int bid) throws Exception;

    public BoardVO getBoardContent(int bid) throws Exception;
}
