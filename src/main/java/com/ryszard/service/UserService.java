package com.ryszard.service;

import com.ryszard.domain.spring.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
