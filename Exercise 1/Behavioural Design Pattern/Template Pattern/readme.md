RESTAURANT SERVICE WORKFLOW

Overview

This use case  demonstrates the use of the Template design pattern in a restaurant service workflow. The Template Method pattern allows for defining the skeleton of an algorithm in a base class, while allowing subclasses to provide specific implementations for certain steps of the algorithm.

Project Structure

Base Class (RestaurantServiceWorkflow): Defines the overall process of serving a customer with a method serveCustomer() . This method outlines the sequence of operations:
 
  1. takeOrder()
  
  2. prepareFood()
  
  3. serveFood()
  
  4. processPayment()
  
  5. handleSpecialRequests()
 
  The serveFood(), processPayment(), and handleSpecialRequests() methods are implemented in the base class, while `takeOrder()` and `prepareFood()` are abstract methods to be implemented by subclasses.

Subclasses:

1.	DineInService

2.	TakeoutService

3.	DeliveryService

To use this implementation, create an instance of one of the concrete subclasses and call the `serveCustomer()` method:

Prerequisites:

Java Development Kit (JDK) 8 or later installed on your system.

Compilation:

1.	Clone the repository.
2.	Navigate to the project directory.
3.	Compile the Java files using javac *.java command.
4.	Run the main class using java Main command.
