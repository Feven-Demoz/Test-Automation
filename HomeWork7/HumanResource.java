public class HumanResource extends Employees implements IPrintInfo{
   protected float socialSecurity;
    protected double salary ;

    public HumanResource(String name, int employeeId, String department, float socialSecurity, double salaryEnter)throws InvalidSalary {
        super(name, employeeId, department);
        if (salaryEnter<1000|| salaryEnter >1000000){
            throw new InvalidSalary("The salary enter is out of bound.");
        }
        this.socialSecurity = socialSecurity;
        this.salary= salaryEnter;
    }


    public float getSocialSecurity() {
        return socialSecurity;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public void performQualityCheck() {

    }

    @Override
    public void performDesignCheck() {

    }
    @Override
    public void printInfo(){
        System.out.print("Employee Id " + getEmployeeId()+ " with social security " + getSocialSecurity() + " earns " + getSalary() + " per month");
    }
}
