package OrderManagementSystem.strategy;

import OrderManagementSystem.Warehouse;

import java.util.List;

public class NearestWarehouseSelectionStrategy extends WarehouseSelectionStrategy {
  @Override
  public Warehouse select(List<Warehouse> warehouseList) {
    return warehouseList.getFirst();
  }
}
