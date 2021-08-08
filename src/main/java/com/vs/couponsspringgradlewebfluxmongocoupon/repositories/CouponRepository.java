package com.vs.couponsspringgradlewebfluxmongocoupon.repositories;

import com.vs.couponsspringgradlewebfluxmongocoupon.model.Coupon2;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CouponRepository extends JpaRepository<Coupon2, Long> {

    List<Coupon2> findCouponsByCompany(Long companyId);

}
