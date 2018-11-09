package com.chai.testProj.service.impl;

import com.chai.testProj.mapper.BlogMapper;
import com.chai.testProj.model.BlogDao;
import com.chai.testProj.service.BlogService;
import com.chai.testProj.utils.CreateId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    private BlogMapper blogMapper;

    @Override
    public int addBlog(BlogDao blogDao) {
        blogDao.setCreateData(new Date());
        blogDao.setBlogId(Integer.parseInt(new CreateId().getUUID()));
        return blogMapper.addBlog(blogDao);
    }

    @Override
    public List<BlogDao> queryBlog() {
        return blogMapper.queryBlog();
    }

    @Override
    public List<BlogDao> queryBlogById(String userId) {
        return blogMapper.queryBlogById(Integer.parseInt(userId));
    }

    @Override
    public List<BlogDao> updateBlog(BlogDao blogDao) {
        blogDao.setUpdateDate(new Date());
        return blogMapper.updateBlog(blogDao);
    }

    @Override
    public int deleteBlog(long userId) {
        return blogMapper.deleteBlog(userId);
    }
}
