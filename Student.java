//package Program2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Student {
      String name; 
    LocalDate dob; 
 
    public Student(String name, String dobStr) { 
        this.name = name; 
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy"); 
        this.dob = LocalDate.parse(dobStr, formatter); 
    } 
 
    public void displayDetails() { 
        System.out.println("Student Name: " + name); 
        Period age = Period.between(dob, LocalDate.now()); 
        System.out.println("Student Age: " + age.getYears()); 
    }

    public static void main(String[] args) {
        Student s = new Student("Alice", "15-03-2000");
        s.displayDetails();
    }
}



