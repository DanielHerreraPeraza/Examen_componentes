package com.cenfotec.examen.domain;

import javax.persistence.*;

@Entity
@Table(name="Tproduct")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="quality")
    private String quality;

    @Column(name="amount")
    private int amount;

    @Column(name="warehouse")
    private Long warehouse;

    @Column(name="boxes")
    private int boxes;

    @Column(name="created")
    private String created;

    public Product() {

    }

    public Product(String name, String quality, Long warehouse, int amount, int boxes, String date) {
        this.name = name;
        this.quality = quality;
        this.warehouse = warehouse;
        this.amount = amount;
        this.boxes = boxes;
        this.created = date;
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

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public Long getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Long warehouse) {
        this.warehouse = warehouse;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getBoxes() {
        return boxes;
    }

    public void setBoxes(int boxes) {
        this.boxes = boxes;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

}
