package com.example.relationalDB.repositries.user;

import com.example.relationalDB.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
