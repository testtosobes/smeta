package com.iniz.smeta.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Entity
@Table(name = "T4")
@Data//ломбок аннотация: генерирует геттеры, сеттеры, иквалс, хеш код методы
@NoArgsConstructor//ломбок аннотация: конструктор без аргуметов
public class T4 {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String INTER_DISTANCE;

    @Column
    private Double COSTS_TO_75;

    @Column
    private Double COSTS_75_150;

    @Column
    private Double COSTS_150_300;

    @Column
    private Double COSTS_300_750;

    @Column
    private Double COSTS_700;

}
