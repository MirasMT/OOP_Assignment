package personnel.models;


import personnel.interfaces.*;

public class Employee extends Human implements IWorkable, IStudyable {
    private double salary;
    private String specialization;
    public static int id = 0;

    public Employee(double salary, String specialization, String name, int age) {
        super(age, name);
        this.salary = salary;
        this.specialization = specialization;
        id++;
    }

    @Override
    public void performDailyTask() {
        System.out.println("Working on professional projects.");
    }
    @Override public void clockIn() {
        System.out.println(getName() + " clocked in for work.");
    }
    @Override public void finishTask() {
        System.out.println(getName() + " finished a work task.");
    }
    @Override public void study() {
        System.out.println(getName() + " is learning new industry skills.");
    }
    @Override public void submitAssignment() {
        System.out.println(getName() + " submitted a certification lab.");
    }

    @Override
    public void toSpeak() {
        System.out.println("Hello! My name is " + getName() + ". I'm an employee #" + id + ". My salary is " + salary);
    }
}