public class OOPDemo {

    public static void main(String[] args) {

        Person person1 =
                new Person("Alex", 25);

        Person person2 =
                new CollegeStudent(
                        "Darshdeep",
                        22,
                        3.76,
                        "Computer Science"
                );

        person1.displayInfo();

        System.out.println();

        person2.displayInfo();
    }
}