package com.iniz.smeta.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Entity
@Table(name = "T5")
@Data//ломбок аннотация: генерирует геттеры, сеттеры, иквалс, хеш код методы
@NoArgsConstructor//ломбок аннотация: конструктор без аргуметов
public class T5 {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String EXTER_DISTANCE;

    @Column
    private Double COSTS_TO_1;

    @Column
    private Double COSTS_2;

    @Column
    private Double COSTS_3;

    @Column
    private Double COSTS_6;

    @Column
    private Double COSTS_9;

    @Column
    private Double COSTS_12;

}
