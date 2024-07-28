package virtualclassroom;

import virtualclassroom.models.Classroom;
import virtualclassroom.models.Student;
import virtualclassroom.models.Assignment;
import virtualclassroom.services.ClassroomManager;
import virtualclassroom.exceptions.ClassroomNotFoundException;
import virtualclassroom.exceptions.StudentNotFoundException;
import virtualclassroom.exceptions.StudentAlreadyEnrolledException;
import virtualclassroom.utils.Logger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClassroomManager classroomManager = ClassroomManager.getInstance();
       System.out.println("VIRTUAL CLASSROOM MANAGER");
        while (true) {
            System.out.println("Enter command:");
            String input = scanner.nextLine();
            String[] parts = input.split(" ");

            try {
                switch (parts[0]) {
                    case "add_classroom":
                        classroomManager.addClassroom(parts[1]);
                        break;
                    case "add_student":
                        classroomManager.addStudent(parts[1], parts[2]);
                        break;
                    case "schedule_assignment":
                        classroomManager.scheduleAssignment(parts[1], parts[2]);
                        break;
                    case "submit_assignment":
                        classroomManager.submitAssignment(parts[1], parts[2], parts[3]);
                        break;
                    case "list_classrooms":
                        classroomManager.listClassrooms();
                        break;
                    case "list_students":
                        classroomManager.listStudents(parts[1]);
                        break;
                    case "list_assignments":
                        classroomManager.listAssignments(parts[1]);
                        break;
                     case "remove_classroom":
                        classroomManager.removeClassroom(parts[1]);
                        break;
                     case "printclassroomdetails":
                         classroomManager.printClassroomDetails(parts[1]);
                         break;
                    case "exit":
                        System.exit(0);
                    default:
                        System.out.println("Invalid command.");
                        break;
                }
            } catch (ClassroomNotFoundException | StudentNotFoundException  |StudentAlreadyEnrolledException e) {
                Logger.log(e.getMessage());
               System.out.println();
            }
        }
    }
}
