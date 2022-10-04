
package Services;

import Dao.StudperCDao;
import Models.Student;
import Models.StudentsPerCourse;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import private_school.sql.Utils;


public class StudperC_Services {
    
    static ArrayList<Student> StpC = new ArrayList<Student>();
    
    
    // ADD A NEW STUDENT INTO A SPECIFIC COURSE //
        
        public void insertStinC(StudentsPerCourse StpC) {
        
        Connection StudentpC_Conn = Utils.getConnection();
            String sql = "Insert into st_course" + "(St_ID, C_ID)"
                    + "value (?,?)";
            
            PreparedStatement pst = null;
            ResultSet rs = null;
            StudentsPerCourse StpCourse = null;
            
            for(Student Student : StpCourse.getSt()) {
            try {
                pst.setInt(1, Student.getSt_ID());
                pst.setInt(2, StpCourse.getID());
            } catch (SQLException ex) {
                Logger.getLogger(StudperCDao.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
    
    }
}
