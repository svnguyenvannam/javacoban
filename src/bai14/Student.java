package bai14;

import java.util.GregorianCalendar;

public class Student {
    protected String fullname;
    protected GregorianCalendar doB;
    protected String gender;
    protected String phoneNumber;
    protected String university_Name;
    protected String gradeLevel;

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public GregorianCalendar getDoB() {
        return doB;
    }

    public void setDoB(GregorianCalendar doB) {
        this.doB = doB;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUniversity_Name() {
        return university_Name;
    }

    public void setUniversity_Name(String university_Name) {
        this.university_Name = university_Name;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    Student(String fullname, GregorianCalendar doB, String gender, String phoneNumber,
             String university_Name, String gradeLevel){
        this.fullname = fullname;
        this.doB = doB;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.university_Name = university_Name;
        this.gradeLevel = gradeLevel;


    }

}
