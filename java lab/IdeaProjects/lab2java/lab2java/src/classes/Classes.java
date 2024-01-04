package classes;

public class Classes{
    public static void main(String[] args){
        Student[] students = new Student[]{new Student("Andrei", "Negoita", 2231, 6), new Student("Ion", "Mateescu", 4221,6)};
        Student depresiv = new Student("Marian", "Manole", 2222, 5);
        Professor prof = new Professor("Anton", "Panaitescu");

        Course course = new Course("Material Resistance", "Calculations of Reactions, \n" + "effort diagrams, calculations of geometric characteristics of\n" + "flat surfaces and calculations of resistance elements to simple stresses", prof, students);
        course.addStudent(depresiv);

        CourseManager courseManager = new CourseManager();
        courseManager.calculateAverageGradeByProfessor(prof);
        courseManager.addCourse(course);
        courseManager.listStudentsInCourse("Material Resistance");
        courseManager.calculateAverageGradeForCourse("Material Resistance");
        courseManager.displayCoursesToConsole();
        courseManager.calculateAverageGradeByProfessor(prof);

    }
}