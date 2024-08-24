package com.telusko.service;

import com.telusko.model.Blog;

import javax.swing.plaf.PanelUI;
import java.util.List;

public interface BlogService {

    public List<Blog> getAllBlogs();
    Blog fetchBlogById(Integer id);
}
