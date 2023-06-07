package com.example.userPanel.repository;

import com.example.userPanel.model.UserData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserRepository extends JpaRepository<UserData, Integer> {
}
