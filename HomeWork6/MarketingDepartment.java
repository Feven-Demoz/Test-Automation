import java.util.Objects;

class MarketingDepartment extends SalesDepartment { //marketing department can access all the function in sales department bc we salesd is abstract

    protected String marketingPlatform;
    protected float marketingBudget;


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

    @Override
    public void displayDepartment() {
        System.out.print("Welcome to Sales & Marketing Department");
    }
} //sale department have abstract metode which is can't have body(value) and markating can override it and have access


    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MarketingDepartment that = (MarketingDepartment) o;
        return Float.compare(that.getMarketingBudget(), getMarketingBudget()) == 0 && Objects.equals(Objects.equals(getMarketingPlatform(), that.getMarketingPlatform());
    }

    @Override
    public int hashCode() {
        return Objects.hash( getMarketingPlatform(), getMarketingBudget());
    }
}
*/
