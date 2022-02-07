package com.iniz.smeta.repository;

import com.iniz.smeta.entity.T80;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface T80Repo extends JpaRepository <T80, Integer> {

    List<T80> findAll();

}
