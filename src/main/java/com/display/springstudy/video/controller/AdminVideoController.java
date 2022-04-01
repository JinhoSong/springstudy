package com.display.springstudy.video.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/admin")
public class AdminVideoController {

    @RequestMapping("/video/insert")
    public String insertVideo(Model model){

        return "video/admin/insert";
    }

    @RequestMapping("test")
    public String test(){
        return "";
    }

}
