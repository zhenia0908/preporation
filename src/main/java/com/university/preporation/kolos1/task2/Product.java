package com.university.preporation.kolos1.task2;

public class Product {
    private String mark;
    private String name;
    private double count;
    private double price;
    private double value;

    public Product(String mark, String name, double count, double price) {
        this.mark = mark;
        this.name = name;
        this.count = count;
        this.price = price;
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Product() {
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCount() {
        return count;
    }

    public void setCount(double count) {
        this.count = count;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
