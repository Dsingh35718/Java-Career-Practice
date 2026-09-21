public class CollegeStudent extends Person {

    private double gpa;
    private String major;

    public CollegeStudent(String name, int age,
                          double gpa, String major) {

        super(name, age);

        this.gpa = gpa;
        this.major = major;
    }

    @Override
    public void displayInfo() {

        super.displayInfo();

        System.out.println("GPA: " + gpa);
        System.out.println("Major: " + major);
    }
}