
package Services;

import Dao.TrperCDao;
import Models.Trainer;
import Models.TrainersPerC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import private_school.sql.Utils;


public class TrperC_Services {
    
    static ArrayList<Trainer> TrpC = new ArrayList<Trainer>();
    
    
    // ADD A NEW STUDENT INTO A SPECIFIC COURSE //
        
        public void insertTrinC(TrainersPerC StpC) {
        
        Connection TrainerpC_Conn = Utils.getConnection();
            String sql = "Insert into tr_course" + "(Tr_ID, C_ID)"
                    + "value (?,?)";
            PreparedStatement pst = null;
            ResultSet rs = null;
            TrainersPerC TrpCourse = null;
            
            for(Trainer Trainer : TrpCourse.getTr()) {
            try {
                pst.setInt(1, Trainer.getTr_ID());
                pst.setInt(2, TrpCourse.getID());
            } catch (SQLException ex) {
                Logger.getLogger(TrperCDao.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
    
    }
}
