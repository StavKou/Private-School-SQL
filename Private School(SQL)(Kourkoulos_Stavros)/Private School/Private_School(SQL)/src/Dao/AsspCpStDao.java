
package Dao;

import static Dao.CourseDao.C_List;
import Models.Assignment;
import Models.AsspCpSt;
import Models.Course;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import private_school.sql.Utils;


public class AsspCpStDao {
    
    // FIND ALL ASS_ID FROM SPECIFIC ASSIGNMENT FROM A COURSE //
    public static AsspCpSt countAsspCpSt(Course selectedCourse) {
    
        ArrayList<Assignment> AllAsspCpSt = new ArrayList<>();
            AsspCpSt asscst = new AsspCpSt();
            asscst.setID(selectedCourse.getC_ID());
            String sql = "select course.Title,assignment.Title,student.St_FName,student.St_LName\n" +
                    " from assignment\n" +
                    " join c_ass on Ass_All_C=assignment.Ass_ID\n" +
                    " join course on course.C_ID=c_ass.C_Ass_Involded\n" +
                    " join st_ass on c_ass.Ass_All_C=st_ass.Ass_All_St\n" +
                    " join student on st_ass.St_Involved_Ass=student.St_ID";
            
            PreparedStatement pst = null;
            ResultSet rs;
            
            
        try {
            Connection conn = Utils.getConnection();
            
            Assignment asspcpst;
            
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            
            while(rs.next()) {
                asspcpst = new Assignment(
                        rs.getInt("Ass_ID") 
                );
                
                AllAsspCpSt.add(asspcpst);
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(AsspCpStDao.class.getName()).log(Level.SEVERE, null, ex);
        }
            asscst.setAss(AllAsspCpSt);
            asscst.getC_Title();
            asscst.getSt_Name();
            
            return asscst;
    }
    
    
    
    // All ASSIGNMENTS PER COURSE PER STUDENTS //
        public static ArrayList<AsspCpSt> AllAsspCpSt() {
        
            ArrayList<Course> cl =  C_List();
         ArrayList<AsspCpSt> AllAsspCpSt = new ArrayList<>();
         
         for (Course course : cl) {
             AllAsspCpSt.add(countAsspCpSt(course));
         }
         
         return AllAsspCpSt;
        }
}
