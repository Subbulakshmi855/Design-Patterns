class BusController extends TransportController {
    public BusController(TransportMode transportMode) {
        super(transportMode);
    }

    @Override
    void sendRequest(String source, String destination) {
        transportMode.bookTicket(source, destination);
    }
}