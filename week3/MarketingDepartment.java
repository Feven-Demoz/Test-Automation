 class MarketingDepartment extends SalesDepartment { //marketing department can access all the function in sales department bc we salesd is abstract
    private String marketingAnalyst;
    private String marketingPlatform;
    private float marketingBudget;

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
 }

