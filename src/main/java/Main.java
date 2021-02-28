import models.Product;
import service.Database;
import service.ProductService;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ProductService productService = new ProductService();
//        for (int i = 0; i < 11; i++) {
//            productService.createProduct(new Product("Product-" + i, (int) (Math.random() * 91) + 10));
//        }
        List<Product> products = productService.getAllProducts();
        for (Product product : products) {
            System.out.println(product.getId() + "\t" + product.getName() + "\t" + product.getPrice());
        }
        System.out.println();
        Product product = productService.getProductById(7);
        System.out.println(product.toString());
//        productService.createProducts();

//        Database database = new Database();

//        database.createTable("CREATE TABLE customers " +
//                "(id INT AUTO_INCREMENT PRIMARY KEY, " +
//                "first_name VARCHAR(30), " +
//                "last_name VARCHAR(30), " +
//                "age INT);");

//        database.createTable("CREATE TABLE products " +
//                "(id INT AUTO_INCREMENT PRIMARY KEY, " +
//                "name VARCHAR(30), " +
//                "price INT);");

//        database.createTable("CREATE TABLE orders " +
//                "(id INT AUTO_INCREMENT PRIMARY KEY, " +
//                "customer_id INT, " +
//                "product_id INT, " +
//                "FOREIGN KEY (customer_id) REFERENCES customers(id), " +
//                "FOREIGN KEY (product_id) REFERENCES products(id));");

    }
}
