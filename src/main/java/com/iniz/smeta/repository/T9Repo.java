package com.iniz.smeta.repository;

import com.iniz.smeta.entity.T9;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface T9Repo extends JpaRepository <T9, Integer> {

    List<T9> findAll();

}
