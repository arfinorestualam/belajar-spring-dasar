package pzn.belajarspringdasar;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
//begini cara importnya
@Import({
      FooConfiguration.class,
      BarConfiguration.class
})
public class MainConfiguration {
}
