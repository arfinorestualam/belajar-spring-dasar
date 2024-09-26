package pzn.belajarspringdasar.service;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pzn.belajarspringdasar.repository.CustomerRepository;

//belajar field based DI
@Component
public class CustomerService {
    @Getter
    @Autowired
    private CustomerRepository customerRepository;
}
