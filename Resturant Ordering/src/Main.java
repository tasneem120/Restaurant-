//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
 Kitchen kitchen = new Kitchen();

 MenuItem pizza=new Pizza();
 MenuItem burger=new Burger();
 MenuItem salad=new Salad();
        Order order1 = new Order();
        order1.addItem(pizza);
        order1.addItem(burger);
        kitchen.addOrder(order1);



        Order order2 = new Order();
        order2.addItem(salad);
        order2.addItem(salad);
        kitchen.addOrder(order2);

        System.out.println("\n📋 Orders Overview:");
        kitchen.viewAllOrders();

        // Start and complete orders
        kitchen.startOrder(order1.getID());
        kitchen.completeOrder(order1.getID());

        System.out.println("\n📋 Orders After Completion:");
        kitchen.viewAllOrders();
    }
}