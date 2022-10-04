
package Services;

import Dao.AssperCDao;
import Models.AssPerC;
import Models.Assignment;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import private_school.sql.Utils;


public class AssPerC_Services {
    
    static ArrayList<Assignment> AsspC = new ArrayList<Assignment>();
    
    
    // ADD A NEW ASSIGNMENT INTO A SPECIFIC COURSE //
        
        public void insertAssinC(AssPerC AsspC) {
        
        Connection AsspC_Conn = Utils.getConnection();
            String sql = "Insert into ass_course" + "(Ass_ID, C_ID)"
                    + "value (?,?)";
            PreparedStatement pst = null;
            ResultSet rs = null;
            AssPerC AsspCourse = null;
            
            for(Assignment Assignment : AsspCourse.getAss()) {
            try {
                pst.setInt(1, Assignment.getAss_ID());
                pst.setInt(2, AsspCourse.getAss_ID());
            } catch (SQLException ex) {
                Logger.getLogger(AssperCDao.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
    
    }
    
}
