package com.cafeShopManagment.in;

public class Discount {
    public void applyDiscount(int totalBill) {
        if (totalBill > 50) {
            double discount = (totalBill * 10) / 100;
            totalBill -= discount;
        }
    }
}