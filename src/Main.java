import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher jane = new Teacher(1, "Jane", 50000);
        Teacher john = new Teacher(1, "John", 70000);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(jane);
        teacherList.add(john);

        Student joe = new Student(1, "Joe", 2);
        Student kate = new Student(2, "Kate", 6);

        List<Student> studentList = new ArrayList<>();
        studentList.add(joe);
        studentList.add(kate);

        School panaf = new School(teacherList, studentList);


        joe.payFees(700);
        System.out.println(panaf.getMoneyEarned());
        kate.payFees(6000);
        System.out.println(panaf.getMoneyEarned());



    }
}
