package com.org1.platform.roboshop.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UuidGenerator;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Builder @Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Inventory")
public class Inventory {

    @Id
    @GeneratedValue
    @UuidGenerator
    private String inventoryId;
    private String batchId;
    private String name;
    private BigDecimal price;
    private String manufacturerName;
    @CreationTimestamp
    private Date manufactureDate;
}
