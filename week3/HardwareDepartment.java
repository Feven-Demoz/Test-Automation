public class HardwareDepartment {
    protected String typeIssue;
    protected int ticketNumber;
    protected String device;


    public HardwareDepartment(String typeIssueEnter, int ticketNumberEnter, String deviceEnter) {
        this.typeIssue = typeIssueEnter;
        this.ticketNumber= ticketNumberEnter;
        this.device= deviceEnter;

    }
    public String getTypeIssue() {
        return typeIssue;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

}
