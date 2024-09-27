package pzn.belajarspringdasar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pzn.belajarspringdasar.client.PaymentGatewayClient;

public class FactoryTest {

    private ConfigurableApplicationContext context;

    @BeforeEach
    public void setUp() {
        context = new AnnotationConfigApplicationContext(FactoryConfiguration.class);
        context.registerShutdownHook();
    }

    @Test
    void testFactory() {
        PaymentGatewayClient paymentGatewayClient = context.getBean(PaymentGatewayClient.class);
        Assertions.assertNotNull(paymentGatewayClient);
        Assertions.assertEquals(paymentGatewayClient.getEndpoint(), "http://localhost:9090");
        Assertions.assertEquals(paymentGatewayClient.getPrivateKey(), "private");
        Assertions.assertEquals(paymentGatewayClient.getPublicKey(), "public");

    }
}
