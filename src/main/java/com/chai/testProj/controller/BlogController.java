package com.chai.testProj.controller;

import com.chai.testProj.model.BlogDao;
import com.chai.testProj.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

public class BlogController {
    @Autowired
    private BlogService blogService;

    @RequestMapping(value = "/addBlog",method = RequestMethod.POST)
    public String addBlog(@Valid BlogDao blogDao){
        blogDao.setBlogTitle(blogDao.getBlogTitle());
        blogDao.setBlogContent(blogDao.getBlogContent());
        blogDao.setUserId(blogDao.getUserId());
        int result = blogService.addBlog(blogDao);
        return "200";
    }


    @RequestMapping(value ="/queryBlog",method = RequestMethod.POST)
    public List queryBlog(){
        return blogService.queryBlog();
    }

    @RequestMapping(value = "/queryBlogById",method = RequestMethod.POST)
    public List queryBlogById(String blogId){
        return blogService.queryBlogById(blogId);
    }

    @RequestMapping(value = "/updateBlog",method = RequestMethod.POST)
    public List updateBlog(BlogDao blogDao){
        return blogService.updateBlog(blogDao);
    }

    @RequestMapping(value = "/deleteBlog",method = RequestMethod.POST)
    public int deleteBlog(long blogId){
        return blogService.deleteBlog(blogId);
    }
}
