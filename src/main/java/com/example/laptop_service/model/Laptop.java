package com.example.laptop_service.model;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor

@Data


@Entity
@Table(name = "laptops")
public class Laptop {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long laptopId;
    private String laptopBrand;
    private String laptopModel;
    private double laptopPrice;
    private String ram;
    private String color;
    private String dimensions;
    private String processorType;
    private String screenSize;
    private String storage;
    private int stock;
    private String warrantyPeriod;
    private String weight;
    private String graphicCard;
    private String releaseDate;
}
