package com.ryszard.repository.springdata;

import com.ryszard.domain.spring.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
User findByUserName(String username);

}
