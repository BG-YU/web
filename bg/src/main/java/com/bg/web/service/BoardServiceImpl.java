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
        int fromPage = 0;
        fromPage = (page - 1) * 5;
        
        BoardVO vo = new BoardVO();
        vo.setCate_cd(cate_cd);
        vo.setPage(fromPage);
        return boardDAO.getBoardList(vo);
    }

    @Override
    public BoardVO getBoardCount(String cate_cd) throws Exception {
        BoardVO vo = new BoardVO();
        vo.setCate_cd(cate_cd);
        return boardDAO.getBoardCount(vo);
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
