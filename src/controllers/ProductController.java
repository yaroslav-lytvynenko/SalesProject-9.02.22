package controllers;

import models.Product;
import views.SalesView;
import utils.*;
// Controller
public class ProductController {

    Product model;
    SalesView view;

    // Конструктор
    public ProductController(Product model, SalesView view) {
        this.model = model;
        this.view = view;
    }

    public void runApp() {

        view.getInputs(model);

        // Здесь, реализуйте:
        // 1) получение имени товара через модель;
        // 2) вызов методов расчетов доходов и налога;
        // 3) округление расчетных значений;
        // 4) вывод расчетов по заданному формату.

        //1
        String name = model.getName();
        //2
        double income = model.income();
        double tax = model.tax();
        double profit = model.profit();
        //3
        income = Rounder.round(income);
        tax = Rounder.round(tax);
        profit = Rounder.round(profit);
        //4
        //String output = "[здесь должен быть вывод по формату]";
        String output = "Наименование товара: " + name +"\n"+ "Общий доход (грн.): " + income + "\n"
                + "Сумма налога (грн.): " + tax + "\n" + "Чистый доход (грн.): " + profit;

        view.getOutput(output);
    }
}
