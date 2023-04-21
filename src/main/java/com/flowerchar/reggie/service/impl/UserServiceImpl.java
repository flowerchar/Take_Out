package com.flowerchar.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.flowerchar.reggie.entity.User;
import com.flowerchar.reggie.mapper.UserMapper;
import com.flowerchar.reggie.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService{
}
