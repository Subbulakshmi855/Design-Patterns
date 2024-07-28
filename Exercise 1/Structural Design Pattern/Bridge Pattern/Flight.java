class Flight implements TransportMode {
    @Override
    public void bookTicket(String source, String destination) {
        System.out.println("Booking a flight ticket from " + source + " to " + destination + ".");
    }
}