package com.display.springstudy.video.controller;

import com.display.springstudy.category.model.Category;
import com.display.springstudy.category.service.CategoryService;
import com.display.springstudy.video.model.Video;
import com.display.springstudy.video.model.VideoPageCriteria;
import com.display.springstudy.video.service.VideoService;
import com.github.pagehelper.PageInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class VideoController {

    private final VideoService videoService;

    @RequestMapping("/video")
    public String video(VideoPageCriteria criteria, Model model){

        PageInfo<Video> videoPageInfo = videoService.selectVideoPageList(criteria);

        model.addAttribute("videoPageInfo",videoPageInfo);

        return "video/videoList";
    }

    @RequestMapping("/videoList")
    public String videoList(VideoPageCriteria criteria, Model model){
        PageInfo<Video> videoPageInfo = videoService.selectVideoPageList(criteria);

        model.addAttribute("videoPageInfo",videoPageInfo);

        return "video/videoList :: #videoListContainer";
    }

}
