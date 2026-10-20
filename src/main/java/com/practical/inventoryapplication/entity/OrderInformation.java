package com.practical.inventoryapplication.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="order")
public record OrderInformation(@Id String order_id, @OneToMany List<Item> items, String customer_id) {
}
