package com.iniz.smeta.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Entity
@Table(name = "T8")
@Data//ломбок аннотация: генерирует геттеры, сеттеры, иквалс, хеш код методы
@NoArgsConstructor//ломбок аннотация: конструктор без аргуметов
public class T8 {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String TYPE;

    @Column
    private String CLASS;

    @Column
    private int CAT1_FIELD;

    @Column
    private int CAT1_CAMERAL;

    @Column
    private int CAT2_FIELD;

    @Column
    private int CAT2_CAMERAL;

    @Column
    private int CAT3_FIELD;

    @Column
    private int CAT3_CAMERAL;
}
