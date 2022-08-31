import java.util.Scanner;

public class Main {
    private static School school = new School();
    private static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args) {
        mainMenu();

    }
    private static void mainMenu(){
        System.out.println("WELCOME TO SCHOOL");

        System.out.println("""
                
                
                1.ADMIN LOGIN
                2.STUDENT LOGIN
                3.EXIT
              
                """);

        int choice = userInput.nextInt();

        switch (choice){
            case 1 -> adminMenu();
            case 2 -> studentMenu();
        }

    }

    private static void studentMenu() {
        System.out.println("""
                
                1 Offer Course
                3 Drop Course
                4 Drop out of School
                5 Exit 
                """);
        int input = userInput.nextInt();
        switch (input){
            case 1-> offerCourse();
            case 2-> dropCourse();
            case 3-> withdraw();

        }
    }

    private static void withdraw() {
    }

    private static void dropCourse() {
    }

    private static void offerCourse() {
    }

    private static void adminMenu(){
        System.out.println("""
                1 Register Student
                2 Add Course
                3 Remove Course
                4 Expel Student
                5 Exit 
                """);
        int input = userInput.nextInt();

        switch (input){
            case 1-> addStudent();
            case 2-> addCourse();
            case 3 -> removeCourse();
            case 4-> expelCourse();

        }

    }

    private static void expelCourse() {
    }

    private static void removeCourse() {
    }

    private static void addCourse() {
    }

    private static void addStudent() {
        String firstName = "Tunde";
        String lastName = "Ade";
        String studentType = "Science";
        Student newStudent = new Student(firstName, lastName, studentType);
        school.register(newStudent);
    }

}
