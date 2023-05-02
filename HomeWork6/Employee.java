import java.util.ArrayList;

 public class Employee {

    private String name;
    private String position;
    private int employeeId;

     public Employee(String nameEnter, String positionEnter, int employeeIdEnter) {
         this.name = nameEnter;
         this.position= positionEnter;
         this.employeeId=employeeIdEnter;
     }
     public Employee(){

     }
    public String getName()
    {
        return name;
    }

    public void setName(String nameEnter) {

         this.name = nameEnter;
    }

    public String getPosition() {

         return position;
    }

    public void setPosition(String positionEnter) {

         this.position = positionEnter;
    }

    public int getEmployeeId() {

         return employeeId;
    }

    public void setEmployeeId(int employeeIdEnter) {

         this.employeeId = employeeIdEnter;
    }
    public static Employee [] creatEmployee() {
        Employee[] listOfEmployee = new Employee[3];
        listOfEmployee[0] = new Employee("Ben", "programmer", 298);
        listOfEmployee[1] = new Employee("Alex", "developer", 389);
        listOfEmployee[2] = new Employee("Sam", "seniorDeveloper", 789);

        return listOfEmployee;
    }
 }

