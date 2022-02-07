package com.iniz.smeta.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Entity
@Table(name = "T9")
@Data//ломбок аннотация: генерирует геттеры, сеттеры, иквалс, хеш код методы
@NoArgsConstructor//ломбок аннотация: конструктор без аргуметов
public class T9 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String SCALE;

    @Column
    private String CATEGORY;

    @Column
    private Double SECTION_HEIGHT;

    @Column
    private int TYPE_UNBUILT_FIELD;

    @Column
    private int TYPE_UNBUILT_CAMERAL;

    @Column
    private int TYPE_BUILT_FIELD;

    @Column
    private int TYPE_BUILT_CAMERAL;

    @Column
    private int TYPE_INDUSTRIAL_FIELD;

    @Column
    private int TYPE_INDUSTRIAL_CAMERAL;
}
