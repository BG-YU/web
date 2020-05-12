package com.bg.web.service;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.bg.web.dao.BoardDAO;
import com.bg.web.model.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {
    @Inject
    private BoardDAO boardDAO;

    @Override
    public List<BoardVO> getBoardList(String cate_cd, int page) throws Exception {
        int page_start = 0;
        page_start = (page - 1) * 5;
        
        BoardVO vo = new BoardVO();
        vo.setCate_cd(cate_cd);
        vo.setPage(page_start);
        return boardDAO.getBoardList(vo);
    }
    
    @Override
    public BoardVO getBoardPaging(String cate_cd, int page_current) throws Exception {
        BoardVO boardVO = new BoardVO();
        int page_start = 0;
        int page_end = 0;
        int page_prev = 0;
        int page_next = 0;
        int page_calc = (page_current % 10) == 0 ? (((page_current - 1) / 10) * 10) : ((page_current / 10) * 10);
        int board_row_cnt = boardDAO.getBoardRowCount(cate_cd);
        
        page_start = page_calc + 1;
        page_end = page_calc + 10 > board_row_cnt ? board_row_cnt : page_calc + 10;
        page_prev = page_calc ;
        page_next = page_calc + 11;
        
        boardVO.setPage_current(page_current);
        boardVO.setPage_start(page_start);
        boardVO.setPage_end(page_end);
        boardVO.setPage_prev(page_prev);
        boardVO.setPage_next(page_next);
        boardVO.setBoard_row_cnt(board_row_cnt);
        return boardVO;
    }
    
    @Override
    public void insertBoard(BoardVO boardVO) throws Exception {
        boardDAO.insertBoard(boardVO);
    }

    @Override
    public void updateBoard(BoardVO boardVO) throws Exception {
        boardDAO.updateBoard(boardVO);
    }

    @Override
    public void deleteBoard(int bid) throws Exception {
        boardDAO.deleteBoard(bid);
    }

    @Override
    public BoardVO getBoardContent(int bid) throws Exception {
        boardDAO.updateViewCnt(bid);
        return boardDAO.getBoardContent(bid);
    }
}
