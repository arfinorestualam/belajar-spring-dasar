package pzn.belajarspringdasar;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import pzn.belajarspringdasar.data.Bar;
import pzn.belajarspringdasar.data.Foo;
import pzn.belajarspringdasar.scope.DoubleScope;

@Slf4j
@Configuration
public class ScopeConfiguration {
    //scope terdapat banyak jenisnya, defaultnya adalah singleton
    //ada prototype, request, session, application, websocket
    //selain prototype itu khusus untuk web app saja, tidak untuk aplikasi
    //sederhana seperti ini
    @Bean
    @Scope("prototype")
    public Foo foo(){
        log.info("create new foo");
        return new Foo();
    }

    //register scope
    @Bean
    public CustomScopeConfigurer customScopeConfigurer() {
        CustomScopeConfigurer customScopeConfigurer = new CustomScopeConfigurer();
        customScopeConfigurer.addScope("doubleton", new DoubleScope());
        return customScopeConfigurer;
    }

    @Bean
    @Scope("doubleton")
    public Bar bar() {
        log.info("create new bar");
        return new Bar();
    }
}
