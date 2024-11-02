package pzn.belajarspringdasar.application;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pzn.belajarspringdasar.data.Foo;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = FooAplication.class)
class FooAplicationTest {

    @Autowired
    Foo foo;

    @Test
    void testSpringBoot() {
        Assertions.assertNotNull(foo);
    }
}