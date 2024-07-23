package objectpool;

public class Client {
  public static void main(String[] args) {
    OfficeSupplyPoolManager officeSupplyPoolManager = OfficeSupplyPoolManager.getInstance();
    OfficeSupply supply1 = officeSupplyPoolManager.getSupply("Pen");
    OfficeSupply supply2 = officeSupplyPoolManager.getSupply("Pencil");
    OfficeSupply supply3 = officeSupplyPoolManager.getSupply("Stapler");
    OfficeSupply supply4 = officeSupplyPoolManager.getSupply("Whitener");
    OfficeSupply supply5 = officeSupplyPoolManager.getSupply("Highlighter");
    OfficeSupply supply6 = officeSupplyPoolManager.getSupply("Eraser");

    officeSupplyPoolManager.releaseSupply(supply1);
    OfficeSupply supply7 = officeSupplyPoolManager.getSupply("Pen");
  }
}
