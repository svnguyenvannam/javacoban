package bai13;

import java.util.GregorianCalendar;
import java.util.Date;

public class Employee {
    protected String ID;
    protected String FullName;
    protected GregorianCalendar BirthDay;
    protected double Phone;
    protected String Email;
    protected int Employee_type;
    protected int Employee_count;

    Employee(String ID, String FullName,GregorianCalendar BirthDay,double Phone,
             String Email, int Employee_type, int Employee_count){
        this.ID = ID;
        this.FullName = FullName;
        this.BirthDay = BirthDay;
        this.Phone = Phone;
        this.Email = Email;
        this.Employee_type = Employee_type;
        this.Employee_count = Employee_count;

    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public GregorianCalendar getBirthDay() {
        return BirthDay;
    }

    public void setBirthDay(GregorianCalendar birthDay) {
        BirthDay = birthDay;
    }

    public double getPhone() {
        return Phone;
    }

    public void setPhone(double phone) {
        Phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getEmployee_type() {
        return Employee_type;
    }

    public void setEmployee_type(int employee_type) {
        Employee_type = employee_type;
    }

    public int getEmployee_count() {
        return Employee_count;
    }

    public void setEmployee_count(int employee_count) {
        Employee_count = employee_count;
    }
}
