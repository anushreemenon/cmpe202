public class PackingSlip implements PrintOrder {

    @Override
    public void printOrderReceipt(Order order) {
    	System.out.println("\t\t  FIVE GUYS");
		System.out.println("\t      BURGERS AND FRIES");
		System.out.println("\t       Stores # CA-1294");
		System.out.println("\t    5353 ALMADEN EXPY N60");
		System.out.println("\t      SAN JOSE, CA 95118");
		System.out.println("\t       (P) 408-264-9300\n");
        System.out.println(order.date + "    " + order.time);
        System.out.println("Order Number " + order.orderNumber);

        for (Items item : order.items) {
            System.out.println(item.name);
            if (item.haveToppings){
                for (String topping: item.toppingsOnTopBun)
                    System.out.println(topping);
                for (String topping: item.toppingsOnMeat)
                    System.out.println("->| " + topping);
                System.out.println("{{{{ "+ item.meat +"}}}}");
            }
            System.out.println("\n");
        }

    }

}
