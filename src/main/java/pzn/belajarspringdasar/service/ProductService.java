package pzn.belajarspringdasar.service;
//cara membuat bean tanpa annotation bean satu satu, class disini
//akan otomatis dibuatkan bean. namun, hanya 1 data yang sama (data
// Foo, hanya akan jadi bean Foo, tidak ada foo1 atau foo2)

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pzn.belajarspringdasar.repository.ProductRepository;

@Component
public class ProductService {
    //belajar dependency injection di component

    @Getter
    private ProductRepository productRepository;

    //caranya pertama pakai constructor seperti ini
    //pake annotation @Autowired jika ada lebih dari 1 constructor
    //dimana yang ditandai akan digunakan, kaya primary
    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    //jangan lupa tambahkan ke component configuration, karena ada
    //akses ke repository, jadi perlu import repository ke component
    public ProductService(ProductRepository productRepository, String name) {
        this.productRepository = productRepository;
    }
}
