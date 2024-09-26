package pzn.belajarspringdasar;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import pzn.belajarspringdasar.configuration.BarConfiguration;
import pzn.belajarspringdasar.configuration.FooConfiguration;

@Configuration
//begini cara importnya
@Import({
      FooConfiguration.class,
      BarConfiguration.class
})
public class MainConfiguration {
}
