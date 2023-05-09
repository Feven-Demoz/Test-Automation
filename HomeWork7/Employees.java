import java.util.logging.Logger;
public abstract class Employees {
    Logger log = Logger.getLogger(Employees.class.getName());
    protected String name;
    protected int employeeId;
    protected String department;

  

       public abstract void performQualityCheck();
       public abstract void performDesignCheck();


     public Employees(String name, int employeeId, String department){
         this.name = name;
         this.employeeId = employeeId;
         this.department= department;

     }
     public String getName() {
         return name;
     }

     public int getEmployeeId() {
         return employeeId;
     }

     public String getDepartment() {
         return department;
     }

     }






