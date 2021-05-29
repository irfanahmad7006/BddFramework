package AmazonTestImplementation;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private String productName;
    private int price;

    public Product(String productName, int price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<String> productList(){
        List<String> prodList= new ArrayList<>();
        prodList.add("Iphone");
        prodList.add("HP Laptop");
        prodList.add("Watch");
        prodList.add("Mac Book");
        return prodList;
    }
}
