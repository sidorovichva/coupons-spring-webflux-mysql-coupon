package com.vs.couponsspringgradlewebfluxmongocoupon.services;

import com.vs.couponsspringgradlewebfluxmongocoupon.model.Coupon2;
import com.vs.couponsspringgradlewebfluxmongocoupon.repositories.CouponRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Scope("prototype")
@Data
@Lazy
public class CompanyFacade {

    private final CouponRepository couponRepository;

    public void addCoupon(Coupon2 coupon) throws Exception{
        this.couponRepository.save(coupon);
    }

    public void deleteCoupon(Long couponID) throws Exception {
        this.couponRepository.deleteById(couponID);
    }

    public List<Coupon2> getCompanyCoupons(Long companyId) throws Exception {
        return couponRepository.findCouponsByCompany(companyId);
    }
}
