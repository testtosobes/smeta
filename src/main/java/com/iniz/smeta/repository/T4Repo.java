package com.iniz.smeta.repository;

import com.iniz.smeta.entity.T4;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface T4Repo extends JpaRepository <T4, Integer> {

    List<T4> findAll();

}
