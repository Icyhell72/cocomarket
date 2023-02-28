package com.spring.cocomarket.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Offer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Double price;

    private Integer quantity;

    private LocalDateTime deliveryTime;

    @Enumerated(EnumType.STRING)
    private OfferStatus status;

    @ManyToOne
    @JsonIgnore
    private Tender tender;

    @ManyToOne
    @JsonIgnore
    private User provider;



}

