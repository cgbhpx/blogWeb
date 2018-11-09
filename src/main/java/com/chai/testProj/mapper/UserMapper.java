package com.chai.testProj.mapper;

import com.chai.testProj.model.UserDao;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    @Insert("INSERT INTO user(user_id,user_name,user_pwd) VALUES(#{userId},#{userName},#{userPwd})")
    int addUser(UserDao userDao);

    @Select("SELECT user_id as userId FROM user WHERE is_delete='0'")
    List<UserDao> queryUser();

    @Select("SELECT *  FROM user WHERE user_id=#{userId}")
    List<UserDao> queryUserById(long userId);

    @Update("UPDATE user SET user_name=#{userName},user_pwd=#{userPwd},user_email=#{userEmail}" +
            ",user_phone=#{userPhone},update_date=#{updateDate} WHERE user_id=userId and is_delete='0'")
    List<UserDao> updateUser(UserDao userDao);

    @Update("UPDATE user SET is_delete='1' WHERE user_id=#{userId}")
    int deleteUser(long userId);
}
