package pzn.belajarspringdasar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pzn.belajarspringdasar.data.Bar;
import pzn.belajarspringdasar.data.Foo;
import pzn.belajarspringdasar.data.FooBar;

@Configuration
public class DependencyInjectionConfiguration {
    @Bean
    public Foo foo() {
        return new Foo();
    }

    @Bean
    public Bar bar() {
        return new Bar();
    }

    @Bean
    public FooBar fooBar(Foo foo, Bar bar) {
        return new FooBar(foo, bar);
    }
}
