package com.iniz.smeta.repository;

import com.iniz.smeta.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Integer> {

    User findByLogin(String login);

}
