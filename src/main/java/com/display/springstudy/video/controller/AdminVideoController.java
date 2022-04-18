package com.display.springstudy.video.controller;

import com.display.springstudy.actor.model.Actor;
import com.display.springstudy.actor.service.ActorService;
import com.display.springstudy.category.model.Category;
import com.display.springstudy.category.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/admin/video")
public class AdminVideoController {

    private final CategoryService categoryService;

    private final ActorService actorService;

    @RequestMapping("/insert")
    public String insertVideo(Model model){

        List<Category> categoryList  = categoryService.selectCategories();

        model.addAttribute("categoryList",categoryList);

        return "video/admin/insert";
    }
    @RequestMapping("/actor")
    public String getActor(@RequestParam("actorNm") String actorNm, Model model) {

        List<Actor> actorList = actorService.getActor(actorNm);

        model.addAttribute("actorList", actorList);

        return "video/admin/insert :: #actorListContainer";
    }
    @RequestMapping("test")
    public String test(@RequestParam("actorNm") String actorNm, Model model) {
        System.out.println("1234");
        System.out.println("1234");
        System.out.println("1234");
        System.out.println("1234");
        System.out.println("1234");
        System.out.println("22");

        return "";
    }

}
