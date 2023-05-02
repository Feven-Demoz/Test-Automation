import java.io.FileNotFoundException;
import java.io.FileReader;

class HumanResourceDepartment extends Employee {
protected int socialSecurityNumber;
protected int salary;


    public HumanResourceDepartment (String nameEnter, String positionEnter, int employeeIdEnter, int socialSecurityNumberEnter,int salaryEnter) {
        super (nameEnter,positionEnter,employeeIdEnter);
        this.socialSecurityNumber = socialSecurityNumberEnter;
        this.salary= salaryEnter;

    }

    public int getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    //public void setSocialSecurityNumber(Double socialSecurityNumberEnter) {
      //  this.socialSecurityNumber = socialSecurityNumberEnter;
    //}

    public int getSalary() {
        return salary;
    }

    //public void setSalary(float salaryEnter) {
      //  this.salary = salaryEnter;
    //}

    public static HumanResourceDepartment[] createHr() {
        HumanResourceDepartment[] hrList = new HumanResourceDepartment[2];
        hrList[0] = new HumanResourceDepartment("Dave", "SQL developer", 56399, 442, 4000);
        hrList[1] = new HumanResourceDepartment("Emily", "software Developer", 3236, 563, 7000);

       return hrList;
    }
    //@Override
    //public void displayEmployee() {

    //}
    public static void readContractFile (String contractFile){
        try {
            FileReader reader = new FileReader(contractFile);
        }
        catch (FileNotFoundException fnf) {
            System.out.print("The file not found please try again");
        }

    }
}



