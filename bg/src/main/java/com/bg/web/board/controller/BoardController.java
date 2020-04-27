package com.bg.web.board.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.bg.web.board.model.BoardVO;
import com.bg.web.board.service.BoardService;

@Controller
@RequestMapping(value = "/board")
public class BoardController {
    
    @Inject
    private BoardService boardService;
    
    @RequestMapping(value = "/getBoardList", method = RequestMethod.GET)
    public String getBoardList(Model model) throws Exception {
        model.addAttribute("boardList", boardService.getBoardList());
        return "contents/board/boardList.tiles";
    }
    
    @RequestMapping("/boardForm")
    public String boardForm(@ModelAttribute("boardVO") BoardVO vo, Model model) {
        return "contents/board/boardForm.tiles";
    }
    
    @RequestMapping(value = "/saveBoard", method = RequestMethod.POST)
    public String saveBoard(@ModelAttribute("boardVO") BoardVO boardVO, @RequestParam("mode") String mode, RedirectAttributes rttr) throws Exception {
        if (mode.equals("edit")) {
            boardService.updateBoard(boardVO);
        } else {
            boardService.insertBoard(boardVO);
        }
        return "redirect:contents/board/getBoardList.tiles";
    }
    
    @RequestMapping(value = "/deleteBoard", method = RequestMethod.GET)
    public String deleteBoard(RedirectAttributes rttr, @RequestParam("bid") int bid) throws Exception {
        boardService.deleteBoard(bid);
        return "redirect:contents/board/getBoardList";
    }
    
    @RequestMapping(value = "/getBoardContent", method = RequestMethod.GET)
    public String getBoardContent(Model model, @RequestParam("bid") int bid) throws Exception {
        model.addAttribute("boardContent", boardService.getBoardContent(bid));
        return "contents/board/boardContent.tiles";
    }
    
    @RequestMapping(value = "/editForm", method = RequestMethod.GET)
    public String editForm(@RequestParam("bid") int bid, @RequestParam("mode") String mode, Model model) throws Exception {
        model.addAttribute("boardContent", boardService.getBoardContent(bid));
        model.addAttribute("mode", mode);
        model.addAttribute("boardVO", new BoardVO());
        return "contents/board/boardForm";
    }
}
