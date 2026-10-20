package com.practical.inventoryapplication.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "item")
public record Item(@Id long item_id, String item_name, double item_price) {
}
