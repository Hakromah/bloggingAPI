package com.telusko.service;

import com.telusko.exception.BlogNotFoundException;
import com.telusko.model.Blog;
import com.telusko.repo.BlogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogServiceImpl implements BlogService {


    private BlogRepo blogRepo;

    @Autowired
    public void setBlogRepo(BlogRepo blogRepo) {
        this.blogRepo = blogRepo;
    }

    @Override
    public List<Blog> getAllBlogs() {
        return blogRepo.findAll();
    }

    @Override
    public Blog fetchBlogById(Integer id) {
        return blogRepo.findById(id).orElseThrow(() -> new BlogNotFoundException("Blog not found with id: " + id));
    }
}
