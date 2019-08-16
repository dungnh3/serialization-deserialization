package com.github.tutorial;

import lombok.Data;

import java.io.Serializable;

@Data
public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private String name;
    private transient String address;
}
