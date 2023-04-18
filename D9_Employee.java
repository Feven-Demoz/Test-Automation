public class D9_Employee {

    int ssn;

    public D9_Employee(int ssn_enter) {
        this.ssn = ssn_enter;
    }

    private int employee_ID;
    private String firstname;
    private String lastname;

    public int obtain_Employee_ID() {
        return employee_ID;
    }

    public void enter_Employee_ID(int employee_ID) {
        this.employee_ID = employee_ID;
    }

    public String obtain_firstname() {
        return firstname;
    }

    public void enter_firstname(String firstname_enter) {    //enter_firstname9(tom)
        this.firstname = firstname_enter;    // assign it the private firstname
    }

    public String obtain_Lastname() {
        return lastname;
    }

    public void enter_Lastname(String lastname) {
        this.lastname = lastname;
    }

//System.out.print

}
