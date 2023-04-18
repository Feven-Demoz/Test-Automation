public class D10_Human_Resources{
    private String HR_Manager;
    private String Payroll_assistant;
    private String Hiring_Manager;

    float salary;

    public D10_Human_Resources(float salary_enter) {
        this.salary = salary_enter;
    }

    public String obtain_HR_Manager() {
        return HR_Manager;
    }

    public void enter_HR_Manager(String HR_Manager) {
        this.HR_Manager = HR_Manager;
    }

    public String obtain_Payroll_assistant() {
        return Payroll_assistant;
    }

    public void enter_Payroll_assistant(String payroll_assistant) {
        Payroll_assistant = payroll_assistant;
    }

    public String obtain_Hiring_Manager() {
        return Hiring_Manager;
    }

    public void enter_Hiring_Manager(String hiring_Manager) {
        Hiring_Manager = hiring_Manager;
    }
}
