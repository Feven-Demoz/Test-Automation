public class Main {

    public static void main(String[] args) {

        ItSupportDepartment supportObject = new ItSupportDepartment("John", "Ben", "Lisa");
        supportObject.DisplayDepartment();
        System.out.println();
        System.out.print("This is " + supportObject.getSupportSpecialist() + " from front desk support specialist ");
        System.out.println(); // this is to start a new line
        System.out.print( supportObject.getItSupportManger() + " is the IT support manger" );
        System.out.println(); // this is to start a new line
        supportObject.setTicketNumber(782);
        supportObject.setDevice( "laptop");
        supportObject.setTypeIssue("broken");
        String numberOfTicketNumber = String.valueOf(supportObject.getTicketNumber());
        System.out.print(supportObject.getItConsultant() + " is the IT consultant that diagnosed the " + supportObject.device + " with ticket number " + numberOfTicketNumber + " is " + supportObject.typeIssue);
        System.out.println();

        ITCompany ITObject = new ITCompany();

        ITObject.setHiringManager("Bill Joel");
        ITObject.setPayrollAssistant("Betty White");
        System.out.print("The hiring manger for the company is " + ITObject.getHiringManager() + " and the payroll assistant is " + ITObject.getPayrollAssistant());
        System.out.println();

        ITObject.setSoftwareDeveloperManager("Alex Stone");
        ITObject.setPrograming("test automation");
        System.out.print(ITObject.getSoftwareDeveloperManager() + " is the software manager for " + ITObject.getPrograming() + " programing");
        System.out.println();

        ITObject.setCoursesName("SQL");
        ITObject.setCourseId(102);
        String numberCourseId = String.valueOf(ITObject.getCourseID());
        System.out.print("The company provides " + ITObject.getCourse() +  " course " + numberCourseId + " course ID for all the new employees " );
        System.out.println(); // this is to start a new line

        ITObject.setEngineeringTeams("Tom");
        ITObject.setYearsOfExperience(10);
        System.out.print(ITObject.getEngineeringTeams() + " has " + ITObject.getYearsOfExperience() + " years of experience");
        System.out.println();

        ITObject.setAccountManager("Ben");
        ITObject.setTaxAccountant("Sara");
        System.out.print("The account manager is " + ITObject.getAccountManager() + " and the tax accountant is " + ITObject.getTaxAccountant());
        System.out.println();


        MarketingDepartment marketingObject = new MarketingDepartment("Andrew");
        marketingObject.DisplayDepartment();
        marketingObject.setMarketingPlatform("TV advert");
        marketingObject.setMarketingBudget(10000);
        marketingObject.setBusinessManager("Jerry");
        marketingObject.setDistributionManager("Bill");
        marketingObject.setSaleSupervisor("Leo"); // Setting SalesDepartment info from Marketing department Polymorphism
        System.out.println();
        System.out.print("The sales supervisor " + marketingObject.getSaleSupervisor() + " has set a budget " + marketingObject.getMarketingBudget()+ " for "+ marketingObject.getMarketingPlatform()); // Getting SalesDepartment info from Marketing department Polymorphism
        System.out.println();
        System.out.print("The distribution manager " + marketingObject.getDistributionManager() + " and the business manager " + marketingObject.getBusinessManager() + " are working together on the new project" );
        //System.out.println();
        // Create and override a one abstract method

        //System.out.println(ITCompany.EmployeeID);  // To access static variable you put class name . name of variable no need to create object
        System.out.println( "The new marketing analyst " + marketingObject.getMarketingAnalyst() + " with employee ID " + ITCompany.EmployeeID + " has monthly income of "+ ITCompany.SalaryMonth(1500,1500));

        ProjectManagementDepartment projectObject = new ProjectManagementDepartment("Jerry ", "PhoneApp", 10);
        String numberOfFinishTime = String.valueOf(projectObject.getFinishTime());
        System.out.print("Clint " + projectObject.getClint() + "expecting his new " + projectObject.getProjectTitle() + " develop in " + numberOfFinishTime + " months ");
        System.out.println();


    }

}


