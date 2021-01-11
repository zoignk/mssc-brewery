package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDTO;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerService {
    public CustomerDTO getById(UUID customerId) {
        return CustomerDTO.builder().id(UUID.randomUUID()).name("Customer Beer Drinker").build();
    }
}
