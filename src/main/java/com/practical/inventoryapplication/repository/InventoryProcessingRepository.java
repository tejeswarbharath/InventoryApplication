package com.practical.inventoryapplication.repository;

import com.practical.inventoryapplication.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryProcessingRepository extends JpaRepository<Inventory, Long> {
}
