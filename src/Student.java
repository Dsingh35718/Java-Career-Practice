public class Student {

    private String name;
    private int age;
    private double gpa;
    private String major;

    public Student(String name, int age, double gpa, String major) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGpa() {
        return gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void displayStudent() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
        System.out.println("Major: " + major);
    }
}