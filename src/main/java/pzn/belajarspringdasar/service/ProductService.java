package pzn.belajarspringdasar.service;
//cara membuat bean tanpa annotation bean satu satu, class disini
//akan otomatis dibuatkan bean. namun, hanya 1 data yang sama (data
// Foo, hanya akan jadi bean Foo, tidak ada foo1 atau foo2)

import org.springframework.stereotype.Component;

@Component
public class ProductService {
}
