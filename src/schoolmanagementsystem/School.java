package schoolmanagementsystem;

import java.util.List;

public class School {

    private List <Teacher> teachers;
    private List <Student> students;
    private int totalMoneyEarned = 0;
    private int totalMoneySpent = 0;

    public School(List<Teacher> teachers, List<Student> students, int totalMoneyEarned, int totalMoneySpent) {
        this.teachers = teachers;
        this.students = students;
        this.totalMoneyEarned = totalMoneyEarned;
        this.totalMoneySpent = totalMoneySpent;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public List<Student> getStudents() {
        return students;
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }
}
