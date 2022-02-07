package com.iniz.smeta.repository;

import com.iniz.smeta.entity.T2;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface T2Repo extends JpaRepository <T2, Integer> {

    List<T2> findAll();

}
