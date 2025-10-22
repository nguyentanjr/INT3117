package org.example;

public class ShippingCalculator {
    public double calculateShippingFee(double orderValue, boolean isPremiumMember) {
        if (orderValue <= 0) {
            throw new IllegalArgumentException("Giá trị đơn hàng không hợp lệ");
        }
        double shippingFee = 0;
        if (orderValue < 300000) {
            shippingFee = 25000;
        } else if (orderValue < 1500000) {
            shippingFee = 15000;
        } else {
            shippingFee = 0;
        }

        if (isPremiumMember && shippingFee > 0) {
            shippingFee *= 0.5;
        }
        return shippingFee;
    }

    public static void main(String[] args) {
    }
}