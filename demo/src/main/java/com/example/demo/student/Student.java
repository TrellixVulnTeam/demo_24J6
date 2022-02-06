package com.example.demo.student;

import lombok.*;

@ToString
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor

public class Student {
    private Long id;
    private String name;
    private String email;
    private Gender gender;

    public Long getId() {
        return id;
    }
}
