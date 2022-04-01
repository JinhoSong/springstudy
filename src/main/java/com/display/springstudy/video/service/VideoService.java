package com.display.springstudy.video.service;


import com.display.springstudy.video.model.Video;
import com.display.springstudy.video.model.VideoCriteria;
import com.display.springstudy.video.model.VideoPageCriteria;
import com.display.springstudy.video.repository.VideoRepository;
import com.display.springstudy.video.repository.info.VideoInfoReposistory;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class VideoService {

    private final VideoRepository videoRepository;
    private final VideoInfoReposistory videoInfoReposistory;

    public List<Video> selectVideoList() {
        return videoRepository.selectVideoList();
    }

    public PageInfo<Video> selectVideoPageList(VideoPageCriteria criteria){
        PageHelper.startPage(criteria.getPageNum(), criteria.getPageSize());
        return new PageInfo<Video>(videoRepository.selectVideoPageList(criteria));
    }

    public int insert(VideoCriteria criteria) {

        Video video = new Video();
        BeanUtils.copyProperties(criteria,video);
        LocalDateTime insDtm = getCurrentTime();

        //videoRepository.insertVideo(video);


        return 0;
    }

    public LocalDateTime getCurrentTime(){
        return LocalDateTime.now();
    }

}
