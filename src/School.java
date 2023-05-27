import java.util.List;

public class School {
    private final List<Teacher> teachers;
    private final List<Student> students;

    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    public List<Teacher> getTeacher() {
        return teachers;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public List<Student> getStudent() {
        return students;
    }

    public void addStudent(Student student) {
       students.add(student);
    }

    public int getMoneyEarned() {
        return totalMoneyEarned;
    }

    public static void updateMoneyEarned(int moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }

    public int getMoneySpent() {
        return totalMoneySpent;
    }

    public void updateMoneySpent(int moneySpent) {
        totalMoneyEarned -= moneySpent;
    }
}
