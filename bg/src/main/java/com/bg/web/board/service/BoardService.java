package com.bg.web.board.service;

import java.util.List;

import com.bg.web.board.model.BoardVO;

public interface BoardService {
    public List<BoardVO> getBoardList() throws Exception;
}
