
public class Manager extends Employees implements Imanage{
    private String title;
    private int yearsOfExperience;

    public Manager(String nameEnter, int employeeIdEnter, String titleEnter, String department,int yearsOfExperienceEnter ) throws InvalidYearsOfExperience{ //String projectNameEnter, int startMonthEnter, int endMonthEnter,
        super(nameEnter, employeeIdEnter, department );//projectNameEnter,startMonthEnter,endMonthEnter);

      if (yearsOfExperienceEnter <=5 ){
           throw new InvalidYearsOfExperience(" Managers must have 5 years or more years of experience");
       }
        this.title = titleEnter;
        this.yearsOfExperience= yearsOfExperienceEnter;


    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public void performQualityCheck() {

    }

    @Override
    public void performDesignCheck() {

    }

    @Override
    public void manage (){
       System.out.print ( getName() + " is the " + getTitle() + " of " + getDepartment() + " and has " + getYearsOfExperience() + " years of experience.");
   }

}
