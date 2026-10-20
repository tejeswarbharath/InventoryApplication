package com.practical.inventoryapplication.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name="inventory")
public record Inventory(@Id long inventory_id, @OneToMany List<Item> items, int available_quantity, String item_location) {
}
