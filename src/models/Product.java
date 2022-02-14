package models;

import base.*;

import java.util.Scanner;

// Model.
// Примените интерфейсы Income, Fiscal, переопределите их методы.
public class Product {

    // Объявление полей модели
    private String name;
    private int quantity;
    private float price;
    // Налоговоу ставку объявите в виде константы
    // здесь ...
    private final float taxation = 0.05f;

    //public Product() {}

    // Обеспечьте доступ к полям модели через getters и setters
    // здесь ...
    public String getName() {
        return this.name;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public float getPrice() {
        return this.price;
    }

    public String setName(String name) {
        this.name = name;
        return this.name;
    }

    public int setQuantity(int quantity) {
        this.quantity = quantity;
        return this.quantity;
    }

    public float setPrice(float price) {
        this.price = price;
        return this.price;
    }

    // Переопределите методы реализуемых интерфейсов.


    // Расчёт дохода от продаж, до уплаты налога.
    // здесь ...
    public double income() {
        return quantity * price;
    }

    // Расчёт суммы налога с продаж.
    // здесь ...
    public double tax() {
        return income() * taxation;
    }

    // Расчёт чистого дохода, после уплаты налога.
    // здесь ...
    public double profit() {
        return income() - tax();
    }

}
