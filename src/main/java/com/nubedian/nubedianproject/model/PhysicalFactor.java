package com.nubedian.nubedianproject.model;

import javax.persistence.*;

@Entity
public class PhysicalFactor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;

    //constructor
    public PhysicalFactor() {
    }

    public PhysicalFactor(String name) {
        this.name = name;
    }

    //getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
