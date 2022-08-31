import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SchoolTest {
    School school;
    Student newStudent;

    Student newStudent1;

    Course newCourse;
    Course newCourse1;

    @BeforeEach
    void setUp() {
        school = new School();
        newStudent = new Student("Debby","Joseph","Science");
        newStudent1 = new Student("Jonas","Adeh","Art");
        newCourse = new Course("English","Science");
        newCourse1 = new Course("Maths","Art");
    }
    @Test
    void testThatStudentCanBeRegistered(){
        school.register(newStudent);
        assertEquals(1, school.numberOfStudents());
    }
    @Test
    void testThatSchoolCanAddCourses(){
        school.addCourses(newCourse);
        assertEquals(1, school.numberOfCourses());
    }

    @Test
    void  testThatSchoolCanRemoveCourses(){
        school.addCourses(newCourse);
        school.addCourses(newCourse1);
        school.deleteCourses(newCourse);

        assertEquals(1, school.numberOfCourses());
    }

    @Test
    void testThatStudentCanBeExpelled(){
        school.register(newStudent);
        school.expel(newStudent);
        assertEquals(0, school.numberOfStudents());
    }
    @Test
    void testThatSchoolCanGetACourse(){
        school.addCourses(newCourse);
        school.addCourses(newCourse1);
        assertEquals("Science", school.getCourse("English").getCourseType());
    }
    @Test
    void testThatSchoolCanGetAStudent(){
        school.register(newStudent);
        school.register(newStudent1);

        assertEquals("Adeh", school.getStudent("Jonas").getLastName());
    }

    @Test
    void testThatSchoolCanGetALlCourses(){
        school.addCourses(newCourse);
        school.addCourses(newCourse1);

        assertEquals("Maths", school.getAllCourses().get(1).getCourseName());

    }


}