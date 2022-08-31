public class Course {
    private String courseName;
    private String courseId;
    private String courseType;

    private String courseStatus;


    public Course(String courseName, String courseType){
        this.courseName = courseName;
        this.courseType = courseType;

    }

    public String getCourseStatus() {
        return courseStatus;
    }

    public void setCourseStatus(String courseStatus) {
        this.courseStatus = courseStatus;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseType() {
        return courseType;
    }

    @Override
    public String toString() {
        return String.format("CourseId: %s%nCourseType: %s%nCourseName: %s%nCourseStatus %s",
                getCourseId(), getCourseType(), getCourseName(), getCourseStatus());
    }

}
