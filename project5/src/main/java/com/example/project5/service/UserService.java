package com.example.project5.service;

import com.example.project5.model.User;
import com.example.project5.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserMapper userMapper;

    @Autowired
    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public List<User> findAll() {
        List<User> userList = null;
        try {
            userList = userMapper.findAll();
        } catch (Exception e) {
            System.out.println("데이터베이스 연결 실패: 사용자 호출 err");
        }
        return userList;
    }
    public void createUser(User user) {
        userMapper.createUser(user);
    }
}
