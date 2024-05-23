package com.example.project5.mapper;

import com.example.project5.model.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    public List<User> findAll();
    public void createUser(User user);
}
