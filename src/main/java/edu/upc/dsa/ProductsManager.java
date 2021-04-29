package edu.upc.dsa;

import edu.upc.dsa.models.Product;

import java.util.List;

public interface ProductsManager {
    public Product addProduct(String id, double preu, int ventas);
    public Product addProduct(Product p);
    public Product getProduct(String id);
    public List<Product> findAll();
    public void deleteProduct(String id);
    public Product updateProduct(Product p);

    public int size();

}
