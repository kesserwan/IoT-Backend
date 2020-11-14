package com.myproject.iot.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String ryleyDimension;


    public Device(Long id, String name, String ryleyDimension) {
        this.id = id;
        this.name = name;
        this.ryleyDimension = ryleyDimension;
    }

    public Device() {

    }

    public String getRyleyDimension() {
        return ryleyDimension;
    }

    public void setRyleyDimension(String ryleyDimension) {
        this.ryleyDimension = ryleyDimension;
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

    @Override
    public String toString() {
        return "Device{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
