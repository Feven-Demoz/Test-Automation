abstract class SalesDepartment{

     private String salesTarget;
     private float saleForecasting;



    public abstract void displayDepartment();  // abstract method where it does not have  body
    public String getSalesTarget() {

        return salesTarget;
    }


    public void setSalesTarget(String salesTargetEnter) {

        this.salesTarget = salesTargetEnter;
    }

    public float getSaleForecasting() {

        return saleForecasting;
    }

    public void setSaleForecasting(float saleForecastingEnter) {

        this.saleForecasting = saleForecastingEnter;
    }
}
