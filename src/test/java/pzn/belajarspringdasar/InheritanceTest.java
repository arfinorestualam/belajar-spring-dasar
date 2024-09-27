package pzn.belajarspringdasar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pzn.belajarspringdasar.service.MerchantService;
import pzn.belajarspringdasar.service.MerchantServiceImpl;

public class InheritanceTest {

    private ConfigurableApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(InheritanceConfiguration.class);
        context.registerShutdownHook();
    }

    @Test
    void testInheritance() {
        MerchantService merchantService = context.getBean(MerchantService.class);
        MerchantServiceImpl merchantServiceImpl = context.getBean(MerchantServiceImpl.class);
        Assertions.assertSame(merchantServiceImpl, merchantService);
    }
}
