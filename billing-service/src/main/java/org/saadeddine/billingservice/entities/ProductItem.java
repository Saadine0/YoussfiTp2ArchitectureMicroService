package org.saadeddine.billingservice.entities;

import jakarta.persistence.*;
import lombok.*;
import org.saadeddine.billingservice.model.Product;

import java.math.BigDecimal;

@Entity
@NoArgsConstructor @AllArgsConstructor @Getter @Setter @Builder
public class ProductItem {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String productId;
    @ManyToOne
    private Bill bill;
    private int quantity;
    private double unitPrice;
    @Transient private Product product;

}
