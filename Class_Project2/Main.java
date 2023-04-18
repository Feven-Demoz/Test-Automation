public class Main {
    public static void main(String[] args) {

        D1_FrontDesk frontdeskobject = new D1_FrontDesk("John");
        frontdeskobject.printgreating();
        System.out.print("This is " +frontdeskobject.CustomerName + " from front desk" );
        System.out.println(); // this is to start a new line

        D2_Software_Development softwareobject = new D2_Software_Development("Programer","Lisa");
        softwareobject.print1();
        System.out.print(softwareobject.name + " works as a " +softwareobject.job_title );
        System.out.println(); // this is to start a new line

        D3_Information_Security securityobject = new D3_Information_Security("cyber_security", "cyber_defense" );
        System.out.print("The security department are " + securityobject.division + " " + securityobject.group );
        System.out.println();

        D4_Financial financialobject = new D4_Financial( "Alen", "Stone");
        System.out.print("Account Manger " + financialobject.Account_manager);
        System.out.println();
        System.out.print("The Tax accountant is " + financialobject.Tax_accountant);
        System.out.println();

        D5_Training_Department trainingobject = new D5_Training_Department("Bob", "software_development");
        System.out.print( trainingobject.new_employee + " is on training for " + trainingobject.Department);
        System.out.println();


        D6_Hardware h_dobject = new D6_Hardware("broken");
        h_dobject.enter_Ticket_no (7008);
        String Ticket_no_string = String.valueOf(h_dobject.obtain_Ticket_no());  // to convert int to string
        //System.out.print(h_dobject.obtain_Ticket_no());
        h_dobject.enter_Device ("laptop");
        //System.out.print("Ticket Number " + Ticket_no_string + " is for device "+ h_dobject.obtain_Device());
        //System.out.println();
        System.out.println("The device " +h_dobject.obtain_Device() + " for the ticket number of " + Ticket_no_string + " is " + h_dobject.type_issue  );
        System.out.println();


        D7_Project_Management projectobject = new D7_Project_Management("Mike ","New_App",10);
        System.out.print("The project name " +projectobject.project_title + " is for the client " + projectobject.clint +" time needed to finish project month "+ projectobject.finish_time);
        System.out.println(); // this is to start a new line

        //projectobject.print7();
        D8_Management managementobject = new D8_Management("Albert", "Sam", "Helen" );
        System.out.print("The CEO is " + managementobject.CEO );
        System.out.println();
        System.out.print( " The CFO is " + managementobject.CFO );
        System.out.println();
        System.out.print( " The Vice President " + managementobject.VP_IT);
        System.out.println();

        D9_Employee employeeobject = new D9_Employee(23469);
        employeeobject.enter_Employee_ID (1245);
        System.out.print(employeeobject.obtain_Employee_ID() + " employee ID");
        employeeobject.enter_firstname ("Tom "); //entering the first name tom and asinging to first name(privet varaible)
        System.out.println(); // this is to start a new line
          // employeeobject.obtain_firstname(); accessing the privet varaible by calling obtain firstname(public) fun
        employeeobject.enter_Lastname ("Black ");
        System.out.print("Employee full Name " + employeeobject.obtain_firstname() + employeeobject.obtain_Lastname());
        System.out.println();
        String ssn_string = String.valueOf(employeeobject.ssn);  // to convert int to string
        System.out.print("The new employee " + employeeobject.obtain_firstname() + " has ssn of " + ssn_string );
        System.out.println();

        D10_Human_Resources HRobject = new D10_Human_Resources(10000);
        String salary_string = String.valueOf(HRobject.salary); // to convert float to string
        System.out.print("The HR salary is "+ salary_string );
        System.out.println(); // this is to start a new line
        HRobject.enter_HR_Manager ( "Bill Joel ");
        System.out.println(); // this is to start a new line
        System.out.print(HRobject.obtain_HR_Manager() + "is the HR manager");
        System.out.println(); // this is to start a new line
        HRobject.enter_Payroll_assistant ("Betty White ");
        System.out.print(HRobject.obtain_Payroll_assistant() + " is the payroll assistant ");
        System.out.println(); // this is to start a new line
        HRobject.enter_Hiring_Manager ("Alex Jon");
        System.out.print(HRobject.obtain_Hiring_Manager() + " is the hiring manager");
    }
 }

