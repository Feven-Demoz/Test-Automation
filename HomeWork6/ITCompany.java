import java.time.LocalDate;

public class ITCompany implements SoftwareDevelopmentDepartment, EducationDepartment, EngineeringDepartment, FinanceDepartment, TestingDepartment {
private int numberOfEmployees;
   private String project;

   public void setEmployeeNumber(int numberOfEmployeesEnter) {
       this.numberOfEmployees = numberOfEmployeesEnter;
   }

       public void hireEmployee() throws Exception{
           numberOfEmployees = numberOfEmployees+1;
   }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    @Override
    public String getProject() {
     return this.project;
    }

    @Override
    public void setProject(String projectEnter) {
       this.project= projectEnter;

    }
    private String programingLanguage;

   @Override
    public String getProgramingLanguage() {
        return this.programingLanguage;
    }

    @Override
    public void setProgramingLanguage(String programingLanguageEnter) {
        this.programingLanguage= programingLanguageEnter;

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

    private String electricalGroup;

    @Override
    public String getElectricalGroup() {
        return this.electricalGroup;
    }

    @Override
    public void setElectricalGroup(String electricalGroupEnter ) {
        this.electricalGroup = electricalGroupEnter;

    }

    private String mechanicalGroup ;
    @Override
    public void setMechanicalGroup(String mechanicalGroupEnter) {
        this.mechanicalGroup = mechanicalGroupEnter;
    }
    @Override
    public String getMechanicalGroup() {
        return this.mechanicalGroup;
    }

    private float investment;

    @Override
    public float getInvestment() {
        return this.investment;
    }

    @Override
    public void SetInvestment(float investmentEnter) {
        this.investment= investmentEnter;

    }
    private float budgetsForecasting;

    @Override
    public void setBudgetsForecasting(float budgetsForecastingEnter) {
        this.budgetsForecasting= budgetsForecastingEnter;

    }

    @Override
    public float getBudgetsForecasting() {
        return this.budgetsForecasting;

    }
    private String testingType;

    @Override
    public String getTestingType() {
        return this.testingType;
    }

    @Override
    public void setTestingType(String testingTypeEnter) {
        this.testingType=testingTypeEnter;


    }

    private int numberOfBugs;

    @Override
    public void setNumberOfBugs(int numberOfBugsEnter) {
        this.numberOfBugs =numberOfBugsEnter;

    }

    @Override
    public int getNumberOfBugs() {
        return this.numberOfBugs;
    }

    static int EmployeeID;  // Static Variable


    static {   // Static Block
        EmployeeID = 81901;
    }
    public static float SalaryMonth(float FirstPaycheck, float SecondPaycheck) {   // Static Method
        return FirstPaycheck + SecondPaycheck;
    }


}



