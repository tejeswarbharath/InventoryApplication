package com.practical.inventoryapplication.entity;

import java.util.List;

public record OrderInformation(String order_id, List<Item> items, String customer_id) {
}
