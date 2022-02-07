package com.iniz.smeta.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Entity
@Table(name = "T58")
@Data//ломбок аннотация: генерирует геттеры, сеттеры, иквалс, хеш код методы
@NoArgsConstructor//ломбок аннотация: конструктор без аргуметов
public class T58 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String NAME_TAX;

    @Column
    private int DIFFF_CAT1;

    @Column
    private int DIFF_CAT2;

    @Column
    private int DIFF_CAT3;

}
