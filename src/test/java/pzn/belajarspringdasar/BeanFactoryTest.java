package pzn.belajarspringdasar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pzn.belajarspringdasar.data.Foo;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BeanFactoryTest {
    private ConfigurableApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(ScanConfiguration.class);
        context.registerShutdownHook();
    }

    @Test
    void testBeanFactory() {
        //ingin mengambil jumlah saja tanpa tau nama beannya
        ObjectProvider<Foo> fooObjectProvider = context.getBeanProvider(Foo.class);
        List<Foo> fooList = fooObjectProvider.stream().toList();

        System.out.println(fooList);
        
        //mengambil jumlah juga tau nama beannya
        //String di map itu adalah nama beannya
        Map<String, Foo> beans = context.getBeansOfType(Foo.class);
        System.out.println(beans);

    }
}
