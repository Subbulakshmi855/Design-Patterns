VIRTUAL CLASSROOM MANAGER

Overview

The Virtual Classroom Manager is a terminal-based application designed for managing virtual classrooms. It allows to add and remove classrooms, enroll students, schedule and submit assignments.

Features

- Add and remove virtual classrooms.
  
- Enroll students in classrooms.
  
- Schedule and submit assignments.

- List the students, assignments scheduled and assignment completed details in virtual classrooms. ( viewing the classroom details).

Design Patterns Used

•	Singleton Pattern: Ensures a single instance of `ClassroomManager` class.

•	Factory Pattern: Implicitly used when creating instances of Student and Assignment.

•	Command Pattern: Handling user commands in the Main class.

Usage

1. Add Classroom:
 
add_classroom  <class_name>

3. Remove Classroom:

remove_classroom  <class_name>

4. Add Student:

add_student  <student_id>  <class_name>

5. Schedule Assignment:

schedule_assignment   <class_name>  <assignment_details (assignment name)> 

6. Submit Assignment:

submit_assignment  <student_id>  <class_name>  <assignment_details (assignment name)>

7. List Classrooms:

list_classrooms 

8. List Students in Classroom:

list_students <class_name>

9. List Assignments in Classroom:

list_assignments <class_name>

10. Print Classroom details:

printclassroomdetails <class_name>

11. Exit Application:

exit


Compilation and Execution:

Prerequisites:
- Java Development Kit (JDK) 8 or later.

Steps:
1. Clone the repository.
2. Navigate to the `src` directory.
3. Compile the source files using the command: javac virtualclassroom/Main.java virtualclassroom/models/*.java virtualclassroom/services/*.java virtualclassroom/exceptions/*.java virtualclassroom/utils/*.java
4. Run the application using the command: java virtualclassroom.Main



