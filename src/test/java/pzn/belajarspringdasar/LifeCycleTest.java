package pzn.belajarspringdasar;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pzn.belajarspringdasar.data.Connection;
import pzn.belajarspringdasar.data.Server;

public class LifeCycleTest {

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(LifecycleConfiguration.class);
        //cara 2 menutup koneksi
        applicationContext.registerShutdownHook();
    }

    @AfterEach
    void tearDown() {
        //cara 1
        //applicationContext.close();
    }

    @Test
    void testConnection() {
        //koneksi akan selalu menyala, ubah ApplicationContext
        //menjadi ConfigurableApplicationContext
        //lalu teardown menggunakan aftereach
        Connection connection = applicationContext.getBean(Connection.class);
    }

    @Test
    void testServer() {
        Server server = applicationContext.getBean(Server.class);
    }
}
