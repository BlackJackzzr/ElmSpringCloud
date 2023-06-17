package com.example.userserver10100.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.userserver10100.po.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 周门
 * Date: 2023-06-11
 * Time: 15:41
 */
@Mapper
public interface UserDao extends BaseMapper<User> {
    @Select("select * from user where user_id=#{userId} and password=#{password}")
    public User getUserByIdByPassword(String userId, String password);

    @Select("select * from user where user_id=#{userId}")
    public User getUserById(String userId);
}
