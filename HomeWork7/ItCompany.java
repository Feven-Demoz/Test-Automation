import java.util.ArrayList;
import java.util.Arrays;



public class ItCompany {


    private ArrayList<BackendDeveloper> backendDevelopersList;   // Array of BackendDeveloper employee
    private ArrayList<FrontendDeveloper> frontendDeveloperList;
    private ArrayList<QualityAssuranceEngineer> qualityAssuranceEngineerList;

    private ArrayList<FinanceDepartment> financeDepartmentList;



    public ItCompany(BackendDeveloper[] backendDevelopersListEnter, FrontendDeveloper[] frontendDevelopersEnter, QualityAssuranceEngineer[] qualityAssuranceEngineersEnter, FinanceDepartment[] financeDepartmentEnter){
        backendDevelopersList = new ArrayList<>(Arrays.asList(backendDevelopersListEnter));
        frontendDeveloperList = new ArrayList<>(Arrays.asList(frontendDevelopersEnter));
        qualityAssuranceEngineerList = new ArrayList<>(Arrays.asList(qualityAssuranceEngineersEnter));
        financeDepartmentList = new ArrayList<>(Arrays.asList(financeDepartmentEnter));


    }

    public void printBackendDevelopers() {
        for (BackendDeveloper backendEngineer : backendDevelopersList) {
            System.out.println(backendEngineer.getName() + " has an employee id of  " + backendEngineer.getEmployeeId() + " works in  " + backendEngineer.getDepartment() + " and has experience level of " + backendEngineer.getExperienceLevel() + " in " + backendEngineer.getProgrammingLanguage());
        }
    }

    public void printFrontendDevelopers() {
        for (FrontendDeveloper frontendEngineer : frontendDeveloperList) {
            System.out.println(frontendEngineer.getName() + " has an employee id of  " + frontendEngineer.getEmployeeId() + " works in " + frontendEngineer.getDepartment() + " department and is working on " + frontendEngineer.getNameCoverPage());  //" + frontendEngineer.getEndMonth() + " is working on web development of  " + frontendEngineer.getNameCoverPage());
        }
    }

    public void printQualityAssuranceEngineer() {
        for (QualityAssuranceEngineer qualityAssuranceEngineer : qualityAssuranceEngineerList) {
            System.out.println(qualityAssuranceEngineer.getName() + " has an employee id of  " + qualityAssuranceEngineer.getEmployeeId() + " works in " + qualityAssuranceEngineer.getDepartment() + " department and its project is launched on " + qualityAssuranceEngineer.getProjectLaunchDate());
        }
    }

    public void printFinanceDepartment() {
        for (FinanceDepartment financeDepartment : financeDepartmentList) {
            System.out.println(financeDepartment.getDepartment() + " generate total income of " + financeDepartment.getRevenue() + " for the company.");
        }
    }

}
