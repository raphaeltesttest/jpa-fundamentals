package services;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ProductService {

    private final EntityManagerFactory emf;

    public ProductService() {
        this.emf = Persistence.createEntityManagerFactory("my-persistence-unit");
    }
}
