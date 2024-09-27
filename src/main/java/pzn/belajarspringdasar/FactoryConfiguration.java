package pzn.belajarspringdasar;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import pzn.belajarspringdasar.factory.PaymentGatewayClientFactoryBean;

@Configuration
@Import({
        PaymentGatewayClientFactoryBean.class
})
public class FactoryConfiguration {
}
