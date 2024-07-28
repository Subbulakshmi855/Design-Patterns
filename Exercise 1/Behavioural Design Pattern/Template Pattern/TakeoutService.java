class TakeoutService extends RestaurantServiceWorkflow {
    @Override
    protected void takeOrder() {
        System.out.println("Taking takeout order over the phone or online.");
    }
    @Override
    protected void prepareFood() {
        System.out.println("Preparing food for takeout.");
    }
}