//package Program2;

public class StudentCourses {
    public void showCoursesAndMarks() { 
        String[] courses = {"DBMS", "OOPs", "DevOps"}; 
        int[] marks = {45, 39, 50}; 
        for (int i = 0; i < courses.length; i++) { 
            System.out.println("Course: " + courses[i] + ", Marks: " + marks[i]); 
        } 
    } 

    public static void main(String[] args) {
        StudentCourses sc = new StudentCourses(); 
    sc.showCoursesAndMarks();
    }

}
