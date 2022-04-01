package com.display.springstudy.video.rest.v1;

import com.display.springstudy.video.model.VideoCriteria;
import com.display.springstudy.video.service.VideoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/video")
@RequiredArgsConstructor
public class VideoRestController {

    private final VideoService videoService;

    @PostMapping
    public int insertVideo(VideoCriteria criteria){
        return videoService.insert(criteria);
    }

}
