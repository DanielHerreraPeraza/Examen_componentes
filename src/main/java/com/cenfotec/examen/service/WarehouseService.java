package com.cenfotec.examen.service;

import com.cenfotec.examen.domain.Warehouse;

import java.util.List;

public interface WarehouseService {

    void saveWarehouse(Warehouse newWarehouse);
    List<Warehouse> getAllWarehouses();
    
}
