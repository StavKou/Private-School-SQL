
package Services;

import Models.AssPerC;
import Models.AsspCpSt;
import java.util.ArrayList;
import private_school.sql.Utils;
import java.sql.Connection;


public class AsspCpSt_Services {
    
    
    // ADD A NEW ASSIGNMENT INTO A SPECIFIC COURSE WITH STUDENTS IN IT//
    
        static ArrayList<AssPerC> StpC = new ArrayList<>();
        
        
        public void insertStinAsspC (AsspCpSt asspcpst) {
        
            Connection con = Utils.getConnection();
        
        }
}
