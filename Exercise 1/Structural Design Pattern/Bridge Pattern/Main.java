public class Main {
    public static void main(String[] args) {
        TransportMode bus = new Bus();
        TransportMode train = new Train();
        TransportMode flight = new Flight();

        TransportController busController = new BusController(bus);
        TransportController trainController = new TrainController(train);
        TransportController flightController = new FlightController(flight);

        busController.sendRequest("Madurai", "Chennai");
        trainController.sendRequest("Madurai", "Chennai");
        flightController.sendRequest("Madurai", "Chennai");
    }
}