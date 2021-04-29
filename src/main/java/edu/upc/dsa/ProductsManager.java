package edu.upc.dsa;

import edu.upc.dsa.models.Product;
import edu.upc.dsa.models.Track;

import java.util.List;

public interface ProductsManager {
    public Track addProduct(String id, double preu, int ventas);
    public Track addProduct(Product p);
    public Track getProduct(String id);
    public List<Product> findAll();
    public void deleteProduct(String id);
    public Track updateProduct(Product p);

    public int size();

}
