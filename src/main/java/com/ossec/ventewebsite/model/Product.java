package com.ossec.ventewebsite.model;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    private double price;
    private double weight;
    private String description;
    private String imageName;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", referencedColumnName = "category_id")
    private Category category;

    public void setId(Long id){
        this.id = id;
    }

    public Long getId(){return id;}

    public void setName(String name){
        this.name = name;
    }

    public String getName(){return name;}

    public void setWeight(double weight){
        this.weight = weight;
    }
    public double getWeight() {return weight;}

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){return price;}


    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){return description;}

    public void setImageName(String imageName){
        this.imageName = imageName;
    }

    public String getImageName(){return imageName;}

}
