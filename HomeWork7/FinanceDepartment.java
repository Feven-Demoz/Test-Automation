public class FinanceDepartment extends Employees implements IFinance{
    private float revenue;

    public FinanceDepartment(String name, int employeeId, String department, float revenueEnter) {
        super(name, employeeId, department);
        this.revenue = revenueEnter;
    }

    public float getRevenue() {
        return revenue;
    }

    public void setRevenue(float revenue) {
        this.revenue = revenue;
    }

    @Override
    public void performQualityCheck() {

    }

    @Override
    public void performDesignCheck() {

    }

    @Override
    public void finance() {
        System.out.print(getDepartment() + " generate total income of " + getRevenue() + " for the company.");
    }
}
