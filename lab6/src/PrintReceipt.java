public class Receipt implements PrintOrder {


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
            System.out.println(item.name + "\t\t" + item.total);
            if (item.haveToppings){
                System.out.println("{{{{ "+ item.meat +"}}}}");
                for (String topping: item.OnTopBun)
                    System.out.println(topping);
                for (String topping: item.OnMeat)
                    System.out.println("->| " + topping);
            }
            System.out.println("");
        }
        System.out.println("Sub. Total:\t\t:" + order.getOrderSubtotal());
        System.out.println("  Tax:       \t\t" + fmt.format(subTotal*0.09));        
        System.out.println("  Total:     \t\t" + fmt.format(totalPrice));  
        System.out.println("  Cash $20     \t\t"+"$"+ fmt.format(cash)); 
        System.out.println("  Change     \t\t"+"$"+ fmt.format(cash-totalPrice)); 

    }

}
