package com.bg.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/crawling")
public class CrawlingController {
    @RequestMapping(value = "/getCrawlingList")
    public String getCrawlingList(Model model) throws Exception {
        return "contents/crawling/crawlingContent.tiles";
    }
}
