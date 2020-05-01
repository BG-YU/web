package com.bg.web.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bg.web.model.MenuVO;
import com.bg.web.service.MenuService;

@Controller
@RequestMapping(value = "/menu")
public class MenuController {
    @Inject
    private MenuService menuService;

    @RequestMapping(value = "/getMenuList", method = RequestMethod.GET)
    public String getMenuList(@RequestParam("param") String sParam, Model model) throws Exception {
        String sUrl;
        
        model.addAttribute("menuList", menuService.getMenuList(sParam));
        if(sParam.equals("admin")) {
            model.addAttribute("nomalMenuList", menuService.getMenuList("nomal"));
            sUrl = "admin/menu/adminMenuForm.tiles";
        }else {
            sUrl = "contents/menu/menu.tiles";
        }
        return sUrl;
    }
    
    @RequestMapping(value = "/insertMenuList", method = RequestMethod.POST)
    public String insertMenuList(@ModelAttribute("menuVO") MenuVO menuVO, Model model) throws Exception{
        menuService.insertMenuList(menuVO);
        return "";
    }
}
