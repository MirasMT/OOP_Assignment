import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        Human human1 = new Human(age, name);

        Student student = new Student(2.1, "Bachelor", human1.getName(), human1.getAge());
        student.setGPA(3);
        System.out.println("I increased my GPA to " + student.getGPA());
        student.toSpeak();

        Employee employee1 = new Employee(21000, "IT", "Tom", 31);
        employee1.toSpeak();

        Employee employee2 = new Employee(45000, "Teacher", "Marat", 24);
        employee2.toSpeak();

        Employee employee3 = new Employee(34000, "Doctor", "Murat", 32);
        employee3.toSpeak();
    }

}