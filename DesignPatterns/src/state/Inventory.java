package state;

public class Inventory {
  ItemShelf[]  inventory;

  public Inventory(int itemCount){
    inventory = new ItemShelf[itemCount];
    initializeInventory();
  }

  public ItemShelf[] getInventory(){
    return inventory;
  }

  public void setInventory(ItemShelf[] inventory){
    this.inventory = inventory;
  }

  public Item getItem(int code){
    for(ItemShelf shelf : inventory){
      if(shelf.getCode() == code){
        return shelf.getItem();
      }
    }
    return null;
  }

  public void updateItemAvailability(int code){
    for(ItemShelf shelf : inventory){
      if(shelf.getCode() == code){
        shelf.setAvailable(false);
      }
    }
  }

  public void initializeInventory(){
    int startCode = 101;
    for(int i = 0 ; i < inventory.length;i++){
      ItemShelf item = new ItemShelf();
      item.setCode(startCode++);
      item.setAvailable(false);
      inventory[i] = item;
    }
  }

  public void addItem(int code , Item item) throws Exception {
    for(ItemShelf shelf : inventory){
      if(shelf.getCode() == code){
        if(shelf.isAvailable()){
          throw new Exception("Item already exists in the shelf");
        }
        shelf.setItem(item);
        shelf.setAvailable(true);
      }
    }
  }
}
