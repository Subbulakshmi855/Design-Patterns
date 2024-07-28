abstract class TransportController {
    protected TransportMode transportMode;

    protected TransportController(TransportMode transportMode) {
        this.transportMode = transportMode;
    }

    abstract void sendRequest(String source, String destination);
}