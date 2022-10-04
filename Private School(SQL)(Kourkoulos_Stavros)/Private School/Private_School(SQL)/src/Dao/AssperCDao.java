
package Dao;

import static Dao.CourseDao.C_List;
import Models.AssPerC;
import Models.Assignment;
import Models.Course;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import private_school.sql.Utils;


public class AssperCDao {
    
    // FIND ALL ASS_ID FROM SPECIFIC COURSE //
    
    public static AssPerC countTrpC(Course selectedCourse) {
        
        ArrayList<Assignment> AllAsspC = new ArrayList<>();
        AssPerC asspc = new AssPerC();
        asspc.setAss_ID(selectedCourse.getC_ID());
        String sql = "select course.Title,assignment.Title,assignment.Description\n" +
                     " from assignment\n" +
                     " join c_ass on Ass_All_C=assignment.Ass_ID\n" +
                     " join course on course.C_ID=C_ass.C_Ass_Involded\n" +
                     " where course.C_ID = ?";
            PreparedStatement pst = null;
            ResultSet rs;
        try {
            Connection AllAsspC_conn = Utils.getConnection();
                
            Assignment asspC;
            
            
            pst.setInt(1, selectedCourse.getC_ID());
            pst = AllAsspC_conn.prepareStatement(sql);
            rs = pst.executeQuery();
            
            while(rs.next()) {
                asspC = new Assignment(
                        rs.getInt("Ass_ID") 
                );
                
                AllAsspC.add(asspC);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudperCDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        asspc.setAss(AllAsspC);
        asspc.getTitle();
        
        return asspc;       
    }        
    
    
    // All ASSIGNMENTS PER COURSE //
    
    public static ArrayList<AssPerC> AllAsspC() {
         ArrayList<Course> cl =  C_List();
         ArrayList<AssPerC> AllAsspC = new ArrayList<>();
         
         for(Course course : cl) {
            AllAsspC.add(countTrpC(course));           
         
         }
        return AllAsspC;
    }
    
    
    public static String stpC(AssPerC apc) {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a Course Title: ");
        String Title = sc.next();
        String specific_course = apc.getTitle();
        
        if(specific_course.equals(Title)) {
            return Title;
        }
        else {
            String tr = "Wrong Input please try again: ";
         return tr;
        }
}
}