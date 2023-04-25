abstract class HardwareDepartment {
    protected String typeIssue;
    protected int ticketNumber;
    protected String device;


    public abstract void DisplayDepartment();
    public String getTypeIssue() {
        return typeIssue;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String deviceEnter) {
        this.device = deviceEnter;
    }

    public void setTypeIssue(String typeIssueEnter) {
        this.typeIssue = typeIssueEnter;
    }

    public void setTicketNumber(int ticketNumberEnter) {
        this.ticketNumber = ticketNumberEnter;
    }
}

