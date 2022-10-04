
package Models;

import java.util.Date;


public class Student {
    
    private int St_ID;
    private String St_FName;
    private String St_LName;
    private Date Date_of_Birth;
    private int Tuition_Fee;

    // 1 //
    public Student(int St_ID, String St_FName, String St_LName, Date Date_of_Birth, int Tuition_Fee) {
        this.St_ID = St_ID;
        this.St_FName = St_FName;
        this.St_LName = St_LName;
        this.Date_of_Birth = Date_of_Birth;
        this.Tuition_Fee = Tuition_Fee;
    }
    // 2 //
    public Student(int St_ID, String St_FName, String St_LName) {
        this.St_ID = St_ID;
        this.St_FName = St_FName;
        this.St_LName = St_LName;
    }

    // 3 //
    public Student(int St_ID) {
        this.St_ID = St_ID;
    }
    // 4 //
    public Student() {
    }

    public Student(int St_ID, String St_FName, String St_LName, java.sql.Date Date_of_Birth) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    public int getSt_ID() {
        return St_ID;
    }

    public void setSt_ID(int St_ID) {
        this.St_ID = St_ID;
    }

    public String getSt_FName() {
        return St_FName;
    }

    public void setSt_FName(String St_FName) {
        this.St_FName = St_FName;
    }

    public String getSt_LName() {
        return St_LName;
    }

    public void setSt_LName(String St_LName) {
        this.St_LName = St_LName;
    }

    public Date getDate_of_Birth() {
        return Date_of_Birth;
    }

    public void setDate_of_Birth(Date Date_of_Birth) {
        this.Date_of_Birth = Date_of_Birth;
    }

    public int getTuition_Fee() {
        return Tuition_Fee;
    }

    public void setTuition_Fee(int Tuition_Fee) {
        this.Tuition_Fee = Tuition_Fee;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student{St_ID=").append(St_ID);
        sb.append(", St_FName=").append(St_FName);
        sb.append(", St_LName=").append(St_LName);
        sb.append(", Date_of_Birth=").append(Date_of_Birth);
        sb.append(", Tuition_Fee=").append(Tuition_Fee);
        sb.append('}');
        return sb.toString();
    }

    
    
    
    
    
}
