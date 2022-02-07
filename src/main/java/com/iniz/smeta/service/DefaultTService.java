package com.iniz.smeta.service;

import com.iniz.smeta.entity.*;
import com.iniz.smeta.repository.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class DefaultTService implements TService {
    private final T2Repo t2Repo;
    private final T3Repo t3Repo;
    private final T4Repo t4Repo;
    private final T5Repo t5Repo;
    private final T8Repo t8Repo;
    private final T9Repo t9Repo;
    private final T58Repo t58Repo;
    private final T80Repo t80Repo;
    private final T81Repo t81Repo;
    @Override
    public List<T2> findAllT2() {
        return t2Repo.findAll()
                .stream()
                //.map(userConverter::fromUserToUserDto)
                .collect(Collectors.toList());    }
    @Override
    public List<T3> findAllT3() {
        return t3Repo.findAll()
                .stream()
                //.map(userConverter::fromUserToUserDto)
                .collect(Collectors.toList());    }

    @Override
    public List<T4> findAllT4() {
        return t4Repo.findAll()
                .stream()
                //.map(userConverter::fromUserToUserDto)
                .collect(Collectors.toList());    }

    @Override
    public List<T5> findAllT5() {
        return t5Repo.findAll()
                .stream()
                //.map(userConverter::fromUserToUserDto)
                .collect(Collectors.toList());    }

    @Override
    public List<T8> findAllT8() {
        return t8Repo.findAll()
                .stream()
                //.map(userConverter::fromUserToUserDto)
                .collect(Collectors.toList());    }

    @Override
    public List<T9> findAllT9() {
        return t9Repo.findAll()
                .stream()
                //.map(userConverter::fromUserToUserDto)
                .collect(Collectors.toList());    }

    @Override
    public List<T58> findAllT58() {
        return t58Repo.findAll()
                .stream()
                //.map(userConverter::fromUserToUserDto)
                .collect(Collectors.toList());    }

    @Override
    public List<T80> findAllT80() {
        return t80Repo.findAll()
                .stream()
                //.map(userConverter::fromUserToUserDto)
                .collect(Collectors.toList());    }
    @Override
    public List<T81> findAllT81() {
        return t81Repo.findAll()
                .stream()
                //.map(userConverter::fromUserToUserDto)
                .collect(Collectors.toList());    }

}
