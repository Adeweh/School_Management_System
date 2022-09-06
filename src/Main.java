import java.util.List;
import java.util.Objects;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    private static School school = new School();
    private static int studentId;
    private static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args) {
        mainMenu();

    }
    private static void mainMenu(){
        System.out.println("WELCOME TO SCHOOL");

        System.out.println("""
                
                
                1.ADMIN LOGIN
                2.STUDENT LOGIN
                0.EXIT
              
                """);

        int choice = userInput.nextInt();

        switch (choice){
            case 1 -> adminMenu();
            case 2 -> {
                System.out.println("Enter your Student ID: ");
                studentId = userInput.nextInt();
                if (school.getStudent(studentId) == null) {
                    System.out.println("Invalid ID. Try again.");
                    mainMenu();
                } else studentMenu(studentId);
            }
            case 0 -> exit();
        }

    }

    private static void studentMenu(int studentId) {
        System.out.println("""
                
                1 Offer Course
                2 Drop Course
                3 Drop out of School
                0 Exit 
                """);
        int input = userInput.nextInt();
        switch (input){
            case 1-> offerCourse(studentId);
            case 2-> dropCourse(studentId);
            case 3-> withdraw(studentId);
            case 0 -> exit();

        }
    }

    private static void withdraw(int studentId) {
        Student student = school.getStudent(studentId);
        student.withdraw();

        studentMenu(studentId);

    }

    private static void dropCourse(int studentId) {
        System.out.println("Enter course name: ");
        String courseName = userInput.next();

        Student student = school.getStudent(studentId);
        student.deleteCourse(school.getCourse(courseName));

        studentMenu(studentId);


    }

    private static void offerCourse(int studentId) {

//        System.out.println(school.getAllCourses());
        Student student = school.getStudent(studentId);
        List<Course> courseList = school.getAllCourses();
        for (Course course:courseList) {
            if(Objects.equals(course.getCourseType(), student.getStudentType())) {
                System.out.println(course);
            }
        }

        System.out.println("Enter course name: ");
        String courseName = userInput.next();

        student.addCourse(school.getCourse(courseName));


        studentMenu(studentId);


    }

    private static void adminMenu(){
        System.out.println("""
                1 Register Student
                2 View Students
                3 Add Course
                4 Remove Course
                5 View All Courses
                6 Expel Student
                0 Exit 
                """);
        int input = userInput.nextInt();

        switch (input){
            case 1-> addStudent();
            case 2 -> viewAllStudents();
            case 3-> addCourse();
            case 4 -> removeCourse();
            case 5 -> viewAllCourses();
            case 6-> expelStudent();
            case 0 -> exit();

        }

    }

    private static void exit() {
        System.exit(0);
    }


    private static void expelStudent() {
        System.out.println("Enter student id: ");
        int id = userInput.nextInt();

        adminMenu();

    }

    private static void viewAllCourses(){

        System.out.println(school.getAllCourses());
    }

    private static void removeCourse() {
        System.out.println("Enter course name: ");
        String courseName = userInput.next();
        Course course = school.getCourse(courseName);
        school.deleteCourses(course);

        adminMenu();
    }

    private static void addCourse() {
        System.out.println("Enter course Name: ");
        String courseName = userInput.next();

        System.out.println("Enter course Type: ");
        String courseType = userInput.next();

        Course course = new Course(courseName,courseType);
        school.addCourses(course);

        adminMenu();
    }
    private static void viewAllStudents() {
        System.out.println(school.getAllStudents());
        adminMenu();
    }

    private static void addStudent() {
        System.out.println("Enter first name: ");
        String firstName = userInput.next();

        System.out.println("Enter last name: ");
        String lastName = userInput.next();

        System.out.println("Enter student type: ");
        String type = userInput.next();


        Student student = new Student(firstName,lastName,type);
        school.register(student);

        adminMenu();


    }

}
