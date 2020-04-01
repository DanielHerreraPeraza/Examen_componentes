package com.cenfotec.examen.service;

import com.cenfotec.examen.domain.Warehouse;
import com.cenfotec.examen.repository.WarehouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WarehouseServiceImpl implements WarehouseService {

    @Autowired
    WarehouseRepository warehouseRepo;

    @Override
    public void saveWarehouse(Warehouse newWarehouse) {
        warehouseRepo.save(newWarehouse);
    }

    @Override
    public List<Warehouse> getAllWarehouses() {
        return warehouseRepo.findAll();
    }
}
