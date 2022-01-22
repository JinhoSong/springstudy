package com.display.springstudy.post.service;

import com.display.springstudy.post.model.PostDto;
import com.display.springstudy.post.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    private final PostRepository postRepository;

    public List<PostDto> getAllPost() {
        return postRepository.getAllPost();
    }
}
