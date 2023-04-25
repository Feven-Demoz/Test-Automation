import java.util.Objects;

class ItSupportDepartment extends HardwareDepartment {


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

    @Override             //sale department have abstract metode which is can't have body(value) and markating can override it and have access
    public void DisplayDepartment() { System.out.print("Welcome to IT Department front desk and Hardware Department ");

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItSupportDepartment that = (ItSupportDepartment) o;
        return Objects.equals(getSupportSpecialist(), that.getSupportSpecialist()) && Objects.equals(getItSupportManger(), that.getItSupportManger()) && Objects.equals(getItConsultant(), that.getItConsultant());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSupportSpecialist(), getItSupportManger(), getItConsultant());
    }
}

