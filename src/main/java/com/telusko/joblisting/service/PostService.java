package com.telusko.joblisting.service;

import com.telusko.joblisting.model.Post;
import com.telusko.joblisting.repository.PostRepository;
import com.telusko.joblisting.repository.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    PostRepository repo;

    @Autowired
    SearchRepository searchRepo;

    public List<Post> getPosts() {
        return repo.findAll();
    }

    public List<Post> getPosts(String text) {
        return searchRepo.findByText(text);
    }

    public Post addPost(Post post) {
        return repo.save(post);
    }
}
