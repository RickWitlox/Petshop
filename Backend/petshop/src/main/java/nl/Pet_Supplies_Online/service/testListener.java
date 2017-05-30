package nl.Pet_Supplies_Online.service;

        import nl.Pet_Supplies_Online.model.Product;

        import javax.inject.Inject;
        import javax.ws.rs.GET;
        import javax.ws.rs.Path;
        import javax.ws.rs.Produces;
        import java.util.ArrayList;
        import java.util.List;

/**
 * Created by rwitlox on 16-5-2017.
 */
@Path("listener")
public class testListener  {
    @Inject
    productService productService;

    @GET
    @Produces("application/json")
    public List<Product> getProducts() {
//        List<Product> products = new ArrayList<>();
//
//        Product p1 = new Product();
//        p1.setName("Een kattenspeeltje");
//        p1.setDesc("BlahdiBlah");
//        p1.setPrice(12.34);
//
//        Product p2 = new Product();
//        p2.setName("Lekker honden voer");
//        p2.setDesc("WoefWoef");
//        p2.setPrice(56.78);
//
//        products.add(p1);
//        products.add(p2);
//
//        System.out.println("test");
//        List<Product> testProducts = productService.findAll();
//        products.add(testProducts.get(0));

        return productService.findAll();
    }
}
