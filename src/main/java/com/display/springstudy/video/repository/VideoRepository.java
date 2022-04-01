package com.display.springstudy.video.repository;


import com.display.springstudy.video.model.Video;
import com.display.springstudy.video.model.VideoPageCriteria;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface VideoRepository {

    List<Video> selectVideoList();

    Page<Video> selectVideoPageList(VideoPageCriteria criteria);

    void insertVideo(Video video);
}
