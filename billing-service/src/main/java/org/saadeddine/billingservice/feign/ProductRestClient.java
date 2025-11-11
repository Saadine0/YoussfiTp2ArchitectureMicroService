package org.saadeddine.billingservice.feign;

import org.saadeddine.billingservice.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "inventoryservice")
public interface ProductRestClient {

    @GetMapping("/products")
    PagedModel<Product> getAllProducts();  // HAL JSON

    @GetMapping("/products/{id}")
    Product getProductById(@PathVariable String id);
}
