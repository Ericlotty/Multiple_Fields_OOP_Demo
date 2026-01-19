package MultipleFieldsOOP_Demo;
//Introduction to classes: Multiple fields
public class Store {
  // instance fields
  public String productType;
  public int inventoryCount;
  public double inventoryPrice;
  
  // constructor method
  public Store(String product, int count, double price) {
    productType = product;
    inventoryCount = count;
    inventoryPrice = price;
  }

  public String getProductType() {
    return productType;
  }

   public int getInventoryCount() {
    return inventoryCount;
  }

  public double getInventoryPrice() {
    return inventoryPrice;
  }
}