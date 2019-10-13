package com.ryszard.repository.springdata;

import com.ryszard.domain.spring.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {

}
