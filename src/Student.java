import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Student {
    private String firstName;
    private String lastName;
    private String studentType;
    private int studentId;

    private boolean requestWithdrawal;


    List<Course> courses = new ArrayList<>();


    public Student(String firstName, String lastName, String studentType){
        this.firstName = firstName;
        this.lastName=lastName;
        this.studentType=studentType;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStudentType() {
        return studentType;
    }

    public int getId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void addCourse(Course course) {
        courses.add(course);

    }

    public int numberOfCourse() {
        return courses.size();
    }

    public void deleteCourse(Course course) {
        courses.remove(course);
        
    }

    @Override
    public String toString() {
        return String.format("FirstName: %s%nLastName: %s%nStudent Type: %s%nStudent Id: %03d",
                getFirstName(), getLastName(), getStudentType(), getId());

    }

    public boolean withdraw() {
        return requestWithdrawal;

    }

    public void setWithdrawalRequest(boolean requestStatus){
        requestWithdrawal = requestStatus;

    }

    public Course getCourse(String courseName) {
        for (int i = 0; i < courses.size() ; i++) {
            if (Objects.equals(courseName, courses.get(i).getCourseName())){
                return courses.get(i);
            }

        }
        return null;
    }

    public List<Course> getAllCourses() {
        return courses;
    }
}
