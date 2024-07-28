class Train implements TransportMode {
    @Override
    public void bookTicket(String source, String destination) {
        System.out.println("Booking a train ticket from " + source + " to " + destination + ".");
    }
}