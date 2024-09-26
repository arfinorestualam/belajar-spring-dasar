package pzn.belajarspringdasar.configuration;

//belajar import, dimana configuration bisa di import ke yang lain
//dan lebih dari 1 import

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pzn.belajarspringdasar.data.Bar;

@Configuration
public class BarConfiguration {

    @Bean
    public Bar bar() {
        return new Bar();
    }
}
