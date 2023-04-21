public class HumanResources{
    private String hrManager;
    private String payrollAssistant;
    private String hiringManager;


    public HumanResources(String hrManagerEnter,String payrollAssistantEnter,String hiringManagerEnter) {
        this.hrManager = hrManagerEnter;
        this.payrollAssistant=payrollAssistantEnter;
        this.hiringManager=hiringManagerEnter;
    }

    public String getHrManager() {
        return hrManager;
    }

    public void setHrManager(String hrManager) {
        this.hrManager = hrManager;
    }

    public String getPayrollAssistant() {
        return payrollAssistant;
    }

    public void setPayrollAssistant(String payrollAssistant) {
        this.payrollAssistant = payrollAssistant;
    }

    public String getHiringManager() {
        return hiringManager;
    }

    public void setHiringManager(String hiringManager) {
        this.hiringManager = hiringManager;
    }
}
