package pzn.belajarspringdasar.data;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//belajar lifecycle
//initial untuk tahu kalo bean sudah selesai dibuat
//disposable untuk tahu kalo bean akan dihancurkan
//digunakan untuk kita mau bereaksi apa dengan lifecycle

@Slf4j
public class Connection implements InitializingBean, DisposableBean {

    @Override
    public void destroy() throws Exception {
        log.info("Connection is closed");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("Connection is ready");
    }
}
