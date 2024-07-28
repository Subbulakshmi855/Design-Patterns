CITY TRANSPORTATION SYSTEM

Overview

This use case demonstrates the Bridge design pattern. This pattern helps in managing various modes of transportation (such as Bus, Train, and Flight) between different cities. By using the Bridge pattern, we decouple the high-level abstraction of transport controllers from their specific implementations, allowing for greater flexibility and scalability.

Project Structure

•	TransportMode.java: Defines the interface for various transport modes. It includes a method for booking a ticket.

•	Bus.java, Train.java, Flight.java: Implementations of the TransportMode interface, each representing a different mode of transportation.

•	TransportController.java: An abstract class that uses a TransportMode to handle transport requests.

•	BusController.java, TrainController.java, FlightController.java: Concrete implementations of the TransportController class, each corresponding to a specific transport mode (Bus, Train, Flight).

•	Main.java: The entry point of the application where instances of transport modes and controllers are created, and travel requests are processed.

Prerequisites:

Java Development Kit (JDK) 8 or later installed on your system.

Compilation:

1.	Clone the repository.
2.	Navigate to the project directory.
3.	Compile the Java files using javac *.java command.
4.	Run the main class using java Main command

