STUDY SESSION STATE PATTERN

Overview

This use case demonstrates the implementation of the State Pattern in Java. The State Pattern is a behavioural design pattern that allows an object to change its behaviour when it’s internal state changes. This example models a study session that transitions through different states: Lecture, Discussion, Group Work, and Individual Study.

Project Structure

•	StudyState.java: Defines the StudyState interface, which declares the handleRequest method.

•	LectureState.java: Implements the StudyState interface to represent the lecture state.

•	DiscussionState.java: Implements the StudyState interface to represent the discussion state.

•	GroupWorkState.java: Implements the StudyState interface to represent the group work state.

•	IndividualStudyState.java: Implements the StudyState interface to represent the individual study state.

•	StudySession.java: The context class that maintains the current state and delegates behavior to it.

•	Main.java: The main class that demonstrates the usage of the State Pattern by executing the study session and transitioning through the states.


Prerequisites:

Java Development Kit (JDK) 8 or later installed on your system.

Compilation:

1.	Clone the repository.
2.	Navigate to the project directory.
3.	Compile the Java files using javac *.java command.
4.	Run the main class using java Main command.
