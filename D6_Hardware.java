public class D6_Hardware {
    String type_issue;
    private int ticket_no;
    private String device;

    public D6_Hardware(String type_issue_enter) {  //constructor
        this.type_issue = type_issue_enter;
    }

    public int obtain_Ticket_no() {
        return ticket_no;
    } // using getter to access the privet ticket_no in main

    public void enter_Ticket_no(int ticket_no) {
        this.ticket_no = ticket_no;
    } //using setter to enter value on main for a privet value

    public String obtain_Device() {
        return device;
    }

    public void enter_Device(String device) {
        this.device = device;
    }
}
