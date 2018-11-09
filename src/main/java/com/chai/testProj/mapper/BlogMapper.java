package com.chai.testProj.mapper;

import com.chai.testProj.model.BlogDao;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface BlogMapper {
    @Insert("INSERT INTO blog(blog_id,user_id,blog_title,blog_content" +
            ",is_top,create_date,is_delete)" +
            " VALUES(#{blogId},#{userId},#{blogTitle},#{blogContent},'0',#{createDate},'0')")
    int addBlog(BlogDao blogDao);

    @Select("SELECT blog_id as blogId FROM blog WHERE is_delete='0'")
    List<BlogDao> queryBlog();

    @Select("SELECT *  FROM blog WHERE blog_id=#{blogId}")
    List<BlogDao> queryBlogById(long blogId);

    @Update("UPDATE blog SET blog_title=#{blogTitle},blog_content=#{blogContent}" +
            ",is_top=#{isTop},update_date=#{updateDate} WHERE blog_id=#{blogId} " +
            "and user_id=#{userId} and is_delete='0'")
    List<BlogDao> updateBlog(BlogDao blogDao);

    @Update("UPDATE blog SET is_delete='1' WHERE blog_id=#{blogId}")
    int deleteBlog(long blogId);
}
