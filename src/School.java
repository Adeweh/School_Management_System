import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class School {
    List<Student> schoolStudents = new ArrayList<>();
    List<Course> schoolCourses = new ArrayList<>();


    public void register(Student newStudent) {
        schoolStudents.add(newStudent);
        newStudent.setStudentId(String.format("%03d", schoolStudents.size()+1));
    }

    public int numberOfStudents() {
        return schoolStudents.size();
    }

    public void addCourses(Course newCourse) {
        schoolCourses.add(newCourse);
    }

    public int numberOfCourses() {
        return schoolCourses.size();
    }

    public void deleteCourses(Course newCourse) {
        schoolCourses.remove(newCourse);
    }

    public void expel(Student newStudent) {
        schoolStudents.remove(newStudent);
    }
    public void withdrawalApproval(Student student){
        if (student.withdraw()) expel(student);

    }

    public Course getCourse(String courseName) {
        for (int i = 0; i < schoolCourses.size(); i++) {
            if(Objects.equals(courseName, schoolCourses.get(i).getCourseName())) {
                return schoolCourses.get(i);
            }

        }
        return null;
    }

    public Student getStudent(String studentName) {
        for (int i = 0; i < schoolStudents.size(); i++) {
            if (Objects.equals(studentName, schoolStudents.get(i).getFirstName())) {
                return schoolStudents.get(i);
            }

        }
        return null;
    }

    public List<Course> getAllCourses() {
        return schoolCourses;
    }
}

