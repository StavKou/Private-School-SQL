
package Models;


import java.sql.Date;



public class Assignment {
    
    private int Ass_ID;
    private String Title;
    private String Description;
    private Date Sub_Date_Time;
    private int Oral_Mark;
    private int Total_Mark;

    public Assignment() {
    }

    public Assignment(int Ass_ID) {
        this.Ass_ID = Ass_ID;
    }
    
    
    public Assignment(int Ass_ID, String Title, String Description, Date Sub_Date_Time, int Oral_Mark, int Total_Mark) {
        this.Ass_ID = Ass_ID;
        this.Title = Title;
        this.Description = Description;
        this.Sub_Date_Time = Sub_Date_Time;
        this.Oral_Mark = Oral_Mark;
        this.Total_Mark = Total_Mark;
    }

    public Assignment(int Ass_ID, String Title, String Description, java.util.Date Sub_Date_Time, int Oral_Mark, int Total_Mark) {
        this.Ass_ID = Ass_ID;
        this.Title = Title;
        this.Description = Description;
        this.Sub_Date_Time = (Date) Sub_Date_Time;
        this.Oral_Mark = Oral_Mark;
        this.Total_Mark = Total_Mark;
        
    }

    public int getAss_ID() {
        return Ass_ID;
    }

    public void setAss_ID(int Ass_ID) {
        this.Ass_ID = Ass_ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public Date getSub_Date_Time() {
        return Sub_Date_Time;
    }

    public void setSub_Date_Time(Date Sub_Date_Time) {
        this.Sub_Date_Time = Sub_Date_Time;
    }

    public int getOral_Mark() {
        return Oral_Mark;
    }

    public void setOral_Mark(int Oral_Mark) {
        this.Oral_Mark = Oral_Mark;
    }

    public int getTotal_Mark() {
        return Total_Mark;
    }

    public void setTotal_Mark(int Total_Mark) {
        this.Total_Mark = Total_Mark;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Assignment{Ass_ID=").append(Ass_ID);
        sb.append(", Title=").append(Title);
        sb.append(", Description=").append(Description);
        sb.append(", Sub_Date_Time=").append(Sub_Date_Time);
        sb.append(", Oral_Mark=").append(Oral_Mark);
        sb.append(", Total_Mark=").append(Total_Mark);
        sb.append('}');
        return sb.toString();
    }

    
    
    
    
}
