public class EducationDepartment {
    private String courseGiven;
    private int courseId;
    private int numberOfTrainee;

    public EducationDepartment (String courseGivenEnter, int courseIdEnter, int numberOfTraineeEnter) {
        this.courseGiven = courseGivenEnter;
        this.courseId = courseIdEnter;
        this.numberOfTrainee = numberOfTraineeEnter;
    }

    public String getCoursesGiven() {
        return courseGiven;
    }

    public void setCoursesGiven(String courseGiven) {
        this.courseGiven = courseGiven;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getNumberOfTrainee() {
        return numberOfTrainee;
    }

    public void setNumberOfTrainee(int numberOfTrainee) {
        this.numberOfTrainee = numberOfTrainee;
    }

    }
