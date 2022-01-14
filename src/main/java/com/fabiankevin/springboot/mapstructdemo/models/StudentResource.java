package com.fabiankevin.springboot.mapstructdemo.models;

import lombok.Data;

import java.util.Date;

@Data
public class StudentResource {
    private String id;
    private String fullName;
    private Date birthDate;
}
