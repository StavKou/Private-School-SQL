
package Models;

import java.util.ArrayList;


public class AssPerC {
    
    private int ID;
    String Title;
    private ArrayList<Assignment> ass;

    public AssPerC() {
    }

    public AssPerC(int Ass_ID) {
        this.ID = Ass_ID;
    }


    public AssPerC(int Ass_ID, String Title, ArrayList<Assignment> ass) {
        this.ID = Ass_ID;
        this.Title = Title;
        this.ass = ass;
    }

    public int getAss_ID() {
        return ID;
    }

    public void setAss_ID(int Ass_ID) {
        this.ID = Ass_ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
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
        sb.append("AssPerC{Ass_ID=").append(ID);
        sb.append(", Title=").append(Title);
        sb.append(", ass=").append(ass);
        sb.append('}');
        return sb.toString();
    }
    
}
