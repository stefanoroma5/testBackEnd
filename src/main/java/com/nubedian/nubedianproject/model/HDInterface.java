package com.nubedian.nubedianproject.model;

import javax.persistence.*;

@Entity
@Table(name = "Interface")
public class HDInterface {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;

    public HDInterface() {}

    public HDInterface(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
