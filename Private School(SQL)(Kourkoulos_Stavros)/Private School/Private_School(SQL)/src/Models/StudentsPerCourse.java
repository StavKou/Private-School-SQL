
package Models;

import java.util.ArrayList;


public class StudentsPerCourse {
    private int ID;
    String Title;
    private static ArrayList<Student> st;

    public StudentsPerCourse(int ID) {
        this.ID = ID;
    }

    public StudentsPerCourse() {
    }

    public StudentsPerCourse(int ID, String Title, ArrayList<Student> st) {
        this.ID = ID;
        this.Title = Title;
        this.st = st;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public static ArrayList<Student> getSt() {
        return st;
    }

    public static void setSt(ArrayList<Student> st) {
        StudentsPerCourse.st = st;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StudentsPerCourse{ID=").append(ID);
        sb.append(", Title=").append(Title);
        sb.append('}');
        return sb.toString();
    }
    
    
    

    
   
}
