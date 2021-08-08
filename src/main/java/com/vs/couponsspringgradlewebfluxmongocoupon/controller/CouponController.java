package com.vs.couponsspringgradlewebfluxmongocoupon.controller;

import com.vs.couponsspringgradlewebfluxmongocoupon.exceptions.CouponRESTException;
import com.vs.couponsspringgradlewebfluxmongocoupon.model.Coupon2;
import com.vs.couponsspringgradlewebfluxmongocoupon.model.Coupon2WithValidity;
import com.vs.couponsspringgradlewebfluxmongocoupon.services.CompanyFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("coupons")
@RequiredArgsConstructor
public class CouponController {

    private final CompanyFacade companyFacade;

    @PostMapping
    public ResponseEntity<?> addCoupon(@RequestBody Coupon2 coupon) throws Exception {
        if (coupon instanceof Coupon2WithValidity) {} //todo
        else {}
        companyFacade.addCoupon(coupon);
        return new ResponseEntity<>(CouponRESTException.COUPON_ADD.getSuccess(), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteCoupon(@PathVariable Long id) throws Exception {
        companyFacade.deleteCoupon(id);
        return new ResponseEntity<>(CouponRESTException.COUPON_DELETE.getSuccess(), HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<?> getCompanyCoupons(@PathVariable Long companyId) throws Exception {
        return ResponseEntity.ok().body(companyFacade.getCompanyCoupons(companyId));
    }
}
