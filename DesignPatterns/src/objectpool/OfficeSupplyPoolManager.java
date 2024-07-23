package objectpool;

import java.util.ArrayList;
import java.util.List;

public class OfficeSupplyPoolManager {

  List<OfficeSupply> freeSupplies = new ArrayList<>();
  List<OfficeSupply> usedSupplies = new ArrayList<OfficeSupply>();
  private static final int maxPoolSize = 10;
  private static final int currentPoolSize = 3;
  private static OfficeSupplyPoolManager instance = null;

  private OfficeSupplyPoolManager(){
    List<String> supplies = new ArrayList<>(List.of("Pen", "Pencil", "Stapler"));
    for(int i = 0; i < currentPoolSize; i++){
      freeSupplies.add(new OfficeSupply(supplies.get(i)));
    }
  }

  public static OfficeSupplyPoolManager getInstance(){
    if(instance == null){
      synchronized (OfficeSupplyPoolManager.class){
        if(instance == null){
          instance = new OfficeSupplyPoolManager();
        }
      }
    }
    return instance;
  }

  public synchronized OfficeSupply getSupply(String supplyName){
    if(freeSupplies.isEmpty() && usedSupplies.size() < maxPoolSize){
      freeSupplies.add(new OfficeSupply( supplyName));
    }
    else if(freeSupplies.isEmpty() && usedSupplies.size() == maxPoolSize){
      System.out.println("No more supplies available");
      return null;
    }
    OfficeSupply supply = freeSupplies.removeFirst();
    usedSupplies.add(supply);
    return supply;
  }

  public synchronized void releaseSupply(OfficeSupply supply){
    if(supply == null){
      return;
    }
    if(usedSupplies.contains(supply)){
      usedSupplies.remove(supply);
      freeSupplies.add(supply);
    }
  }
}
