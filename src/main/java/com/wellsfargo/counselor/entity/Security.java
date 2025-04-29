package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Security {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long securityId;
    @Column(nullable = false)
    private Long portfolioId;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String category;
    @Column(nullable = false)
    private Double purchasePrice;
    @Column(nullable = false)
    private Date purchaseDate;
    @Column(nullable = false)
    private Integer quantity;

    public Security(Long portfolioId, String name, String category, Double purchasePrice, Integer quantity) {
        this.portfolioId = portfolioId;
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
        this.purchaseDate = new Date();
    }

    public Security() {

    }

    public void setPortfolioId(Long portfolioId) {
        this.portfolioId = portfolioId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPurchasePrice(Double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Long getSecurityId() {
        return securityId;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public Double getPurchasePrice() {
        return purchasePrice;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public Integer getQuantity() {
        return quantity;
    }
}
