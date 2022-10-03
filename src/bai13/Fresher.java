package bai13;

import java.util.GregorianCalendar;

public class Fresher extends Employee{
    private GregorianCalendar Graduation_date;
    private String Graduation_rank;
    private String Education;

    public GregorianCalendar getGraduation_date() {
        return Graduation_date;
    }

    public void setGraduation_date(GregorianCalendar graduation_date) {
        Graduation_date = graduation_date;
    }

    public String getGraduation_rank() {
        return Graduation_rank;
    }

    public void setGraduation_rank(String graduation_rank) {
        Graduation_rank = graduation_rank;
    }

    public String getEducation() {
        return Education;
    }

    public void setEducation(String education) {
        Education = education;
    }

    Fresher(String ID, String FullName, GregorianCalendar BirthDay, double Phone,
            String Email, int Employee_type, int Employee_count, GregorianCalendar Graduation_date
    , String Graduation_rank, String Education) {
        super(ID, FullName, BirthDay, Phone, Email,Employee_type,Employee_count);
        this.Graduation_date = Graduation_date;
        this.Graduation_rank = Graduation_rank;
        this.Education = Education;

    }
}
