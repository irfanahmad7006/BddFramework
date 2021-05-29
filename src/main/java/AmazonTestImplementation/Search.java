package AmazonTestImplementation;

public class Search {
    public String displayProduct(Product product){
        if (product.productList().contains(product.getProductName())){
            return product.getProductName();
        }
        return null;
    }
}
