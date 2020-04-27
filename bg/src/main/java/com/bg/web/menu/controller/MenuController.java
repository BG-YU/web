package com.bg.web.menu.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bg.web.menu.model.MenuVO;
import com.bg.web.menu.service.MenuService;

@Controller
@RequestMapping(value = "/menu")
public class MenuController {
    @Inject
    private MenuService menuService;
    
    @RequestMapping("/getMenuList")
    public String boardForm(@ModelAttribute("menuVO") MenuVO vo, Model model) {
        return "contents/board/boardForm.tiles";
    }
}
