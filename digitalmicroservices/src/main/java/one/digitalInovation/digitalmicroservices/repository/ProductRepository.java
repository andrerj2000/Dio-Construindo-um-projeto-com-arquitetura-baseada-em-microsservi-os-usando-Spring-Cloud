package one.digitalInovation.digitalmicroservices.repository;

import one.digitalInovation.digitalmicroservices.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}
