package com.example.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.domain.user.model.MUser;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

	public int insertOne(MUser user);

	public List<MUser> findMany(MUser user);

	public MUser findOne(String userId);

	public void updateOne(@Param("userId") String userId, @Param("password") String password, @Param("userName") String userName);

	public int deleteOne(@Param("userId") String userId);

	public MUser findLoginUser(String userId);
}
