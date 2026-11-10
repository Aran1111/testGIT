package com.rhs.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rhs.entity.User;
import com.rhs.mapper.UserMapper;
import com.rhs.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
