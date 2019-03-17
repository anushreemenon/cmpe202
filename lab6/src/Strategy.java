import java.util.ArrayList;
import java.util.List;

public class Strategy {

    public static void main(String[] args) {

    	System.out.println("\t\     FIVE GUYS");
		System.out.println("\t      BURGERS AND FRIES");
		System.out.println("\t       Stores # CA-1294");
		System.out.println("\t    5353 ALMADEN EXPY N60");
		System.out.println("\t      SAN JOSE, CA 95118");
		System.out.println("\t       (P) 408-264-9300\n");
    	Order order = new Order("12/1/2016", "1:46:54 PM", 45);

        List<Items> itemsToBeAdded = new ArrayList<>();
        Items item1 = new Items("LBB", 5.59, 1,true);
        Items item2 = new Items("LTL CAJ", 2.79, 1,false);

        String[] OnTopBun = {"Lettuce", "Tomato"};

        String[] OnMeat = {"G Onion", "JALA Grilled"};


        item1.settoppingsOnMeat(OnMeat);
        item1.settoppingsOnTopBun(OnTopBun);
        item1.setMeat("Bacon");

        itemsToBeAdded.add(item1);
        itemsToBeAdded.add(item2);

        System.out.println(itemsToBeAdded.toString());
        order.setItemsInOrder(itemsToBeAdded);

        System.out.println("Displaying Receipt..");
        PrintOrder printOrder = new PrintOrder(new Receipt());
        printOrder.executeprintOrderStrategy(order);

        System.out.println("\n\nDisplaying Packing Slip..");
        printOrder = new PrintOrder(new PackingSlip());
        printOrder.executeprintOrderStrategy(order);

    }

}
