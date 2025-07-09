public class Main {
  public static void main(String[] args) {
    Order order = new Order("HTTP001", "VAIBHAV DARADE", "Clutch Kit", 5);
    System.out.println("✅ JMS Processing Order: " + order);
  }
}

class Order {
  String orderId, customer, item;
  int quantity;

  Order(String orderId, String customer, String item, int quantity) {
    this.orderId = orderId;
    this.customer = customer;
    this.item = item;
    this.quantity = quantity;
  }

  public String toString() {
    return "{orderId=" + orderId + ", customer=" + customer + ", item=" + item + ", quantity=" + quantity + "}";
  }
}
