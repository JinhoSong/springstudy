package com.display.springstudy.video.repository;


import com.display.springstudy.video.model.Video;
import com.display.springstudy.video.model.VideoCriteria;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface VideoRepository {

    List<Video> selectVideoList();

    Page<Video> selectVideoPageList(VideoCriteria criteria);
}
