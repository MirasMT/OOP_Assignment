package personnel.models;
import personnel.interfaces.IStudyable;

public final class Student extends Human implements IStudyable {
    private double GPA;
    private String degree;

    private final String universityName = "Astana IT University";

    public Student(double GPA, String degree, String name, int age){
        super(age, name);
        this.GPA = GPA;
        this.degree = degree;
    }

    public final void showUniversity() {
        System.out.println("I study at " + universityName);
    }

    @Override
    public void performDailyTask() {
        System.out.println("Attending lectures and taking notes.");
    }

    @Override
    public void study() {
        System.out.println("Studying for the midterms...");
    }
    @Override
    public void submitAssignment() {
        System.out.println("Assignment uploaded to the portal.");
    }

    @Override
    public void toSpeak(){
        System.out.println("Hello! My name is " + getName() + ". I'm a student. My GPA is " + GPA);
    }
    public double getGPA() {
        return GPA;
    }
    public void setGPA(double GPA) {
        if(GPA < 0) System.out.println("error");
        else this.GPA = GPA;
    }
}