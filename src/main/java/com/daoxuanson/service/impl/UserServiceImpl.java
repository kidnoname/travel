package com.daoxuanson.service.impl;

import com.daoxuanson.entity.User;
import com.daoxuanson.model.response.UserResponse;
import com.daoxuanson.repository.UserRepository;
import com.daoxuanson.service.UserService;
import com.daoxuanson.tranform.UserTranform;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    private UserTranform tranform;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, UserTranform tranform) {
        this.userRepository = userRepository;
        this.tranform = tranform;
    }

    @Override
    public User findUserByUserNameAndPassword(String userName, String password) {
        User user = userRepository.findUserByUserNameAndPassword(userName,password);

        return user;
    }
}
