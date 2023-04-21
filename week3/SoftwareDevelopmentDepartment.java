public class SoftwareDevelopmentDepartment {
    private String softwareDeveloperManager;
    private String programing;
    private String testingTeam;

    public SoftwareDevelopmentDepartment(String softwareDeveloperManagerEnter) {
        this.softwareDeveloperManager = softwareDeveloperManagerEnter;
    }
    public String getSoftwareDeveloperManager() {
        return softwareDeveloperManager;
    }

    public void setSoftwareDeveloperManager(String softwareDeveloperManager) {
        this.softwareDeveloperManager = softwareDeveloperManager;
    }

    public String getPrograming() {
        return programing;
    }

    public void setPrograming(String programing) {
        this.programing = programing;
    }


    public String getTestingTeam() {
        return testingTeam;
    }

    public void setTestingTeam(String testingTeam) {
        this.testingTeam = testingTeam;
    }

}

