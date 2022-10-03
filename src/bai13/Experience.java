package bai13;

import java.util.GregorianCalendar;

public class Experience extends Employee{
    private int ExpInYear;
    private String ProSkill;

    public int getExpInYear() {
        return ExpInYear;
    }

    public void setExpInYear(int expInYear) {
        ExpInYear = expInYear;
    }

    public String getProSkill() {
        return ProSkill;
    }

    public void setProSkill(String proSkill) {
        ProSkill = proSkill;
    }

    Experience(String ID, String FullName, GregorianCalendar BirthDay, double Phone,
               String Email, int Employee_type, int Employee_count, int ExpInYear, String ProSkill){
        super(ID,FullName,BirthDay,Phone,Email,Employee_type,Employee_count);
        this.ExpInYear =ExpInYear;
        this.ProSkill = ProSkill;


    }
}
