package cn.hpe.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;


import cn.hpe.pojo.User;
@Mapper
public interface UserMapper {
	
	public List<User> listAll();
}
