package com.display.springstudy.service;

import com.display.springstudy.model.PostDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PostService {
    List<PostDto> getAllPost();
}
