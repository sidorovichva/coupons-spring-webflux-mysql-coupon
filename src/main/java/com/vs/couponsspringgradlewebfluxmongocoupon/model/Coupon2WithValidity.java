package com.vs.couponsspringgradlewebfluxmongocoupon.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.time.LocalDate;

@Component
@Data
@Entity
@Table(name = "COUPONS", indexes = @Index(name = "TitleIndex", columnList = "COMPANY_ID, TITLE", unique = true))
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Coupon2WithValidity extends Coupon2{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "increment")
    @Column(nullable = false, name = "ID", updatable = false)
    private Long id;

    @Column(name = "COMPANY_ID", nullable = false)
    private Long companyId;

    @Column(name = "CATEGORY_ID", nullable = false)
    private Long categoryId;

    @Column(nullable = false, length = 256, name = "TITLE")
    private String title;

    @Column(nullable = false, length = 256, name = "DESCRIPTION")
    private String description;

    @Column(nullable = false, name = "START_DATE")
    private LocalDate startSellsDate;

    @Column(nullable = false, name = "END_DATE")
    private LocalDate endSellsDate;

    @Column(nullable = false, name = "VALIDITY_DAYS")
    private Integer validityDurationDays;

    @Column(nullable = false, name = "AMOUNT")
    private Integer amount;

    @Column(nullable = false, name = "PRICE")
    private Double price;
}
