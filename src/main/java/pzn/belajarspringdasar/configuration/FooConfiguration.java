package pzn.belajarspringdasar.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import pzn.belajarspringdasar.data.Foo;

//belajar import, dimana configuration bisa di import ke yang lain
//dan lebih dari 1 import

@Configuration
public class FooConfiguration {

    @Bean
    @Primary
    public Foo foo() {
        return new Foo();
    }

    @Bean
    public Foo foo2() {
        return new Foo();
    }

    @Bean
    public Foo foo3() {
        return new Foo();
    }
}
