class DineInService extends RestaurantServiceWorkflow {
    @Override
    protected void takeOrder() {
        System.out.println("Taking order from a table.");
    }
    @Override
    protected void prepareFood() {
        System.out.println("Preparing food for dine-in service.");
    }
}

