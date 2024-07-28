class FlightController extends TransportController {
    public FlightController(TransportMode transportMode) {
        super(transportMode);
    }
    @Override
    void sendRequest(String source, String destination) {
        transportMode.bookTicket(source, destination);
    }
}