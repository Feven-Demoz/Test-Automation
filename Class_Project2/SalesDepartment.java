abstract class SalesDepartment{

     private String saleSupervisor;
     private String distributionManager;
     private String businessManager;


    public abstract void DisplayDepartment();  // abstract method where it does not have  body
    public String getDistributionManager() {
        return distributionManager;
    }

    public String getBusinessManager() {
        return businessManager;
    }

    public void setBusinessManager(String businessManager) {
        this.businessManager = businessManager;
    }

    public void setDistributionManager(String distributionManager) {
        this.distributionManager = distributionManager;
    }

    public String getSaleSupervisor() {
        return saleSupervisor;
    }

    public void setSaleSupervisor(String saleSupervisor) {
        this.saleSupervisor = saleSupervisor;
    }
}
