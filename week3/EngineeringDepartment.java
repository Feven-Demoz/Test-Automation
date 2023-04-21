import java.util.Objects;

public class EngineeringDepartment {
    public String engineeringTeams;
    public int yearsOfExperience;

    public EngineeringDepartment(String engineeringTeamsEnter, int yearsOfExperienceEnter) {
        this.engineeringTeams = engineeringTeamsEnter;
        this.yearsOfExperience = yearsOfExperienceEnter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false; //
        EngineeringDepartment that_obj = (EngineeringDepartment) o;
      //  return getYearsOfExperience() == that.getYearsOfExperience() && Objects.equals(getEngineeringTeams(), that.getEngineeringTeams());
        return (that_obj.engineeringTeams == this.engineeringTeams && that_obj.yearsOfExperience == this.yearsOfExperience);
    }

    @Override
    public int hashCode() {
       // return Objects.hash(getEngineeringTeams(), getYearsOfExperience());
        return this.yearsOfExperience;
    }


}



