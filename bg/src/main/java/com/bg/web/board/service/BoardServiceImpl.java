package com.bg.web.board.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.bg.web.board.dao.BoardDAO;
import com.bg.web.board.model.BoardVO;

@Service
public class BoardServiceImpl implements BoardService{
    @Inject
    private BoardDAO boardDAO;
    
    @Override
    public List<BoardVO> getBoardList() throws Exception {
        return boardDAO.getBoardList();
    }
}
