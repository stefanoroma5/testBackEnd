package com.nubedian.nubedianproject.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class HardDisk implements Serializable { //Serializable used to transform the Java class in other types of stream
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String brand;
    private String model;
    private String type;
    private Integer rotationSpeed;
    @OneToOne
    @JoinColumn(name = "interface_id", referencedColumnName = "id")
    private HDInterface hdInterface;
    @OneToOne
    @JoinColumn(name = "physical_factor_id", referencedColumnName = "id")
    private PhysicalFactor physicalFactor;
    private Double price;

    public HardDisk() {
    }

    public HardDisk(String brand,
                    String model,
                    String type,
                    Integer rotationSpeed,
                    HDInterface hdInterface,
                    PhysicalFactor physicalFactor,
                    Double price) {
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.rotationSpeed = rotationSpeed;
        this.hdInterface = hdInterface;
        this.physicalFactor = physicalFactor;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getRotationSpeed() {
        return rotationSpeed;
    }

    public void setRotationSpeed(Integer rotationSpeed) {
        this.rotationSpeed = rotationSpeed;
    }

    public HDInterface getHdInterface() {
        return hdInterface;
    }

    public void setHdInterface(HDInterface hdInterface) {
        this.hdInterface = hdInterface;
    }

    public PhysicalFactor getPhysicalFactor() {
        return physicalFactor;
    }

    public void setPhysicalFactor(PhysicalFactor physicalFactor) {
        this.physicalFactor = physicalFactor;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "HardDisk{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", rotationSpeed=" + rotationSpeed +
                ", hdInterface='" + hdInterface + '\'' +
                ", physicalFactor=" + physicalFactor +
                ", price=" + price +
                '}';
    }
}
