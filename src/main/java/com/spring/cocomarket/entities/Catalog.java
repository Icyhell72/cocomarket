package com.spring.cocomarket.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Catalog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String description;

    private Double price;

    private Double promotion;

    private String editionDate;

    private String link;



    @ManyToMany
    @JsonIgnore
    private Set<Categorie> categories;

    @ManyToMany
    @JsonIgnore
    @ToString.Exclude
    private Set<Produit> produits;
}

