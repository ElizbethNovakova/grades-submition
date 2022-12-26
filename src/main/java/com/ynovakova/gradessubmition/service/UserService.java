package com.ynovakova.gradessubmition.service;

import com.ynovakova.gradessubmition.entity.User;

public interface UserService {
    User getUser(Long id);
    User saveUser(User user);
    User getUser(String username);
}
