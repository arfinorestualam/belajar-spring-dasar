package pzn.belajarspringdasar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pzn.belajarspringdasar.data.Connection;
import pzn.belajarspringdasar.data.Server;

@Configuration
public class LifecycleConfiguration {
    @Bean
    public Connection connection() {
        return new Connection();
    }

    //tanpa harus implement method iniatilize dan disposable
    //@Bean(initMethod = "start", destroyMethod = "destroy")
    //tidak perlu atas lagi karena sudah diberi annotation di server
    //class, annotation @postconstruct dan @predestroy
    @Bean
    public Server server() {
        return new Server();
    }
}
