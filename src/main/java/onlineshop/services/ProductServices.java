package onlineshop.services;

import onlineshop.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductServices {
    private List<Product> products;

    public ProductServices() {
        products = readArticles("product.csv");
    }

    List <Product> readArticles(String fileName) {
        List<Product> products = new ArrayList<>();
        return products;
    }

    public List<Product> getProducts() {
        return products;
    }
}
