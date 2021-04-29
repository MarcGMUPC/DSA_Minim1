package edu.upc.dsa;

import edu.upc.dsa.models.Product;

import java.util.LinkedList;
import java.util.List;

import org.apache.log4j.Logger;

public class ProductsManagerImpl implements ProductsManager {

    private static ProductsManager instance;
    protected List<Product> products;
    final static Logger logger = Logger.getLogger(ProductsManagerImpl.class);

    private ProductsManagerImpl() {
        this.products = new LinkedList<>();
    }

    public static ProductsManager getInstance() {
        if (instance==null) instance = new ProductsManagerImpl();
        return instance;
    }

    public int size() {
        int ret = this.products.size();
        logger.info("size " + ret);

        return ret;
    }

    public Product addProduct(Product p) {
        logger.info("new Product " + p);

        this.products.add (p);
        logger.info("new Product added");
        return p;
    }

    public Product addProduct(String id, double preu, int ventas) {
        return this.addProduct(new Product(id, preu, ventas));
    }

    public Product getProduct(String id) {
        logger.info("getProduct("+id+")");

        for (Product p: this.products) {
            if (p.getId().equals(id)) {
                logger.info("getProduct("+id+"): "+p);

                return p;
            }
        }

        logger.warn("not found " + id);
        return null;
    }

    public List<Product> findAll() {
        return this.products;
    }

    @Override
    public void deleteProduct(String id) {

        Product p = this.getProduct(id);
        if (p==null) {
            logger.warn("not found " + p);
        }
        else logger.info(p+" deleted ");

        this.products.remove(p);

    }

    @Override
    public Product updateProduct(Product p) {
        Product t = this.getProduct(p.getId());

        if (t!=null) {
            logger.info(p+" rebut!!!! ");

            t.setPreu(p.getPreu());
            t.setVentas(p.getVentas());

            logger.info(t+" updated ");
        }
        else {
            logger.warn("not found "+p);
        }

        return p;
    }
}
