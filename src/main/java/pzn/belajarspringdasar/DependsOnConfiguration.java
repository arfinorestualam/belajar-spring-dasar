package pzn.belajarspringdasar;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import pzn.belajarspringdasar.data.Bar;
import pzn.belajarspringdasar.data.Foo;

@Slf4j
@Configuration
public class DependsOnConfiguration {
    //how manipulate the first bean to run using dependson

    @Bean
    @DependsOn({
           "bar"
    })
    public Foo foo() {
        log.info("create foo");
        return new Foo();
    }

    @Bean
    public Bar bar() {
        log.info("create bar");
        return new Bar();
    }
}
