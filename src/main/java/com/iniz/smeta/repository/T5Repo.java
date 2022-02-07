package com.iniz.smeta.repository;

import com.iniz.smeta.entity.T5;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface T5Repo extends JpaRepository <T5, Integer> {

    List<T5> findAll();

}
