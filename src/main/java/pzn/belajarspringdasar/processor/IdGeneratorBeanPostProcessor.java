package pzn.belajarspringdasar.processor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
import pzn.belajarspringdasar.aware.IdAware;

import java.util.UUID;

@Slf4j
@Component
public class IdGeneratorBeanPostProcessor implements BeanPostProcessor {
    //bisa pake postProcessBefore jika tidak peduli dengan proses yang terjadi
    //jika ingin aman pake postProcessAfter

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        log.info("Id Generator Processor for Bean {}", beanName);
        if (bean instanceof IdAware) {
            IdAware idAware = (IdAware) bean;
            idAware.setId(UUID.randomUUID().toString());
            log.info("set id generator for bean {}", beanName);
        }

        return bean;
    }
}
