package pzn.belajarspringdasar.data;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Server {
    //belajar lifecycle Annotation, bagaimana ketika bean di buat
    //memanggil kelas yang akan dibuat ketika bean berhasil dibuat atau
    //sebelum hancur di panggil, ke class yang tidak bisa di kontrol

    @PostConstruct
    public void start() {
        log.info("Server started");
    }

    @PreDestroy
    public void destroy() {
        log.info("Server destroyed");
    }
}
