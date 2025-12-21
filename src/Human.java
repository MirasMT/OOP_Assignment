public class Human {
    private int age;
    private String name;
    private boolean isHealthy = true;

    Human(int age, String name){
        this.age = age;
        this.name = name;
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

    void toSpeak(){
        System.out.println("Hello");
    }

    void toMove(){
        System.out.println("I moved");
    }

}
