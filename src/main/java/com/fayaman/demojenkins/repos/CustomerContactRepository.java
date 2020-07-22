package com.fayaman.demojenkins.repos;

import com.fayaman.demojenkins.domain.CustomerContact;
import org.springframework.data.repository.CrudRepository;

public interface CustomerContactRepository extends CrudRepository<CustomerContact, Long> {
    public CustomerContact findByEmail(String email);

}
