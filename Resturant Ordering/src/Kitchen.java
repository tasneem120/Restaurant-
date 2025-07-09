import java.util.ArrayList;

public class Kitchen {

 private ArrayList<Order> orders=new ArrayList<>();

 public void addOrder(Order order) {
 orders.add(order);
     System.out.println("Order added");
 }


 public void  startOrder(String orderId) {
   for(Order order : orders) {
       if (order.getID().equals(orderId)&&order.getStatus()== Status.PENDING) ;
       {
           order.setStatus(Status.PENDING);
           System.out.println("Order started: " + orderId);
           return;
       }

       }
     System.out.println("Order not found or already in progress.");

   }
    public void completeOrder(String orderId) {
        for (Order order : orders) {
            if (order.getID().equals(orderId) && order.getStatus() == Status.IN_PROGRESS) {
                order.setStatus(Status.COMPLETED);
                System.out.println("Order completed: " + orderId);
                return;
            }
        }
        System.out.println("Order not found or not in progress.");
    }
    public  void  viewAllOrders() {
     for (Order order : orders) {
         System.out.println("Order ID: " + order.getID());
         System.out.println("Status: " + order.getStatus());
         System.out.println("Items:");
         for (MenuItem item:order.getOrders()){
             System.out.println(" - " + item.getName() + " (" + item.getPrice() + " LE)");
         }
         System.out.println("Total: " + order.getTotalPrice() + " LE");

         System.out.println("-----");
     }
    }
 }



