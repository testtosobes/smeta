package com.iniz.smeta.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Entity
@Table(name = "T3")
@Data//ломбок аннотация: генерирует геттеры, сеттеры, иквалс, хеш код методы
@NoArgsConstructor//ломбок аннотация: конструктор без аргуметов
public class T3 {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private Double DISTRICT_WAGES_RATIO;

    @Column
    private Double DISTRICT_ESTIMATE_RATIO;

}
