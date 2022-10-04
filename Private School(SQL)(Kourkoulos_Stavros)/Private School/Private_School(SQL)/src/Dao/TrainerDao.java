
package Dao;

import Models.Trainer;
import Services.Trainer_Services;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import private_school.sql.Utils;


public class TrainerDao {
    // PUT TRAINER TABLE INTO AN ARRAYLIST //
    public static ArrayList<Trainer> Tr_List() {
            ArrayList<Trainer> Trl = new ArrayList<Trainer>();
            
            Connection Trainer_Conn = Utils.getConnection();
            String sql = "Select * from trainer";
            PreparedStatement pst = null;
            ResultSet rs = null;
            Trainer newtr;
            

        try {
            pst = Trainer_Conn.prepareStatement(sql);
            rs = pst.executeQuery();
            
            while(rs.next()) {
            newtr = new Trainer(
                    rs.getInt("Tr_ID"),
                    rs.getString("Tr_FName"),
                    rs.getString("Tr_LName"),
                    rs.getString("Subject")
            );
            
            Trl.add(newtr);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Utils.closePrepareStatement(pst);
            Utils.closeResultSet(rs);
            Utils.closeConnection(Trainer_Conn);
        }
        
        return Trl;
    }
    
    
    
    // INPUT NEW TRAINER //
    public void Operate() {
    
    Connection tr_conn = Utils.getConnection();
    Trainer_Services insert = new Trainer_Services();
    Trainer insert_Tr = insert.addTrainer();

        try { 
            String sql = "Insert into trainer" + "(Tr_ID, Tr_FName, Tr_LName, Subject)"    
             + "values (?,?,?,?)";
            PreparedStatement st = tr_conn.prepareStatement(sql);
            
             st.setInt (1, insert_Tr.getTr_ID());
             st.setString (2, insert_Tr.getTr_FName());
             st.setString (3, insert_Tr.getTr_LName());
             st.setString (4, insert_Tr.getSubject());
        } 
        catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);  
            
            }

    }
    
    // PROCEDURE SCANNER FOR SELECTED TRAINER ID //
    public static Trainer FindTrfromID (int Tr_ID) {
        
        Connection Trainer_Conn = Utils.getConnection();
        
        Trainer findtheTr = null;
        int Find_Tr_ID = Trainer_Services.Find_Tr_ID();
        String sql = "Select * from trainer where Tr_ID = ?";
        ResultSet rsf = null;
        PreparedStatement ps = null;
            
        try {
            
            ps = Trainer_Conn.prepareStatement(sql);
            ps.setInt(1, Find_Tr_ID);
            rsf = ps.executeQuery();
            
            if (rsf.next()) {
                String Tr_FName = rsf.getString("Tr_FName");
                String Tr_LName = rsf.getString("Tr_LName");
                String Subject = rsf.getString("Subject");
            
        findtheTr = new Trainer(Tr_ID, Tr_FName, Tr_LName, Subject); 
    }
            
            } catch (SQLException ex) {
            Logger.getLogger(TrainerDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Utils.closeConnection(Trainer_Conn);
        }
        return findtheTr;
}
}
    
    
    
    


