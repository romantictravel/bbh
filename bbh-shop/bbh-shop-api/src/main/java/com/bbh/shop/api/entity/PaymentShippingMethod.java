package com.bbh.shop.api.entity;

import javax.persistence.*;

@Table(name = "tb_payment_shipping_method")
public class PaymentShippingMethod {
    @Id
    @Column(name = "payment_methods")
    private Long paymentMethods;

    @Id
    @Column(name = "shipping_methods")
    private Long shippingMethods;

    /**
     * @return payment_methods
     */
    public Long getPaymentMethods() {
        return paymentMethods;
    }

    /**
     * @param paymentMethods
     */
    public void setPaymentMethods(Long paymentMethods) {
        this.paymentMethods = paymentMethods;
    }

    /**
     * @return shipping_methods
     */
    public Long getShippingMethods() {
        return shippingMethods;
    }

    /**
     * @param shippingMethods
     */
    public void setShippingMethods(Long shippingMethods) {
        this.shippingMethods = shippingMethods;
    }
}