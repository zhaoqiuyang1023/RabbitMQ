package com.example.rabbitmq.demo.bean;

import java.io.Serializable;

public class Role implements Serializable {

    public Role(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
