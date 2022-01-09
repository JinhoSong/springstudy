package com.display.springstudy.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
public class PostDto {

    private String userId;
    private String postId;
    private String postTitle;
    private String postContent;

    public static final class Builder {
        private String userId;

        public Builder(String userId, String postId, String postTitle, String postContent) {
            this.userId = userId;
            this.postId = postId;
            this.postTitle = postTitle;
            this.postContent = postContent;
        }

        private String postId;
        private String postTitle;
        private String postContent;

        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public Builder postId(String postId) {
            this.postId = postId;
            return this;
        }

        public Builder postTitle(String postTitle) {
            this.postTitle = postTitle;
            return this;
        }

        public Builder postContent(String postContent) {
            this.postContent = postContent;
            return this;
        }

        public PostDto build() {
            return new PostDto(this);
        }
    }
    public PostDto(Builder builder) {
        userId = builder.userId;
        postId = builder.postId;
        postTitle = builder.postTitle;
        postContent = builder.postContent;
    }
}
