package virtualclassroom.models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Classroom {
    private final String id;
    private final String name;
    private final List<Student> students;
    private final List<Assignment> assignments;

    public Classroom(String name) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.students = new ArrayList<>();
        this.assignments = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Assignment> getAssignments() {
        return assignments;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addAssignment(Assignment assignment) {
        assignments.add(assignment);
    }

    public void printClassroomDetails() {
        System.out.println("Classroom: " + name);
        System.out.println("Students:");
        for (Student student : students) {
            System.out.println(" - " + student.getId());
        }
        System.out.println("Assignments:");
        for (Assignment assignment : assignments) {
            System.out.println(" - " + assignment.getDetails());
        }
    }
}
