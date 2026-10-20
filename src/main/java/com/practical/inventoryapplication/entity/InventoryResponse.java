package com.practical.inventoryapplication.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class InventoryResponse {
    int available_quantity;
    String item_location;
    List<Item> items;
    OrderInformation orderInformation;
}
