package com.voice.api.repositories.users;

import com.voice.api.Dtos.UserInfo;
import com.voice.api.domains.UserEntity;
import com.voice.api.repositories.users.UserSqlsProvider;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    @Insert("insert into user(username,password) values (#{userName},#{password})")
    int insert(UserInfo userInfo);

    @Select("select count(1) from user where username=#{account} and password = #{password}")
    boolean isUserExist(@Param("account") String account,@Param("password") String password);

    @InsertProvider(type = UserSqlsProvider.class, method = "batchInsert")
    int batchInsert(@Param("list") List<UserInfo> users);
}
