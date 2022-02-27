package com.display.springstudy.video.service;


import com.display.springstudy.video.model.Video;
import com.display.springstudy.video.model.VideoCriteria;
import com.display.springstudy.video.repository.VideoRepository;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VideoService {

    private final VideoRepository videoRepository;

    public List<Video> selectVideoList() {
        return videoRepository.selectVideoList();
    }

    public PageInfo<Video> selectVideoPageList(VideoCriteria criteria){
        PageHelper.startPage(criteria.getPageNum(), criteria.getPageSize());
        return new PageInfo<Video>(videoRepository.selectVideoPageList(criteria));
    }
}
