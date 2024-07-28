BOOK MANAGEMENT SYSTEM 

Overview

This use case demonstrates the use of the Decorator Pattern to enhance the functionality of a basic book object with additional features like author names and publication dates. The Decorator Pattern is a structural design pattern that allows behavior to be added to individual objects, either statically or dynamically, without affecting the behavior of other objects from the same class.

Project Structure

•	Book.java: The Book interface defines the common method for getting the book's description.

•	BasicBook.java: The concrete implementation of the Book interface representing a simple book with just a title.

•	BookDecorator.java: The abstract decorator class that implements the Book interface and contains a reference to a Book object.

•	AuthorDecorator.java: A concrete decorator that adds the author's name to the book's description.

•	PublicationDecorator.java: A concrete decorator that adds the publication date to the book's description.

•	Main.java: The main class where the application is run, creating and decorating book objects.

Prerequisites : 

Java Development Kit (JDK) 8 or later installed on your system.

Compilation :

1.	Clone the repository.
2.	Navigate to the project directory.
3.	Compile the Java files using javac *.java command.
4.	Run the main class using java Main command.

