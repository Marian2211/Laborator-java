package classes;

import java.util.HashMap;
import java.util.Map;

public class Classes {
    public static void main(String[] args) {
        Student[] students = new Student[]{new Student("Alex", "Jipa", 4623), new Student("Dani", "Munteanu", 4622)};
        Professor prof = new Professor("Angel", "Parjoala");
        Course course = new Course("Modele SPICE", "Desenam circuite ", prof, students);
        CourseManager courseManager = new CourseManager();
        courseManager.addCourse(course);
        //courseManager.displayCourseToConsole();
    }
}