public class Main {
    

    public static void main(String[] args) {

        ItSupportDepartment supportobject = new ItSupportDepartment("John", "Ben", "Lisa");
        //equals(supportobject);

        supportobject.printgreating();
        System.out.print("This is " + supportobject.getSupportSpecialist() + " from front desk support specialist ");
        System.out.println(); // this is to start a new line
        System.out.print("This is " + supportobject.getItSupportManger() + " from front desk IT support manger ");
        System.out.println(); // this is to start a new line
        System.out.print("This is " + supportobject.getItConsultant() + " from front desk IT consultant");
        System.out.println(); // this is to start a new line


        SoftwareDevelopmentDepartment softwareobject = new SoftwareDevelopmentDepartment("Tom");
        System.out.print(softwareobject.getSoftwareDeveloperManager() + " works as a ");
        softwareobject.setTestingTeam("test automation ");
        softwareobject.getTestingTeam();
        System.out.print(softwareobject.getTestingTeam() + " and ");
        softwareobject.setPrograming("Alex");
        System.out.print(softwareobject.getPrograming() + " is the test automation engineer");
        System.out.println(); // this is to start a new line


        InformationSecurity securityobject = new InformationSecurity("cyber security", "cyber defense");
        System.out.print("The security department are " + securityobject.getDivision() + " and " + securityobject.getGroup());
        System.out.println();


        FinancialDepartment financialobject = new FinancialDepartment("Alen", "Stone");
        System.out.print("The company's account manger is " + financialobject.getAccountManager());
        System.out.println();
        System.out.print("The Tax accountant is " + financialobject.getTaxAccountant());
        System.out.println();


        EducationDepartment educationobject = new EducationDepartment("Data Science", 78, 50);
        //educationobject.getCourseId();
        String coursId_string = String.valueOf(educationobject.getCourseId());
        String numberOfTrainee_string = String.valueOf(educationobject.getNumberOfTrainee());
        System.out.print("The company provides " + educationobject.getCoursesGiven() + " training program ");
        System.out.println();
        System.out.print("course ID is " + educationobject.getCourseId() + " there are " + educationobject.getNumberOfTrainee() + " employee's taking the course");
        System.out.println();

        MarketingDepartment Marketingobject = new MarketingDepartment("Andrew");
        System.out.print("The new marketing analyst is " + Marketingobject.getMarketingAnalyst());
        Marketingobject.setSaleSupervisor("Leo"); // Setting SalesDepartment info from Marketing department Polymorphism
        System.out.println();
        System.out.print("The sales supervisor " + Marketingobject.getSaleSupervisor() + " is coming today"); // Getting SalesDepartment info from Marketing department Polymorphism
        System.out.println();
        // Create and override a one abstract method
        Marketingobject.DisplayDepartment();

        ProjectManagementDepartment projectobject = new ProjectManagementDepartment("Jerry ", "PhoneApp", 10);
        String numberOffinishtime = String.valueOf(projectobject.getFinishTime());
        System.out.println();
        System.out.print("Clint " + projectobject.getClint() + "expecting his new " + projectobject.getProjectTitle() + " develop in " + numberOffinishtime + " months ");
        System.out.println();


        HardwareDepartment hardwaredobject = new HardwareDepartment("broken", 2031, "laptop");
        String numberOfTicketNumber = String.valueOf(hardwaredobject.getTicketNumber());
        System.out.print("The " + hardwaredobject.device + " with ticket number " + numberOfTicketNumber + " is " + hardwaredobject.typeIssue);
        System.out.println();

        HumanResources humanResourcesobject = new HumanResources("Bill Joel", "Betty While", "Alex John");
        System.out.print("The human resources manager for the company is " + humanResourcesobject.getHrManager());
        System.out.println();
        System.out.print("The payroll assistant is " + humanResourcesobject.getPayrollAssistant() + " and the hiring manager is "+ humanResourcesobject.getHrManager());
    }

    EngineeringDepartment engineerobject1 = new EngineeringDepartment("Sam" ,10);
    EngineeringDepartment engineerobject2 = new EngineeringDepartment ("Tom",7);

   // int engobject1 = engineerobject1.hasCode();
   // String hascode_str = String.valueOf(engineerobject1.hasCode());
    // int engobject2= engineerobject2.hasCode();

 if ( engineerobject1.hasCode() == engineerobject2.hasCode()
    {
        if (engineerobject1.equals(engineerobject2)) ;
        System.out.print("Both team members have the same years of experience");
        else
        System.out.print("Both team members don't have the same years of experience");
    }
    else
            System.out.print("Both Object are not equal")


}



