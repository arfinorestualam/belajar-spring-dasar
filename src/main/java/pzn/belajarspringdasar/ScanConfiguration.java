package pzn.belajarspringdasar;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//kalo cape import satu satu bisa pake annotation ini
@ComponentScan( basePackages = {
        //ini isi pake tempat package yang mau di scan ya
        "pzn.belajarspringdasar.configuration"
})
public class ScanConfiguration {
}
