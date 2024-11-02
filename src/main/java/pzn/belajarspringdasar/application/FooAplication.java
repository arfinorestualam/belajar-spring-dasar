package pzn.belajarspringdasar.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import pzn.belajarspringdasar.data.Foo;

@SpringBootApplication
public class FooAplication {

    @Bean
    public Foo foo() {
        return new Foo();
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(FooAplication.class, args);
        Foo foo = applicationContext.getBean(Foo.class);
        System.out.println(foo);
    }
}
