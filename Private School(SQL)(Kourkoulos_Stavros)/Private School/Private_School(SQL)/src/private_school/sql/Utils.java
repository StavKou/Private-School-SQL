
package private_school.sql;

import Models.Student;
import java.sql.*;
import java.sql.SQLException;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Utils {
    
        final static String url = "jdbc:mysql://localhost:3306/private_school";
        final static String user = "root";
        final static String password = "227454541Aa";
        private static final String localDateFormat = "dd/MM/yyyy";
      
        public static Connection getConnection() {

            Connection conn = null;
            try {
                conn = DriverManager.getConnection(url, user, password);
                System.out.println("You are now Connected in the Database: ");
            } catch (SQLException ex) {
                Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
            }
return conn;
}
        
        // CLOSE CONNECTION //
        public static void closeConnection(Connection conn) {
            if(conn != null) {
                
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        }
        
        
        
        
        // CLOSE STATEMENT //
        public static void closePrepareStatement (Statement st) {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        
        // CLOSE RESULTSET //
        public static void closeResultSet(ResultSet rs) {
        if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
                }   
            }
        }
        
        
               // DATE INPUT FORMAT //
        public static LocalDate provideADate(Scanner input) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern(localDateFormat);
        LocalDate result;
        while (true) {
            try {
                System.out.println("PLEASE PROVIDE A DATE IN THE FORMAT OF ( 01/01/2010)");
                String in = input.next();
                result = LocalDate.parse(in, format);
                break;
            } catch (DateTimeException e) {

            }
        }
        return result;
    }

        
        // A LIST OF STUDENTS THAT BELONG TO MORE THAN ONE COURSES //
        
        public static ArrayList<Student> AllStwmtoc() {
        
            ArrayList<Student> Stlwmtoc = new ArrayList<Student>();
            Connection Student_Conn = Utils.getConnection();
            String sql = "select student.St_ID,student.St_FName,student.St_LName\n" +
                         "from student \n" +
                         "join st_course on student.St_ID=st_course.St_Course\n" +
                         "group by St_Course having count(*)>1";
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
                    rs.getString("St_LName")
            );
            
            Stlwmtoc.add(newst);
            }
            
        }
            catch (SQLException ex) {
            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Utils.closePrepareStatement(pst);
            Utils.closeResultSet(rs);
            Utils.closeConnection(Student_Conn);
        }
        
        return Stlwmtoc;
            
        }
}
