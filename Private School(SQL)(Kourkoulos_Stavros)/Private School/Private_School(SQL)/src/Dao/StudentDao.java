
package Dao;


import java.sql.*;
import Models.Student;
import Services.Student_Services;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import private_school.sql.Utils;


public class StudentDao {
   
    // PUT STUDENT TABLE INTO AN ARRAYLIST //
    public static ArrayList<Student> St_List() {
        
            ArrayList<Student> Stl = new ArrayList<>();
            
            Connection Student_Conn = Utils.getConnection();
            String sql = "Select * from student";
            PreparedStatement pst = null;
            ResultSet rs = null;
            Student newst;

        try {
            pst = Student_Conn.prepareStatement(sql);
            rs = pst.executeQuery();
            
            while(rs.next()) {
            newst = new Student(
                    rs.getInt("St_ID"),
                    rs.getString("St_FName"),
                    rs.getString("St_LName"),
                    rs.getDate("Date_of_Birth"),
                    rs.getInt("Tuition_Fee")
            );
            
            Stl.add(newst);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Utils.closePrepareStatement(pst);
            Utils.closeResultSet(rs);
            Utils.closeConnection(Student_Conn);
        }
        
        return Stl;
    }
    
    
    
    
    
    
    // INPUT NEW STUDENT //
    public void Operate() {
    
    Connection st_conn = Utils.getConnection();
    Student_Services insert = new Student_Services();
    Student insert_St = insert.addStudent();
    

        try { 
            String sql = "Insert into student" + "(St_ID, St_FName, St_LName, Date_of_Birth, Tuition_Fee)"    
             + "values (?,?,?,?,?)";
            PreparedStatement st = st_conn.prepareStatement(sql);
            
             st.setInt (1, insert_St.getSt_ID());
             st.setString (2, insert_St.getSt_FName());
             st.setString (3, insert_St.getSt_LName());
             st.setDate (4, (Date) insert_St.getDate_of_Birth());
             st.setInt (5, insert_St.getTuition_Fee());
        } 
        catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);  
            
            }
    }
    
    // PROCEDURE SCANNER FOR SELECTED STUDENT ID //
    
    
    public static Student FindStfromID (int St_ID) {
        
        Connection Student_Conn = Utils.getConnection();
        
        Student findtheSt = null;
        int Find_St = Student_Services.Find_St_ID();
        String sql = "Select * from student where St_ID = ?";
        ResultSet rsf = null;
        PreparedStatement ps = null;
        
        try {
            
            ps = Student_Conn.prepareStatement(sql);
            ps.setInt(1, Find_St);
            rsf = ps.executeQuery();
            
            if (rsf.next()) {
                String St_FName = rsf.getString("St_FName");
                String St_LName = rsf.getString("St_LName");
                Date Date_of_Birth = rsf.getDate("Date_of_Birth");
                int Tuition_Fee = rsf.getInt("Tuition_Fee");
                
                
                findtheSt = new Student(St_ID, St_FName, St_LName, Date_of_Birth, Tuition_Fee);
    }
    
    } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Utils.closeResultSet(rsf);
            Utils.closeConnection(Student_Conn);
        }
        return findtheSt;
}
}
        
    

    
    
    
    

