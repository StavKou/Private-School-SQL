
package Models;

import java.util.Date;


public class Course {
    
    private int C_ID;
    private String Title;
    private String Type;
    private String Stream;
    private Date Start_Date;
    private Date End_Date;

    public Course(int C_ID, String Title, String Type, String Stream, Date Start_Date, Date End_Date) {
        this.C_ID = C_ID;
        this.Title = Title;
        this.Type = Type;
        this.Stream = Stream;
        this.Start_Date = Start_Date;
        this.End_Date = End_Date;
    }

    public Course() {}

    
    public int getC_ID() {
        return C_ID;
    }

    public void setC_ID(int C_ID) {
        this.C_ID = C_ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getStream() {
        return Stream;
    }

    public void setStream(String Stream) {
        this.Stream = Stream;
    }

    public Date getStart_Date() {
        return Start_Date;
    }

    public void setStart_Date(Date Start_Date) {
        this.Start_Date = Start_Date;
    }

    public Date getEnd_Date() {
        return End_Date;
    }

    public void setEnd_Date(Date End_Date) {
        this.End_Date = End_Date;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Course{C_ID=").append(C_ID);
        sb.append(", Title=").append(Title);
        sb.append(", Type=").append(Type);
        sb.append(", Stream=").append(Stream);
        sb.append(", Start_Date=").append(Start_Date);
        sb.append(", End_Date=").append(End_Date);
        sb.append('}');
        return sb.toString();
    }

    
    
    
    
}
