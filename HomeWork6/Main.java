import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        ItSupportDepartment supportObject = new ItSupportDepartment();
        supportObject.printGreeting();
        System.out.println(); // this is to start a new line
        supportObject.setTicketNumber(782);
        supportObject.setDevice("laptop");
        supportObject.setTypeIssue("broken");
        String numberOfTicketNumber = String.valueOf(supportObject.getTicketNumber());
        System.out.print( "The "+ supportObject.device + " with ticket number " + numberOfTicketNumber + " is " + supportObject.typeIssue);
        System.out.println();

        ITCompany ITObject = new ITCompany();
        //System.out.println();
        ITObject.setProject("xBox Game");
        ITObject.setProgramingLanguage("Java");
        System.out.print( ITObject.getProgramingLanguage() + " is the programing language used to create " + ITObject.getProject() +" for the new client");
        System.out.println();

        ITObject.setCoursesName("SQL");
        ITObject.setCourseId(102);

        Queue<String> courseName = new LinkedList<String>();
         courseName.add("SQL");
         courseName.add("Python");
         courseName.add ("Java");
         System.out.println(" The company provides "+ courseName + "courses to the new employees ");


        String numberCourseId = String.valueOf(ITObject.getCourseID());
        System.out.print("The company provides " + ITObject.getCourse() + " course " + numberCourseId + " course ID for all the new employees ");
        System.out.println(); // this is to start a new line

        ITObject.setElectricalGroup("design model");
        ITObject.setMechanicalGroup("build parts");
        System.out.print("The Electrical and Mechanical engineers work together on " + ITObject.getElectricalGroup() + " and " + ITObject.getMechanicalGroup());
        System.out.println();

        ITObject.SetInvestment (1000000);
        ITObject.setBudgetsForecasting(50000);
        System.out.print("The budget forecast for the coming year is " + ITObject.getBudgetsForecasting() + " and the investment budget is  " + ITObject.getInvestment());
        System.out.println();


        MarketingDepartment marketingObject = new MarketingDepartment();
        //marketingObject.DisplayDepartment();
        marketingObject.setMarketingPlatform("TV advert");
        marketingObject.setSalesTarget("adult");
        marketingObject.setSaleForecasting(5000);
        marketingObject.setMarketingBudget(10000);

                     // Setting SalesDepartment info from Marketing department Polymorphism
        System.out.println();
        System.out.print("The sales department and the marketing department has set a budget of " + marketingObject.getSaleForecasting() + " and " + marketingObject.getMarketingBudget() + " for " + marketingObject.getMarketingPlatform()); // Getting SalesDepartment info from Marketing department Polymorphism
        System.out.println();
        //System.out.println();
        // Create and override a one abstract method

        //System.out.println(ITCompany.EmployeeID);  // To access static variable you put class name . name of variable no need to create object
        System.out.println("The new marketing analyst with employee ID " + ITCompany.EmployeeID + " has monthly income of " + ITCompany.SalaryMonth(1500, 1500));
        System.out.println();
        ProjectManagementDepartment projectObject = new ProjectManagementDepartment("Jerry ", "PhoneApp", 10);
        String numberOfFinishTime = String.valueOf(projectObject.getFinishTime());
        System.out.print("Clint " + projectObject.getClint() + "expecting his new " + projectObject.getProjectTitle() + " develop in " + numberOfFinishTime + " months ");
        System.out.println();

        //HumanResourceDepartment hrObject= new HumanResourceDepartment();
        Employee[] employeeList = Employee.creatEmployee();
        HumanResourceDepartment[] hrList = HumanResourceDepartment.createHr();
        System.out.println();
        for (Employee employee : employeeList) {
            System.out.print("Employees ");
            System.out.print( employee.getName() + " employee ID " + employee.getEmployeeId() + " works as " + employee.getPosition() + " ");
            System.out.println();

        }
        System.out.println();
        for (HumanResourceDepartment humanResource : hrList) {
            System.out.print("Employee ");
            System.out.print("with social security number " + humanResource.getSocialSecurityNumber() + " earns " + humanResource.getSalary() + " per month " );
            System.out.println();
        }

        System.out.println();

        HumanResourceDepartment hrObject = new HumanResourceDepartment("Sam", "developer", 789, 90575, 6000);
        hrObject.readContractFile("Contract.txt");


        System.out.println();

        ITObject.setEmployeeNumber(100);
        try {
            ITObject.hireEmployee();
        } catch ( Exception e) {
            System.out.print("Error------------------" );
        }

        int numberOfEmployee = ITObject.getNumberOfEmployees();

        //System.out.print(ITObject.getNumberOfEmployees());
        try {
            //ITObject.setEmployeeNumber(8);

            if (numberOfEmployee > 0) {  // If number of employee number is bigger than zero
                System.out.print("In total we have " + numberOfEmployee + " number of employee");
            }
        }
        catch(Exception ex) {
            //if (numberOfEmployee <= 0) { // If number of employee number is smaller than zero or equal too
            System.out.print("Error not a valid number " + ex.getMessage());
            // }
        }
        System.out.println();
        Queue departmentList = new LinkedList();
        departmentList.add(" Engineering Department ");
        departmentList.add("Finance Department ");
        departmentList.add(" Human Resource Department");
        departmentList.add("It Support Department");
        departmentList.add("Marketing Department");
        departmentList.add(" Education Department");
        System.out.println("The department list in the It company" + departmentList);


        Manager managerObject = new Manager();
        //managerObject.addManager(null);
        //managerObject.printManagers();
        managerObject.addManager("Sam");
        managerObject.addManager("Robert");
        managerObject.addManager("Tom");
        managerObject.printManagers();
        managerObject.removeManager(1);
        managerObject.printManagers();


        Clients<String>listClientsNames = new Clients<>();
        listClientsNames.add("Ben");
        listClientsNames.add("Abel");
        listClientsNames.add("Adam");
        listClientsNames.printList();

        Clients<Integer>listClientsID = new Clients<>();
        listClientsID.add(1442);
        listClientsID.add(3131);
        listClientsID.add(9530);
        listClientsID.printList();


    }
}


