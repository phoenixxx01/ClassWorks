package class_activity1A;

public class Main {
    public static void main(String[] args) {
        IntershipForm obj1 = new IntershipForm( "John Doe", 21, "Male");
        IntershipForm obj2 = new IntershipForm( "Jane Dae", 27, "Female");


        System.out.println("Name: " + obj1.name );
        System.out.println("Age: " + obj1.age );
        System.out.println("Gender: " + obj1.gender );
    }
}
