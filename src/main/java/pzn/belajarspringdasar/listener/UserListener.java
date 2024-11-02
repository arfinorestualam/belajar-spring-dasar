package pzn.belajarspringdasar.listener;

//cara membuat listener mudah menggunakan annotation tanpa aplicationlistener

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import pzn.belajarspringdasar.event.LoginSuccessEvent;

@Slf4j
@Component
public class UserListener {

    @EventListener(LoginSuccessEvent.class)
    public void onLoginSuccessEvent(LoginSuccessEvent event) {
        log.info("Login success for user {}", event.getUser());
    }
}
