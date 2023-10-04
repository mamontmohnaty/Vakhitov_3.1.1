package com.ravil_vakhitov.spring_boot.repository;

import com.ravil_vakhitov.spring_boot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
