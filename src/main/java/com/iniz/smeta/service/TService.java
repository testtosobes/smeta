package com.iniz.smeta.service;

import com.iniz.smeta.dto.UserDto;
import com.iniz.smeta.entity.*;
import com.iniz.smeta.exception.ValidationException;

import java.util.List;

public interface TService {

    List<T2> findAllT2();
    List<T3> findAllT3();
    List<T4> findAllT4();
    List<T5> findAllT5();
    List<T8> findAllT8();
    List<T9> findAllT9();
    List<T58> findAllT58();
    List<T80> findAllT80();
    List<T81> findAllT81();
}
