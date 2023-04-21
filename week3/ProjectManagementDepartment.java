public class ProjectManagementDepartment {
    protected String clint;
    protected String projectTitle;
    protected int finishTime;

    public ProjectManagementDepartment(String clintEnter,String projectTitleEnter, int finishTimeEnter) {
        this.clint = clintEnter;
        this.projectTitle = projectTitleEnter;
        this.finishTime = finishTimeEnter;

    }
    public String getClint() {
        return clint;
    }
    public String getProjectTitle() {
        return projectTitle;
    }
    public int getFinishTime() {
        return finishTime;
    }
}


