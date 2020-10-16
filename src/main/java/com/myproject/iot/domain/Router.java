package com.myproject.iot.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Router {

    @Id
    private Long id;
    private String name;
    private String brand;


    public Router() {

    }
    public Router(Long id, String name, String brand) {
        this.id = id;
        this.name = name;
        this.brand = brand;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
