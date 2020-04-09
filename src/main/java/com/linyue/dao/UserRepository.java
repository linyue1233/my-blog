package com.linyue.dao;

import com.linyue.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    User  findByUsernameAndPassword(String username,String password);
}
