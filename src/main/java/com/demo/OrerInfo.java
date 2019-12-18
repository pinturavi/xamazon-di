package com.demo;

import java.util.Objects;

public class OrerInfo {

    private String customerName;

    private String email;

    private String product;

    private double price;

    private  String creditCard;

    public OrerInfo(String customerName, String email, String product, double price, String creditCard) {
        this.customerName = customerName;
        this.email = email;
        this.product = product;
        this.price = price;
        this.creditCard = creditCard;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrerInfo orerInfo = (OrerInfo) o;
        return Double.compare(orerInfo.price, price) == 0 &&
                Objects.equals(customerName, orerInfo.customerName) &&
                Objects.equals(email, orerInfo.email) &&
                Objects.equals(product, orerInfo.product) &&
                Objects.equals(creditCard, orerInfo.creditCard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerName, email, product, price, creditCard);
    }

    @Override
    public String toString() {
        return "OrerInfo{" +
                "customerName='" + customerName + '\'' +
                ", email='" + email + '\'' +
                ", product='" + product + '\'' +
                ", price=" + price +
                ", creditCard='" + creditCard + '\'' +
                '}';
    }
}
