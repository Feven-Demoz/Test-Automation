public class FinancialDepartment{
    private String accountManager;
   private String taxAccountant;

    public FinancialDepartment(String accountManagerEnter, String taxAccountantEnter) {
        this.accountManager = accountManagerEnter;
        this.taxAccountant = taxAccountantEnter;

    }

    public String getAccountManager() {
        return accountManager;
    }

    public void setAccountManager(String accountManager) {
        this.accountManager = accountManager;
    }

    public String getTaxAccountant() {
        return taxAccountant;
    }

    public void setTaxAccountant(String taxAccountant) {
        this.taxAccountant = taxAccountant;
    }

}
