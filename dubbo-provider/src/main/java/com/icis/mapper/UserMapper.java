package com.icis.mapper;
import com.icis.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    //根据用户id 查询用户
    @Select("select * from user where id=#{uid}")
    public User getUserById(Integer uid);
}
