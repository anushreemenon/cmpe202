class Toppings {
	
    int quantity;
    double total;
    String name;
    double price;
    boolean haveToppings;

    String[] OnTopBun;
    String[] OnMeat;

    String meat;

    

    Items(int quantity,boolean haveToppings,String name, double price) {
    	this.quantity = quantity;
        this.total = price * quantity;
        this.name = name;
        this.price = price;
        this.haveToppings = haveToppings;
    }

    void settoppingsOnTopBun(String[] OnTopBun){

        this.OnTopBun = OnTopBun;
    }

    void settoppingsOnMeat(String[] OnMeat){
        this.OnMeat = OnMeat;
    }

    void setMeat(String meat){
        this.meat = meat;
    }
}
