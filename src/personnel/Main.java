package personnel;

import java.util.Scanner;
import personnel.models.*;
import personnel.interfaces.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        Student student = new Student(2.1, "Bachelor", name, age);

        Human employee1 = new Employee(21000, "IT", "Tom", 31);

        IWorkable employee2 = new Employee(45000, "Teacher", "Marat", 24);
        IStudyable employee3 = new Employee(34000, "Doctor", "Murat", 32);

        System.out.println("\n--- Student Usage ---");
        student.setGPA(3);
        System.out.println("I increased my GPA to " + student.getGPA());
        student.toSpeak();
        student.study();
        student.showUniversity();
        student.performDailyTask();

        System.out.println("\nEmployee 1 - Human reference): ");
        employee1.toSpeak();
        employee1.performDailyTask();

        System.out.println("\nEmployee 2 - IWorkable reference: ");
        employee2.clockIn();
        employee2.finishTask();

        System.out.println("\nEmployee 3 - IStudyable reference: ");
        employee3.study();
    }
}