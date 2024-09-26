package pzn.belajarspringdasar;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import pzn.belajarspringdasar.data.MultiFoo;

@Configuration
@ComponentScan(basePackages = {
     "pzn.belajarspringdasar.service",
     "pzn.belajarspringdasar.repository",
     "pzn.belajarspringdasar.configuration"
})
@Import(MultiFoo.class)
public class ComponentConfiguration {
}
