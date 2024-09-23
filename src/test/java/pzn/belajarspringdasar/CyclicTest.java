package pzn.belajarspringdasar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CyclicTest {
    @Test
    void testCyclic() {
        //error circular reference
        //ApplicationContext context = new AnnotationConfigApplicationContext(CyclicConfiguration.class);

        //cara membungkus error agar sukses
        Assertions.assertThrows(Throwable.class, () ->{
            ApplicationContext context = new AnnotationConfigApplicationContext(CyclicConfiguration.class);
        });
    }
}
