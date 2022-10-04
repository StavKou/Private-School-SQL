
package Models;


public class Trainer {
    
    private int Tr_ID;
    private String Tr_FName;
    private String Tr_LName;
    private String Subject;

    public Trainer(int Tr_ID, String Tr_FName, String Tr_LName, String Subject) {
        this.Tr_ID = Tr_ID;
        this.Tr_FName = Tr_FName;
        this.Tr_LName = Tr_LName;
        this.Subject = Subject;
    }

    public Trainer(int Tr_ID) {
        this.Tr_ID = Tr_ID;
    }
    
    

    public int getTr_ID() {
        return Tr_ID;
    }

    public void setTr_ID(int Tr_ID) {
        this.Tr_ID = Tr_ID;
    }

    public String getTr_FName() {
        return Tr_FName;
    }

    public void setTr_FName(String Tr_FName) {
        this.Tr_FName = Tr_FName;
    }

    public String getTr_LName() {
        return Tr_LName;
    }

    public void setTr_LName(String Tr_LName) {
        this.Tr_LName = Tr_LName;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Trainer{Tr_ID=").append(Tr_ID);
        sb.append(", Tr_FName=").append(Tr_FName);
        sb.append(", Tr_LName=").append(Tr_LName);
        sb.append(", Subject=").append(Subject);
        sb.append('}');
        return sb.toString();
    }

    
    
    
    
}
