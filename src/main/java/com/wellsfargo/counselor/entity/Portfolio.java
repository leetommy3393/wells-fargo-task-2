package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long portfolioId;

    @Column(nullable = false)
    private Long clientId;

    @Column(nullable = false)
    private Date creationDate;

    public Portfolio(Long clientId) {
        this.clientId = clientId;
        this.creationDate = new Date();
    }

    public Portfolio() {

    }
}
