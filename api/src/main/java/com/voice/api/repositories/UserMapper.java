package com.voice.api.repositories;

import com.voice.api.Dtos.UserInfo;
import com.voice.api.domains.UserEntity;
import com.voice.api.repositories.users.UserSqlsProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
    @Insert("insert into user(username,password) values (#{userName},#{password})")
    int insert(UserInfo userInfo);

    @InsertProvider(type = UserSqlsProvider.class, method = "batchInsert")
    int batchInsert(@Param("list") List<UserInfo> users);
}
