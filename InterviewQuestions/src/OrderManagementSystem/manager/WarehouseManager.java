package OrderManagementSystem.manager;

import OrderManagementSystem.Warehouse;
import OrderManagementSystem.strategy.WarehouseSelectionStrategy;

import java.util.List;

public class WarehouseManager {
  List<Warehouse> warehouseList;
  WarehouseSelectionStrategy warehouseSelectionStrategy;

  public WarehouseManager(List<Warehouse> warehouseList, WarehouseSelectionStrategy warehouseSelectionStrategy) {
    this.warehouseList = warehouseList;
    this.warehouseSelectionStrategy = warehouseSelectionStrategy;
  }

  public void addWarehouse(Warehouse warehouse){
    warehouseList.add(warehouse);
  }

  public void removeWarehouse(Warehouse warehouse){
    warehouseList.remove(warehouse);
  }

  public Warehouse selectWarehouse(WarehouseSelectionStrategy warehouseSelectionStrategy){
    this.warehouseSelectionStrategy = warehouseSelectionStrategy;
    return warehouseSelectionStrategy.select(this.warehouseList);
  }
}
