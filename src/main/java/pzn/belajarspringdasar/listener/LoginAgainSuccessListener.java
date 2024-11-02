package pzn.belajarspringdasar.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import pzn.belajarspringdasar.event.LoginSuccessEvent;

@Slf4j
@Component
public class LoginAgainSuccessListener implements ApplicationListener<LoginSuccessEvent> {

    @Override
    public void onApplicationEvent(LoginSuccessEvent event) {
        log.info("Login again success", event.getUser());
    }
}
