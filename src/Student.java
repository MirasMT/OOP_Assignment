public class Student extends Human {
    private double GPA;
    private String degree;

    Student(double GPA, String degree, String name, int age){
        super(age, name);
        this.GPA = GPA;
        this.degree = degree;

    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        if(GPA < 0)
            System.out.println("error");
        else
            this.GPA = GPA;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    @Override
    void toSpeak(){
        System.out.println("Hello! My name is " + getName() + ". I'm a student. My GPA is " + GPA);
    }
}
