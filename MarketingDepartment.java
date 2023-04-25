import java.util.Objects;

class MarketingDepartment extends SalesDepartment{ //marketing department can access all the function in sales department bc we salesd is abstract
    protected String marketingAnalyst;
    protected String marketingPlatform;
    protected float marketingBudget;

     public MarketingDepartment(String marketingAnalyst) {
         this.marketingAnalyst = marketingAnalyst;
     }
    public String getMarketingAnalyst() {
         return marketingAnalyst;
    }

    public void setMarketingAnalyst(String marketingAnalyst) {
         this.marketingAnalyst = marketingAnalyst;
    }

    public String getMarketingPlatform() {
         return marketingPlatform;
    }

    public void setMarketingPlatform(String marketingPlatform) {
         this.marketingPlatform = marketingPlatform;
    }

    public float getMarketingBudget() {
         return marketingBudget;
    }

    public void setMarketingBudget(float marketingBudget) {

         this.marketingBudget = marketingBudget;
    }

     @Override             //sale department have abstract metode which is can't have body(value) and markating can override it and have access
     public void DisplayDepartment() {
         System.out.print("Welcome to Sales & Marketing Department");
     }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MarketingDepartment that = (MarketingDepartment) o;
        return Float.compare(that.getMarketingBudget(), getMarketingBudget()) == 0 && Objects.equals(getMarketingAnalyst(), that.getMarketingAnalyst()) && Objects.equals(getMarketingPlatform(), that.getMarketingPlatform());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMarketingAnalyst(), getMarketingPlatform(), getMarketingBudget());
    }
}

