package pzn.belajarspringdasar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pzn.belajarspringdasar.data.Foo;

//belajar import, dimana configuration bisa di import ke yang lain
//dan lebih dari 1 import

@Configuration
public class FooConfiguration {

    @Bean
    public Foo foo() {
        return new Foo();
    }
}
