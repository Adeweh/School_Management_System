import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    School school;
    Student student;
    Course course;
    Course course1;

    @BeforeEach
    void setUp() {
        school = new School();
        student= new Student("Debby","Joseph","Science");
        course = new Course("English","Science");
        course1 = new Course("Math", "Art");
    }

    @Test
    void testThatWeHaveStudent(){
        assertNotNull(student);
    }
    @Test
    void  testThatStudentCanAddCourse(){
        student.addCourse(course);
        assertEquals(1, student.numberOfCourse());
    }
    @Test
    void testThatStudentCanDeleteCourse(){
        student.addCourse(course);
        student.addCourse(course1);
        student.deleteCourse(course1);

        assertEquals(1, student.numberOfCourse());
    }
    @Test
    void testThatStudentCanWithdrawFromSchool(){
        school.register(student);
        student.setWithdrawalRequest(true);
        school.withdrawalApproval(student);

        assertEquals(0, school.numberOfStudents());
    }
    @Test
    void testThatStudentCanGetACourse(){
        student.addCourse(course);
        student.addCourse(course1);

        assertEquals("Science", student.getCourse("English").getCourseType());
    }
    @Test
    void testThatStudentCanGetALlCourses(){
        student.addCourse(course);
        student.addCourse(course1);

        assertEquals("Math", student.getAllCourses().get(1).getCourseName());

    }






}