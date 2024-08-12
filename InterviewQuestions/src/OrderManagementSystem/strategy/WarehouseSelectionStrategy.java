package OrderManagementSystem.strategy;

import OrderManagementSystem.Warehouse;

import java.util.List;

public abstract class WarehouseSelectionStrategy {
  public abstract Warehouse select(List<Warehouse> warehouseList);
}
