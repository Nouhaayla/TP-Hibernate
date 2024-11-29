package util;

import dao.IDao;
import entities.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import util.HibernateConfig;

public class Presentation2 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfig.class);

        IDao<Product> productDao = context.getBean(IDao.class);

        // Creating 5 products
        Product product1 = new Product();
        product1.setName("Product 1");
        product1.setPrice(100.0);

        Product product2 = new Product();
        product2.setName("Product 2");
        product2.setPrice(150.0);

        Product product3 = new Product();
        product3.setName("Product 3");
        product3.setPrice(200.0);

        Product product4 = new Product();
        product4.setName("Product 4");
        product4.setPrice(250.0);

        Product product5 = new Product();
        product5.setName("Product 5");
        product5.setPrice(300.0);

        // Save products to the database
        productDao.create(product1);
        productDao.create(product2);
        productDao.create(product3);
        productDao.create(product4);
        productDao.create(product5);

        System.out.println("Products saved:");
        System.out.println("Product 1: " + product1.getName() + " - Price: " + product1.getPrice());
        System.out.println("Product 2: " + product2.getName() + " - Price: " + product2.getPrice());
        System.out.println("Product 3: " + product3.getName() + " - Price: " + product3.getPrice());
        System.out.println("Product 4: " + product4.getName() + " - Price: " + product4.getPrice());
        System.out.println("Product 5: " + product5.getName() + " - Price: " + product5.getPrice());
    }
}
