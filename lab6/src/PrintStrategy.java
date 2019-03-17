class PrintStrategy {

    public Print printorder;

    OrderContext(PrintOrder printorder){
        this.printstrategy = printorder;
    }

    void executeprintorder(Order order){

        printorder.printReceipt(order);
    }
}