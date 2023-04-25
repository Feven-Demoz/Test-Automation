import java.time.LocalDate;

public class ITCompany implements HumanResources,SoftwareDevelopmentDepartment, EducationDepartment, EngineeringDepartment, FinanceDepartment {

    private String hiringManager;

    @Override
    public String getHiringManager() {
        return this.hiringManager;
    }

    @Override
    public void setHiringManager(String hiringManagerEnter) {
        this.hiringManager=hiringManagerEnter;

    }

    private String payrollAssistant;

    @Override
    public String getPayrollAssistant() {
        return this.payrollAssistant;
    }

    @Override
    public void setPayrollAssistant(String payrollAssistantEnter) {
        this.payrollAssistant= payrollAssistantEnter;
    }
   private String softwareDeveloperManager;

    @Override
    public String getSoftwareDeveloperManager() {
     return this.softwareDeveloperManager;
    }

    @Override
    public void setSoftwareDeveloperManager(String softwareDeveloperManagerEnter) {
       this.softwareDeveloperManager = softwareDeveloperManagerEnter;

    }
    private String programing;

   @Override
    public String getPrograming() {
        return this.programing;
    }

    @Override
    public void setPrograming(String programingEnter) {
        this.programing= programingEnter;

    }


    private String courseName;
    @Override
    public void setCoursesName(String courseGivenEnter) {
        this.courseName = courseGivenEnter;
}

    @Override
    public String getCourse() {
        return this.courseName;
    }
    private int courseId;

    @Override
    public void setCourseId(int courseIdEnter) {
        this.courseId= courseIdEnter;

    }

    @Override
    public int getCourseID() {
        return this.courseId;
    }

    private String enginingTeams;

    @Override
    public String getEngineeringTeams() {
        return this.enginingTeams;
    }

    @Override
    public void setEngineeringTeams(String engineeringTeamsEnter ) {
        this.enginingTeams = engineeringTeamsEnter;

    }

    private int yearsOfExperience;
    @Override
    public void setYearsOfExperience(int yearsOfExperienceEnter) {
        this.yearsOfExperience = yearsOfExperienceEnter;
    }
    @Override
    public int getYearsOfExperience() {
        return this.yearsOfExperience;
    }

    private String accountManager;

    @Override
    public String getAccountManager() {
        return this.accountManager;
    }

    @Override
    public void setAccountManager(String accountManagerEnter) {
        this.accountManager= accountManagerEnter;

    }
    private String taxAccountant;

    @Override
    public void setTaxAccountant(String taxAccountantEnter) {
        this.taxAccountant= taxAccountantEnter;

    }

    @Override
    public String getTaxAccountant() {
        return this.taxAccountant;

    }

    static int EmployeeID;  // Static Variable


    static {   // Static Block
        EmployeeID = 81901;
    }
    public static float SalaryMonth(float FirstPaycheck, float SecondPaycheck) {   // Static Method
        return FirstPaycheck + SecondPaycheck;
    }


}



