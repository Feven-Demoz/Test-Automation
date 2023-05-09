public class FrontendDeveloper extends Employees implements ICode {
  private String nameCoverPage;

    public FrontendDeveloper(String nameEnter, int employeeIdEnter,String departmentEnter ,String nameCoverPageEnter) { // String projectNameEnter, int startMonthEnter, int endMonthEnter
        super(nameEnter, employeeIdEnter, departmentEnter);
        this.nameCoverPage = nameCoverPageEnter;
    }

    public String getNameCoverPage() {
        return nameCoverPage;
    }

    @Override
    public void performDesignCheck() {
        System.out.print("The cover page for  " + getNameCoverPage() + " is done" );
    }

    @Override
    public void performQualityCheck() {
    }



    @Override
    public void code() {
        System.out.print("The code that was used to write " + getNameCoverPage() + " is HTML" );
    }
}
