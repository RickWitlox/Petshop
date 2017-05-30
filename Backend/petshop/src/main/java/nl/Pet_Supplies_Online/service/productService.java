package nl.Pet_Supplies_Online.service;

import nl.Pet_Supplies_Online.model.Product;

import javax.ejb.Stateless;

/**
 * Created by rwitlox on 16-5-2017.
 */
@Stateless
public class productService extends AbstractCrudRepository<Product> {
    @Override
    protected Class<Product> getEntityClass() { return Product.class; }
}






