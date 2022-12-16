package org.example;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor

public class Product {

    private String name; // название
    private String country; // страна производитель
    private double weight; // вес
    private double cost; // стоимость
    private int sort; // сорт


}