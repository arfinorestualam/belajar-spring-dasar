package pzn.belajarspringdasar;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
     "pzn.belajarspringdasar.service"
})
public class ComponentConfiguration {
}
