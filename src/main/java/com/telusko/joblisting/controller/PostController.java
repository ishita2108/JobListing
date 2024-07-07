package com.telusko.joblisting.controller;

import com.telusko.joblisting.model.Post;
import com.telusko.joblisting.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    PostService service;

    @GetMapping("/posts")
    public List<Post> fetchAllPost(){
        return service.getPosts();
    }

    @GetMapping("/posts/{text}")
    public List<Post> search(@PathVariable String text){
        return service.getPosts(text);
    }

    @PostMapping("/posts")
    public Post addPost(@RequestBody Post post){
        return service.addPost(post);
    }


}
