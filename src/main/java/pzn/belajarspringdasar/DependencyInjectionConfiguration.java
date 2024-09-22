package pzn.belajarspringdasar;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import pzn.belajarspringdasar.data.Bar;
import pzn.belajarspringdasar.data.Foo;
import pzn.belajarspringdasar.data.FooBar;

@Configuration
public class DependencyInjectionConfiguration {
    @Primary //digunakan agar tidak ada error, selalu memakai konfigurasi ini
            //jika ditemukan konfigurasi kembar singkatnya default.
    @Bean
    public Foo fooFirst() {
        return new Foo();
    }

    @Bean
    public Foo fooSecond() {
        return new Foo();
    }

    @Bean
    public Bar bar() {
        return new Bar();
    }

    //Qualifier digunakan untuk memilih data yang digunakan, jika ada Primary
    //Qualifier tetap di dahulukan
    @Bean
    public FooBar fooBar(@Qualifier("fooSecond") Foo foo, Bar bar) {
        return new FooBar(foo, bar);
    }
}
