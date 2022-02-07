package com.iniz.smeta.repository;

import com.iniz.smeta.entity.T3;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface T3Repo extends JpaRepository <T3, Integer> {

    List<T3> findAll();

}
