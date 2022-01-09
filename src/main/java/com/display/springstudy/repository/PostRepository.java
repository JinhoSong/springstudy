package com.display.springstudy.repository;

import com.display.springstudy.model.PostDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface PostRepository {

    List<PostDto> getAllPost();

}
