class TrainController extends TransportController {
    public TrainController(TransportMode transportMode) {
        super(transportMode);
    }

    @Override
    void sendRequest(String source, String destination) {
        transportMode.bookTicket(source, destination);
    }
}