package com.iniz.smeta.repository;

import com.iniz.smeta.entity.T8;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface T8Repo extends JpaRepository <T8, Integer> {

    List<T8> findAll();

}
