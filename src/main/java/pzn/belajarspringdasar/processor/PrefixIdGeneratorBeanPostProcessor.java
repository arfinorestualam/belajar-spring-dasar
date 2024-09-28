package pzn.belajarspringdasar.processor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import pzn.belajarspringdasar.aware.IdAware;

import java.util.UUID;

@Slf4j
@Component
public class PrefixIdGeneratorBeanPostProcessor implements BeanPostProcessor, Ordered {
    //bisa pake postProcessBefore jika tidak peduli dengan proses yang terjadi
    //jika ingin aman pake postProcessAfter

    //belajar penggunaan ordered
    //karena bean post tidak urut, kita perlu ordered agar bean post
    //mengurutkan dari yang terkecil

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        log.info("Prefix Id Generator Processor for Bean {}", beanName);
        if (bean instanceof IdAware) {
            IdAware idAware = (IdAware) bean;
            idAware.setId("PZN-" + idAware.getId());
            log.info("set Prefix id generator for bean {}", beanName);
        }

        return bean;
    }

    @Override
    public int getOrder() {
        return 2;
    }
}
