package com.daoxuanson.service;

import com.daoxuanson.entity.User;
import com.daoxuanson.model.response.UserResponse;

public interface UserService {
    User findUserByUserNameAndPassword(String userName, String password);
}
