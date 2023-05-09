public class BackendDeveloper extends Employees implements IBuildData {
    private String experienceLevel;
   private String programmingLanguage;

    public BackendDeveloper(String nameEnter, int employeeIdEnter, String departmentEnter  ,String experienceLevelEnter,String programmingLanguageEnter ) { //String projectNameEnter, int startMonthEnter, int endMonthEnter,
       super(nameEnter, employeeIdEnter,departmentEnter  );//projectNameEnter, startMonthEnter, endMonthEnter);
       this.experienceLevel = experienceLevelEnter;
     this.programmingLanguage=programmingLanguageEnter;
   }

    public String getExperienceLevel() {
      return experienceLevel;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
   }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public void setExperienceLevel(String experienceLevel) {
        this.experienceLevel = experienceLevel;
    }

    @Override
    public void maintainData() {

   System.out.print("In order to maintain data you need " + getExperienceLevel() + " level of experience" );
    }

    @Override
    public void performQualityCheck() {
        System.out.print("You need  " + getExperienceLevel() + " in order to perform quality check" );
    }

    @Override
   public void performDesignCheck() {
   }



 //  @Override
 //  public void profileCheck() {

    //}

}
