package org.example;

import lombok.*;
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Book {
    private String name;
    private String second_name;
    private double cost;
    private int year;
    private int count_str;
}
