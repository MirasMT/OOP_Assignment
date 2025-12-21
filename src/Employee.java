public class Employee extends Human {
    private double salary;
    private String specialization;
    public static int id = 0;

    Employee(double salary, String specialization, String name, int age) {
        super(age, name);
        this.salary = salary;
        this.specialization = specialization;
        id++;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0)
            System.out.println("error");
        else
            this.salary = salary;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    void toSpeak() {
        System.out.println("Hello! My name is " + getName() + ". I'm an employee #" + id + ". My salary is " + salary);
    }
}
