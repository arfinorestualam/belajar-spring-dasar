package pzn.belajarspringdasar;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pzn.belajarspringdasar.data.Foo;

@Slf4j
@Configuration
public class BeanConfiguration {

    @Bean
    public Foo foo() {
        Foo foo = new Foo();
        log.info("Create new foo");
        return foo;
    }
}
