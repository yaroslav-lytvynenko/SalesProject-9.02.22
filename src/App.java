import controllers.ProductController;
import models.Product;
import utils.*;
import views.SalesView;

import static utils.Rounder.round;

// Входная точка в программу/приложение
public class App {

    public static void main(String[] args) {

        // Здесь создайте экземпляры Model, View и Controller,
        // на основании соответствующих конструкторов.
//        Product model = создать экземпляр
//        SalesView view = создать экземпляр
//        ProductController controller = создать экземпляр
        Product model = new Product();
        SalesView view = new SalesView(model);
        ProductController controller = new ProductController(model,view);
        // Запуск программы/приложения.
        // Раскомментированный код будет корректным после
        // правильной настройки приложения

        controller.runApp();

    }
}
