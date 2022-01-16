package com.display.springstudy.live.repository;

import com.display.springstudy.live.model.PostDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface PostRepository {

    List<PostDto> getAllPost();

}
