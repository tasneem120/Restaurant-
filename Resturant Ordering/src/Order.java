import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Order {

   private String  ID ;
    ArrayList <MenuItem> orders;
    Status status;
    public Order() {
        ID= UUID.randomUUID().toString();
        orders=new ArrayList<>();
        status= Status.PENDING;
    }
    public  void addItem(MenuItem order) {
        orders.add(order);
    }
    public void cancel(){

        if(status==Status.PENDING){
            status= Status.CANCELLED;
        }
    }
    public  String  getID(){
        return ID;
    }
    public  double getTotalPrice(){
        double totalPrice=0;
        for(MenuItem order:orders){
            totalPrice+=order.getPrice();
        }
        return totalPrice;
    }
    public Status getStatus() {
        return status;
    }
    public  void  setStatus(Status status) {
        this.status=status;
    }
    public List<MenuItem> getOrders() {
        return orders;
    }
}
