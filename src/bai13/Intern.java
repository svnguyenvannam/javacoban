package bai13;

import java.util.GregorianCalendar;

public class Intern extends Employee{
    private String Majors;
    private String Semesteres;
    private String University_name;

    public String getMajors() {
        return Majors;
    }

    public void setMajors(String majors) {
        Majors = majors;
    }

    public String getSemesteres() {
        return Semesteres;
    }

    public void setSemesteres(String semesteres) {
        Semesteres = semesteres;
    }

    public String getUniversity_name() {
        return University_name;
    }

    public void setUniversity_name(String university_name) {
        University_name = university_name;
    }

    Intern (String ID, String FullName, GregorianCalendar BirthDay, double Phone,
            String Email, int Employee_type, int Employee_count, String Majors, String Semesteres, String University_name){
        super(ID, FullName, BirthDay, Phone,Email,Employee_type,Employee_count);
        this.Majors = Majors;
        this.Semesteres = Semesteres;
        this.University_name = University_name;
    }
}
