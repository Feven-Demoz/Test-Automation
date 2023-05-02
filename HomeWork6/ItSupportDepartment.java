 class ItSupportDepartment {
     protected String typeIssue;
     protected int ticketNumber;
     protected String device;


     //public abstract void displayDepartment();
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


     public void printGreeting() {
         System.out.print("Welcome to IT Department front desk ");
         System.out.println(); // this is to start a new line
     }
 }