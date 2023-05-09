public class QualityAssuranceEngineer extends Employees implements ITest {
    private int projectLaunchDate;

    public QualityAssuranceEngineer(String nameEnter, int employeeIdEnter, String departmentEnter , int projectLaunchDateEnter) { //String projectNameEnter, int startMonthEnter, int endMonthEnter
       super(nameEnter, employeeIdEnter, departmentEnter);//projectNameEnter, startMonthEnter, endMonthEnter);
        this.projectLaunchDate=projectLaunchDateEnter;
    }
    public int getProjectLaunchDate() {
        return projectLaunchDate;
    }

    public void setProjectLaunchDate(int projectLaunchDate) {
        this.projectLaunchDate = projectLaunchDate;
    }

    @Override
    public void test() {
       System.out.print("The test passed all the requirement on " + getProjectLaunchDate());
    }



    @Override
    public void performQualityCheck() {
       int projectLaunchDate =  getProjectLaunchDate();
        System.out.print("The project has to be launched by  " + projectLaunchDate + " to the client " );
    }

    //@Override
    //public void profileCheck() {

    //}

    @Override
    public void performDesignCheck() {
    }
}

