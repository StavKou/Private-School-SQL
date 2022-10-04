
package Models;

import java.util.ArrayList;


public class TrainersPerC {
    private int ID;
    String Title;
    private static ArrayList<Trainer> tr;

    public TrainersPerC() {
    }

    public TrainersPerC(int ID) {
        this.ID = ID;
    }

    public TrainersPerC(int ID, String Title, ArrayList<Trainer> tr) {
        this.ID = ID;
        this.Title = Title;
        this.tr = tr;
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

    public static ArrayList<Trainer> getTr() {
        return tr;
    }

    public static void setTr(ArrayList<Trainer> tr) {
        TrainersPerC.tr = tr;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TrainersPerC{ID=").append(ID);
        sb.append(", Title=").append(Title);
        sb.append('}');
        return sb.toString();
    }

    
    
}