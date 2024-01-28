/**
 * The Student class in Java defines a student object with properties such as name and date of birth,
 * and methods to display the name and calculate the age of the student.
 */
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Student {
    public String name;
    public String dob;

    public void displayName() {
        System.out.println("Student Name: " + name);
    }

    // The `displayAge` method takes a string parameter `dob` which represents the date of birth of a
    // student.
    public void displayAge(String dob) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate birthDate = LocalDate.parse(dob, formatter);
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthDate, currentDate);
        int age = period.getYears();
        System.out.println("Age of student: " + age +"years");


    }

   // The `main` method is the entry point of the Java program. It is a special method that is
   // automatically called when the program starts running.
    public static void main(String[] args) {
        Student s=new Student();
        s.name = "Kavya C";
        s.displayName();
        s.displayAge("19-06-2004");
        

    }
}
