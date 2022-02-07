package com.iniz.smeta.repository;

import com.iniz.smeta.entity.T58;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface T58Repo extends JpaRepository <T58, Integer> {

    List<T58> findAll();

}
