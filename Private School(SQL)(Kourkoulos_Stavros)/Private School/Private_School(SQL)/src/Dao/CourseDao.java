
package Dao;

import Models.Course;
import Services.Course_Services;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import private_school.sql.Utils;


public class CourseDao {

    // PUT course TABLE INTO AN ARRAYLIST //
    public static ArrayList<Course> C_List() {
        
            ArrayList<Course> Cl = new ArrayList<>();
            
            Connection Course_Conn = Utils.getConnection();
            String sql = "Select * from course";
            PreparedStatement pst = null;
            ResultSet rs = null;
            Course newc;
            

        try {
            pst = Course_Conn.prepareStatement(sql);
            rs = pst.executeQuery();
            
            while(rs.next()) {
            newc = new Course(
                    rs.getInt("C_ID"),
                    rs.getString("Title"),
                    rs.getString("Type"),
                    rs.getString("Stream"),
                    rs.getDate("Start_Date"),
                    rs.getDate("End_Date")
            );
            
            Cl.add(newc);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(CourseDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Utils.closePrepareStatement(pst);
            Utils.closeResultSet(rs);
            Utils.closeConnection(Course_Conn);
        }
        
        return Cl;
    }
    
    
    // INPUT NEW COURSE //
    public void Operate() {
    
    Connection c_conn = Utils.getConnection();
    Course_Services insert = new Course_Services();
    Course insert_C = insert.addCourse();

        try { 
            String sql = "Insert into course" + "(C_ID, Title, Type, Stream, Start_Date, End_Date)"    
             + "values (?,?,?,?,?,?)";
            PreparedStatement st = c_conn.prepareStatement(sql);
            
             st.setInt (1, insert_C.getC_ID());
             st.setString (2, insert_C.getTitle());
             st.setString (3, insert_C.getType());
             st.setString (4, insert_C.getStream());
             st.setDate (5, (Date) insert_C.getStart_Date());
             st.setDate(6, (Date) insert_C.getEnd_Date());
        } 
        catch (SQLException ex) {
            Logger.getLogger(CourseDao.class.getName()).log(Level.SEVERE, null, ex);  
            
            }

    }
    
    // PROCEDURE SCANNER FOR SELECTED COURSE ID //
    public static Course FindCfromID (int C_ID) {
        
        Connection Course_Conn = Utils.getConnection();
        
        Course findtheC = null;
        int Find_C_ID = Course_Services.Find_C_ID();
        String sql = "Select * from course where C_ID = ?";
        PreparedStatement ps = null;
        ResultSet rsf = null;
            
        try {
            
            ps = Course_Conn.prepareStatement(sql);
            ps.setInt(1, Find_C_ID);
            rsf = ps.executeQuery();
            
            if (rsf.next()) {
                String Title = rsf.getString("Title");
                String Type = rsf.getString("Type");
                String Stream = rsf.getString("Stream");
                Date Start_Date = rsf.getDate("Start_Date");
                Date End_Date = rsf.getDate("End_Date");
            
        findtheC = new Course(C_ID, Title, Type, Stream, Start_Date, End_Date);
        
    }
        } catch (SQLException ex) {
            Logger.getLogger(CourseDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Utils.closeResultSet(rsf);
            Utils.closeConnection(Course_Conn);
        }
        return findtheC;

} 
}
    

