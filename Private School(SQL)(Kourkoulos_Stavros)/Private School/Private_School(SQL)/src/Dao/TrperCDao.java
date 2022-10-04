
package Dao;

import static Dao.CourseDao.C_List;
import Models.Course;
import Models.Trainer;
import Models.TrainersPerC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import private_school.sql.Utils;


public class TrperCDao {
    
    // FIND ALL ST_ID FROM SPECIFIC COURSE //
    public static TrainersPerC countTrpC(Course selectedCourse) {
        ArrayList<Trainer> AllTrpC = new ArrayList<>();
        TrainersPerC tpc = new TrainersPerC();
        tpc.setID(selectedCourse.getC_ID());
        String sql = "select trainer.Tr_ID,trainer.Tr_FName,trainer.Tr_LName\n" +
                        "from trainer\n" +
                        "join tr_course on trainer.Tr_ID=tr_course.Tr_Course\n" +
                        "join course on tr_course.C_All_St=course.C_ID" +
                        "where C_ID = ?";
            PreparedStatement pst = null;
            ResultSet rs;
        try {
            Connection AllTrpC_conn = Utils.getConnection();
                
            Trainer trpC;
            
            
            pst.setInt(1, selectedCourse.getC_ID());
            pst = AllTrpC_conn.prepareStatement(sql);
            rs = pst.executeQuery();
            
            while(rs.next()) {
                trpC = new Trainer(
                        rs.getInt("Tr_ID") 
                );
                
                AllTrpC.add(trpC);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudperCDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        tpc.setTr(AllTrpC);
        tpc.getTitle();
        
        return tpc;       
    }        
    
    
    // All TRAINERS PER COURSE //
    
    public static ArrayList<TrainersPerC> AllTrpC() {
         ArrayList<Course> cl =  C_List();
         ArrayList<TrainersPerC> AllTrpC = new ArrayList<>();
         
         for(Course course : cl) {
            AllTrpC.add(countTrpC(course));           
         
         }
        return AllTrpC;
    }
    
    public static String stpC(TrainersPerC tpc) {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a Course Title: ");
        String Title = sc.next();
        String specific_course = tpc.getTitle();
        
        if(specific_course.equals(Title)) {
            return Title;
        }
        else {
            String tr = "Wrong Input please try again: ";
         return tr;
        }
    }
}
       