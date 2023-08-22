package com.sky.facebook.service;

import com.sky.facebook.model.Post;

import java.util.List;

public interface PostService {

    Post addPost(Post post) throws Exception;

    List<Post> getPost();
}
