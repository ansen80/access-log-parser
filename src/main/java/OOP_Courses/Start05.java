package OOP_Courses;

public class Start05 {

    public static void main(String[] args) {
        int[] gradesArray = {3, 4, 5};
        Student05 student = new Student05("Владимир", gradesArray);
        student.addGrade(5);
        System.out.println(student);
    }
}