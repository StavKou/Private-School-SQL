
package Dao;

import Models.Assignment;
import Services.Assignment_Services;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import private_school.sql.Utils;


public class AssignmentDao {
    
    // PUT ASSIGNMENT TABLE INTO AN ARRAYLIST //
    public ArrayList<Assignment> Ass_List() {
            ArrayList<Assignment> Assl = new ArrayList<Assignment>();
            
            Connection Ass_Conn = Utils.getConnection();
            String sql = "Select * from assignment";
            PreparedStatement pst = null;
            ResultSet rs = null;
            Assignment newass;
            

        try {
            pst = Ass_Conn.prepareStatement(sql);
            rs = pst.executeQuery();
            
            while(rs.next()) {
            newass = new Assignment(
                    rs.getInt("Ass_ID"),
                    rs.getString("Title"),
                    rs.getString("Description"),
                    rs.getDate("Sub_Date_Time"),
                    rs.getInt("Oral_Mark"),
                    rs.getInt("Total_Mark")
            );
            
            Assl.add(newass);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(AssignmentDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Utils.closePrepareStatement(pst);
            Utils.closeResultSet(rs);
            Utils.closeConnection(Ass_Conn);
        }
        return Assl;
    }
    
    
    
    
    
    
    // INPUT NEW ASSIGNMENT //
    public void Operate() {
    
    Connection ass_conn = Utils.getConnection();
    Assignment_Services insert = new Assignment_Services();
    Assignment insert_Ass = insert.addAssignment();

        try { 
            String sql = "Insert into assignment" + "(Ass_ID, Title, Description, Sub_Date_Time, Oral_Mark, Total_Mark)"    
             + "values (?,?,?,?,?,?)";
            PreparedStatement st = ass_conn.prepareStatement(sql);
            
             st.setInt (1, insert_Ass.getAss_ID());
             st.setString (2, insert_Ass.getTitle());
             st.setString (3, insert_Ass.getDescription());
             st.setDate (4, insert_Ass.getSub_Date_Time());
             st.setInt (5, insert_Ass.getOral_Mark());
             st.setInt(6, insert_Ass.getTotal_Mark());
        } 
        catch (SQLException ex) {
            Logger.getLogger(AssignmentDao.class.getName()).log(Level.SEVERE, null, ex);  
            
            }

    }
    
    // PROCEDURE SCANNER FOR SELECTED ASSIGNMENT ID //
    public static Assignment FindAssfromID (int Ass_ID) {
        
        Connection Ass_Conn = Utils.getConnection();
        
        Assignment findtheAss = null;
        int Find_Ass = Assignment_Services.Find_Ass_ID();
        String sql = "Select * from assignment where Ass_ID = ?";
        ResultSet rsf = null;
        PreparedStatement ps = null;
        
            
        try {
            
            ps = Ass_Conn.prepareStatement(sql);
            ps.setInt(1, Find_Ass);
            rsf = ps.executeQuery();
            
            if (rsf.next()) {
                String Title = rsf.getString("Title");
                String Description = rsf.getString("Description");
                Date Sub_Date_Time = rsf.getDate("Sub_Date_Time");
                int Oral_Mark = rsf.getInt("Oral_Mark");
                int Total_Mark = rsf.getInt("Total_Mark");
                
           findtheAss = new Assignment(Ass_ID, Title, Description, (java.sql.Date) Sub_Date_Time, Oral_Mark, Total_Mark); 
       
    }
        } catch (SQLException ex) {
            Logger.getLogger(AssignmentDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
        Utils.closeConnection(Ass_Conn);
        }
        return findtheAss;
}
}
