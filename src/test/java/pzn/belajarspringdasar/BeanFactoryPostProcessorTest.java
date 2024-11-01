package pzn.belajarspringdasar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import pzn.belajarspringdasar.data.Foo;
import pzn.belajarspringdasar.processor.FooBeanFactoryPostProcessor;

public class BeanFactoryPostProcessorTest {

    @Configuration
    @Import(FooBeanFactoryPostProcessor.class)
    public static class testConfiguration {

    }

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(testConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testBeanFactoryPostProcessor() {
        Foo foo = applicationContext.getBean(Foo.class);
        Assertions.assertNotNull(foo);
    }
}
