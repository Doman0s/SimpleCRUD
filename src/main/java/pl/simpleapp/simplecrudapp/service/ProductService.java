package pl.simpleapp.simplecrudapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.simpleapp.simplecrudapp.model.Product;
import pl.simpleapp.simplecrudapp.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public Product saveProduct(Product product) {
        return repository.save(product);
    }

    public List<Product> getProducts() {
        return repository.getAllProducts();
    }

    public Product getProductById(int id) {
        return repository.findById(id);
    }

    public String deleteProduct(int id) {
        repository.delete(id);
        return "product removed!" + id;
    }

    public Product updateProduct(Product product) {
        return repository.update(product);
    }

}
