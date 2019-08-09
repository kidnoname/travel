package com.daoxuanson.repository;

import com.daoxuanson.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserNameAndPasswordAndSatus(String userName, String password, Integer status);

    User findByUserNameAndSatus(String userName, Integer status);

    User findByUserName(String userName);

    User findUserByUserNameAndPassword(String username, String password);

}
