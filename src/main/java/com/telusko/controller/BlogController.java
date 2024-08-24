package com.telusko.controller;

import com.telusko.model.Blog;
import com.telusko.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class BlogController {


    private BlogService blogService;

    @Autowired
    public void setBlogService(BlogService blogService) {
        this.blogService = blogService;
    }

    @GetMapping("/blog")
    public ResponseEntity<List<Blog>> getAllBlogs() {
        List<Blog> blogList = blogService.getAllBlogs();
        return ResponseEntity.ok(blogList);
    }

    @GetMapping("/blog/{id}")
    public Blog fetchBlogById(@PathVariable("id") Integer id) {
        return blogService.fetchBlogById(id);
    }
}
