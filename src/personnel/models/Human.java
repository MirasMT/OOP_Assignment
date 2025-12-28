package personnel.models;

public abstract class Human {
    protected int age;
    protected String name;
    protected boolean isHealthy = true;

    public Human(int age, String name){
        this.age = age;
        this.name = name;
    }

    public abstract void performDailyTask();

    public void toSpeak(){
        System.out.println("Hello");
    }

    public void toMove(){
        System.out.println("I moved");
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public boolean isHealthy() {
        return isHealthy;
    }
    public void setHealthy(boolean healthy) {
        isHealthy = healthy;
    }
}
