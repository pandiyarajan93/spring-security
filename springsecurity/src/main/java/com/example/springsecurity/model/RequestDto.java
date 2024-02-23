package com.example.springsecurity.model;

import lombok.Data;

@Data
public class RequestDto {

    private String name;
    private String userName;
    private String password;
    private String role;
}
