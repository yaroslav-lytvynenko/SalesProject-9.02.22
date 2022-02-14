package views;

import models.Product;
import utils.Validator;
import java.util.Scanner;

// View
public class SalesView {

    String title;
    String name;
    int quantity;
    float price;
    Scanner scanner;

    // Здесь, создайте конструктор данного класса,
    // который в параметре содержит переменную типа модели.
    public SalesView(Product product){
    }

    public void getInputs(Product product) {
        scanner = new Scanner(System.in);

        title = "Введите наименование товара: ";
        System.out.println(title);
        // Здесь, реализуйте вывод сообщения о необходимсоти
        // ввода соответствующего значения, валидацью значения
        // через валидатор, установку валидного значения через модель.
        name = product.setName(Validator.validateName(scanner));

        title = "Введите количество: ";
        System.out.println(title);
        // Здесь, реализуйте вывод сообщения о необходимсоти
        // ввода соответствующего значения, валидацью значения
        // через валидатор, установку валидного значения через модель.
        quantity = product.setQuantity(Validator.validateQuantityInput(scanner));

        title = "Введите цену: ";
        System.out.println(title);
        // Здесь, реализуйте вывод сообщения о необходимсоти
        // ввода соответствующего значения, валидацью значения
        // через валидатор, установку валидного значения через модель.
        price = product.setPrice(Validator.validatePriceInput(scanner));

        scanner.close();
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
