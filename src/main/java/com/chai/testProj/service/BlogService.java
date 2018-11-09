package com.chai.testProj.service;

import com.chai.testProj.model.BlogDao;

import java.util.List;

public interface BlogService {
    int addBlog(BlogDao blogDao);

    List<BlogDao> queryBlog();

    List<BlogDao> queryBlogById(String userId);

    List<BlogDao> updateBlog(BlogDao blogDao);

    int deleteBlog(long userId);
}
