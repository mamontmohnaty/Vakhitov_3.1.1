package com.ravil_vakhitov.spring_boot.service;

import com.ravil_vakhitov.spring_boot.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<User> findAll();

    User findById(Long id);

    User saveUser(User user);

    void deleteById(Long id);
}
