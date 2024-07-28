package virtualclassroom.services;

import virtualclassroom.models.*;
import virtualclassroom.exceptions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ClassroomManager {
    private static ClassroomManager instance;
    private final List<Classroom> classrooms;

    private ClassroomManager() {
        classrooms = new ArrayList<>();
    }

    public static synchronized ClassroomManager getInstance() {
        if (instance == null) {
            instance = new ClassroomManager();
        }
        return instance;
    }

    public void addClassroom(String name) {
        Classroom classroom = new Classroom(name);
        classrooms.add(classroom);
        System.out.println("Classroom " + name + " has been created.");
    }
    public void removeClassroom(String name) throws ClassroomNotFoundException {
        Classroom classroom = findClassroomByName(name);
        classrooms.remove(classroom);
        System.out.println("Classroom " + name + " has been removed.");
    }
    public void addStudent(String studentId, String className) throws ClassroomNotFoundException, StudentAlreadyEnrolledException{
        Classroom classroom = findClassroomByName(className);
          if (classroom.getStudents().stream().anyMatch(s -> s.getId().equals(studentId))) {
            throw new StudentAlreadyEnrolledException("Student with ID " + studentId + " is already enrolled in classroom " + className);
        }
        Student student = new Student(studentId);
        classroom.addStudent(student);
        System.out.println("Student " + studentId + " has been enrolled in " + className + ".");
    }

    public void scheduleAssignment(String className, String details) throws ClassroomNotFoundException {
        Classroom classroom = findClassroomByName(className);
        Assignment assignment = new Assignment(details, null);
        classroom.addAssignment(assignment);
        System.out.println("Assignment for " + className + " has been scheduled.");
    }

    public void submitAssignment(String studentId, String className, String details) throws ClassroomNotFoundException, StudentNotFoundException {
        Classroom classroom = findClassroomByName(className);
        Optional<Student> student = classroom.getStudents().stream().filter(s -> s.getId().equals(studentId)).findFirst();
        Optional<Assignment> optionalAssignment = classroom.getAssignments().stream()
                    .filter(a -> a.getDetails().equals(details))
                    .findFirst();
        if (student.isPresent() ) {
        if(optionalAssignment.isPresent()){
            Assignment assignment = new Assignment(details, studentId);
            classroom.addAssignment(assignment);
            System.out.println("Assignment submitted by Student " + studentId + " in " + className + ".");
        } 
       else
      {  
            System.out.println("Assignment is not scheduled.");
       }
     }
        else {
            throw new StudentNotFoundException("Student with ID " + studentId + " not found in classroom " + className);
        }
    }
  
 
    public void listClassrooms() {
        for (Classroom classroom : classrooms) {
            System.out.println("Classroom: " + classroom.getName());
        }
    }

    public void listStudents(String className) throws ClassroomNotFoundException {
        Classroom classroom = findClassroomByName(className);
        System.out.println("Students in " + className + ":");
        for (Student student : classroom.getStudents()) {
            System.out.println(" - " + student.getId());
        }
    }

    public void listAssignments(String className) throws ClassroomNotFoundException {
        Classroom classroom = findClassroomByName(className);
        System.out.println("Assignments for " + className + ":");
        for (Assignment assignment : classroom.getAssignments()) {
            System.out.println(" - " + assignment.getDetails() + " (submitted by: " + assignment.getSubmittedBy() + ")");
        }
    }
     public void printClassroomDetails(String className) throws ClassroomNotFoundException {
        System.out.println("Classroom: " + className);
        Classroom classroom = findClassroomByName(className);
        System.out.println("Students:");
         for (Student student : classroom.getStudents()) {
         System.out.println(" - " + student.getId());
        }
        System.out.println("Assignments:");
        for (Assignment assignment : classroom.getAssignments()) {
            System.out.println(" - " + assignment.getDetails() + " (submitted by: " + assignment.getSubmittedBy() + ")");
        }
    }
    private Classroom findClassroomByName(String name) throws ClassroomNotFoundException {
        Optional<Classroom> classroom = classrooms.stream().filter(c -> c.getName().equals(name)).findFirst();
        if (classroom.isPresent()) {
            return classroom.get();
        } else {
            throw new ClassroomNotFoundException("Classroom with name " + name + " not found");
        }
    }
   
}
