/**
 * The Student class represents a student with a name and date of birth, and it includes methods to
 * display the student's name, age, and their enrolled courses and marks.
 */
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Student extends StudentCourse {
    public String name;
    public String dob;

    public void displayName() {
        System.out.println("Student Name: " + name);
    }

   // The `displayAge` method calculates and displays the age of a student based on their date of
   // birth.
    public void displayAge(String dob) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate birthDate = LocalDate.parse(dob, formatter);
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthDate, currentDate);
        int age = period.getYears();
        System.out.println("Age of student: " + age +"years");


    }

   // The `main` method is the entry point of the Java program. It creates an instance of the `Student`
   // class and an instance of the `StudentCourse` class.
    public static void main(String[] args) {
        Student s=new Student();
        StudentCourse s1 = new StudentCourse();
        s.name = "Kavya C";
        s.displayName();
        s.displayAge("19-06-2004");
        s1.displayStudentcourses();
        s1.displayStudentMarks();

    }
}
