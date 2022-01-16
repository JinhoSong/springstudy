package com.display.springstudy.live.serviceImpl;

import com.display.springstudy.live.model.PostDto;
import com.display.springstudy.live.repository.PostRepository;
import com.display.springstudy.live.service.PostService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    private PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public List<PostDto> getAllPost() {
        return postRepository.getAllPost();
    }
}
