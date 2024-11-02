package pzn.belajarspringdasar.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;

//contoh listener yang dibuat dengan spring application dimana berjalan
//bahkan sebelum bean di jalankan
//baca dokumentasi untuk melihat listener apa aja

@Slf4j
public class AppStartingListener implements ApplicationListener<ApplicationStartingEvent> {

    @Override
    public void onApplicationEvent(ApplicationStartingEvent event) {
        log.info("AppStartingListener starting");
    }
}
