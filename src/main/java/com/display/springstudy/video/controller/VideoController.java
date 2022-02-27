package com.display.springstudy.video.controller;

import com.display.springstudy.video.model.Video;
import com.display.springstudy.video.model.VideoCriteria;
import com.display.springstudy.video.service.VideoService;
import com.github.pagehelper.PageInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
public class VideoController {

    private final VideoService videoService;

    @RequestMapping("/video")
    public String video(VideoCriteria criteria, Model model){

        PageInfo<Video> videoPageInfo = videoService.selectVideoPageList(criteria);

        model.addAttribute("videoPageInfo",videoPageInfo);

        return "video/videoList";
    }

    @RequestMapping("/videoList")
    public String videoList(VideoCriteria criteria, Model model){
        PageInfo<Video> videoPageInfo = videoService.selectVideoPageList(criteria);

        model.addAttribute("videoPageInfo",videoPageInfo);

        return "video/videoList :: #videoListContainer";
    }

}
