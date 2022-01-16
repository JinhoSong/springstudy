package com.display.springstudy.live.service;

import com.display.springstudy.live.model.PostDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PostService {
    List<PostDto> getAllPost();
}
