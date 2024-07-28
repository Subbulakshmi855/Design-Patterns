class Bus implements TransportMode {
    @Override
    public void bookTicket(String source, String destination) {
        System.out.println("Booking a bus ticket from " + source + " to " + destination + ".");
    }
}