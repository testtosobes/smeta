package com.iniz.smeta.repository;

import com.iniz.smeta.entity.T81;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface T81Repo extends JpaRepository <T81, Integer> {

    List<T81> findAll();

}
