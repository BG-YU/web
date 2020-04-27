package com.bg.web;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bg.web.board.service.BoardService;
import com.bg.web.menu.service.MenuService;

@Controller
public class HomeController {
    @Inject
    private BoardService boardService;
    
    @Inject
    private MenuService menuService;
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Model model) throws Exception{
        model.addAttribute("boardList", boardService.getBoardList());
        model.addAttribute("menuList", menuService.getCateList());
        return "contents/board/boardList.tiles";
    }
}
