import java.util.Objects;

public class ItSupportDepartment {
    private String supportSpecialist;
    private String itSupportManger;
    private String itConsultant;


    public ItSupportDepartment(String supportSpecialistEnter, String itSupportMangerEnter, String itConsultantEnter) {
        this.supportSpecialist = supportSpecialistEnter; // assigning the supportSpecialistEnter to the supportSpecialist above
        this.itSupportManger= itSupportMangerEnter;
        this.itConsultant= itConsultantEnter;
    }
    public String getSupportSpecialist() {
        return supportSpecialist;
    }

    public void setSupportSpecialist(String supportSpecialist) {
        this.supportSpecialist = supportSpecialist;
    }

    public String getItSupportManger() {
        return itSupportManger;
    }

    public void setItSupportManger(String itSupportManger) {
        this.itSupportManger = itSupportManger;
    }

    public String getItConsultant() {
        return itConsultant;
    }

    public void setItConsultant(String itConsultant) {
        this.itConsultant = itConsultant;
    }
    public void printgreating() {
        System.out.print("Welcome to IT Department front desk ");
        System.out.println(); // this is to start a new line

    }

}

