package com.display.springstudy.post.controller;

import com.display.springstudy.post.model.PostDto;
import com.display.springstudy.post.service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/live")
public class LiveController {

    private final PostService postService;

    public LiveController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/main")
    public String liveAdmin(Model model) {
        List<PostDto> postDtoList = postService.getAllPost();
        model.addAttribute("posts",postDtoList);
        return "live/liveMain";
    }

}
