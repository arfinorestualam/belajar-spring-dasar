package pzn.belajarspringdasar;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import pzn.belajarspringdasar.service.MerchantServiceImpl;

@Configuration
@Import(MerchantServiceImpl.class)
public class InheritanceConfiguration {
}
