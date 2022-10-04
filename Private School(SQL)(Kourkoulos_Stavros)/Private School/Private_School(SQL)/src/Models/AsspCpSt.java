
package Models;

import java.util.ArrayList;


public class AsspCpSt {
    
    private int ID;
    String C_Title;
    String St_Name;
    private ArrayList<Assignment> ass;

    public AsspCpSt() {
    }

    public AsspCpSt(int ID) {
        this.ID = ID;
    }

    public AsspCpSt(int ID, String C_Title, String St_Name, ArrayList<Assignment> ass) {
        this.ID = ID;
        this.C_Title = C_Title;
        this.St_Name = St_Name;
        this.ass = ass;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getC_Title() {
        return C_Title;
    }

    public void setC_Title(String C_Title) {
        this.C_Title = C_Title;
    }

    public String getSt_Name() {
        return St_Name;
    }

    public void setSt_Name(String St_Name) {
        this.St_Name = St_Name;
    }

    public ArrayList<Assignment> getAss() {
        return ass;
    }

    public void setAss(ArrayList<Assignment> ass) {
        this.ass = ass;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AsspCpSt{ID=").append(ID);
        sb.append(", C_Title=").append(C_Title);
        sb.append(", St_Name=").append(St_Name);
        sb.append(", ass=").append(ass);
        sb.append('}');
        return sb.toString();
    }
}
