PIZZA BUILDER 

Overview

This use case demonstrates the Builder Pattern using a customizable pizza example in Java. The Builder Pattern helps in constructing complex objects by separating the construction process from the representation. This example illustrates how to build different types of pizzas with various configurations.

Project Structure

•	Pizza.java:  Represents the pizza with attributes for size, crust, and toppings.

•	PizzaBuilder.java: Defines the builder interface for setting pizza attributes.

•	ConcretePizzaBuilder.java: Implements the PizzaBuilder interface and constructs the pizza.

•	PizzaDirector.java: Directs the construction process using the builder to create specific types of pizzas.

•	Main.java: Demonstrates how to use the builder and director to create pizzas.

Prerequisites :
Java Development Kit (JDK) 8 or later installed on your system.

Compilation
1.	Clone the repository.
2.	Navigate to the project directory.
3.	Compile the Java files using javac *.java command.
4.	Run the main class using java Main command.

