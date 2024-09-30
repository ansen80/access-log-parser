package OOP_Courses;

import java.util.ArrayList;
import java.util.List;

public class Student05 {

    private final String name;
    private final List<Integer> grades;

    public Student05(String name, int[] initialGrades) {
        this.name = name;
        this.grades = new ArrayList<>();
        if (initialGrades != null) {
            for (int grade : initialGrades) {
                addGrade(grade);
            }
        }
    }
    public void addGrade(int grade) {
        if (grade < 2 || grade > 5) {
            throw new IllegalArgumentException("Оценка должна быть в диапазоне от 2 до 5");
        }
        grades.add(grade);
    }
    public List<Integer> getGrades() {
        return new ArrayList<>(grades);
    }
    public String toString() {
        return name + " " + grades.toString();
    }
}
