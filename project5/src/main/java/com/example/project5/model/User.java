package com.example.project5.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class User {
    private Long id;
    private String name;
    private String email;

    // getters and setters
}