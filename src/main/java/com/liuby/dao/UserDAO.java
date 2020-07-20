package com.liuby.dao;

import com.liuby.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDAO {
    User findById(Integer id);
}