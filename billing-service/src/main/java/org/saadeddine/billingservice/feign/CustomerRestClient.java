package org.saadeddine.billingservice.feign;

import org.saadeddine.billingservice.model.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "CUSTOMERSERVICE")
public interface CustomerRestClient {

    @GetMapping("/customers")
    PagedModel<Customer> getAllCustomers();  // HAL JSON

    @GetMapping("/customers/{id}")
    Customer findCustomerById(@PathVariable Long id);
}
