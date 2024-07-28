abstract class RestaurantServiceWorkflow {
    public final void serveCustomer() {
        takeOrder();
        prepareFood();
        serveFood();
        processPayment();
        handleSpecialRequests();
    }
    protected abstract void takeOrder();
    protected abstract void prepareFood();
    protected void serveFood() {
        System.out.println("Serving the food to the customer.");
    }
    protected void processPayment() {
        System.out.println("Processing the payment.");
    }
    protected void handleSpecialRequests() {
        System.out.println("Handling any special requests from the customer.");
    }
}


