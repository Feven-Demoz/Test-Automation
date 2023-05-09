import java.util.*;


public class Main {
    public static void main(String[] args) {
        BackendDeveloper[] backendDevelopersList = {new BackendDeveloper("John", 30, "Backend Engineer ", "senior", "Java"),
                new BackendDeveloper("Ben", 20, " Backend Engineer ", "senior", "Java")
        };
        FrontendDeveloper[] frontendDeveloperList = {new FrontendDeveloper("Sam", 98, " Frontend Engineer", "MLA development"),
                new FrontendDeveloper("Alex", 56, " Frontend Engineer ", "LLC development")};

        QualityAssuranceEngineer[] qualityAssuranceEngineerList = {new QualityAssuranceEngineer("Alen", 71, " Quality Assurance", 11),
                new QualityAssuranceEngineer("Tom", 88, "Quality Assurance  ", 11)
        };
        FinanceDepartment[] financeDepartmentsList = {new FinanceDepartment("Johnson", 789, "Backend Developer", 500000),
                new FinanceDepartment("Jane", 390, "Quality Assurance Department", 750000)
        };


        ItCompany itObject = new ItCompany(backendDevelopersList, frontendDeveloperList, qualityAssuranceEngineerList, financeDepartmentsList);
        itObject.printBackendDevelopers();
        itObject.printFrontendDevelopers();
        itObject.printQualityAssuranceEngineer();
        itObject.printFinanceDepartment();



        try {
            Manager managerObject = new Manager("Bob", 879, " Director", " Finance Department", 7);

            managerObject.manage();
        } catch (InvalidYearsOfExperience e) {
            System.out.print("Error" + e.getMessage());
        }
        System.out.println();
        try {
            HumanResource hrObject = new HumanResource("Alis", 398, "Finance Department", 27982, 5000);
            hrObject.printInfo();
        } catch (InvalidSalary e) {
            System.out.print("Error" + e.getMessage());
        }

        System.out.println();
        Clients<String> listClientsNames = new Clients<>();
        listClientsNames.add("Ben");
        listClientsNames.add("Abel");
        listClientsNames.add("Adam");
        listClientsNames.printList();

        Clients<Integer> listClientsID = new Clients<>();
        listClientsID.add(1442);
        listClientsID.add(3131);
        listClientsID.add(9530);
        listClientsID.printList();

    }
}




