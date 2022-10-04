
package Dao;

import static Dao.CourseDao.C_List;
import Models.Course;
import Models.Student;
import Models.StudentsPerCourse;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import private_school.sql.Utils;


public class StudperCDao {
    
   
    
    // FIND ALL ST_ID FROM SPECIFIC COURSE //
    public static StudentsPerCourse countStpC(Course selectedCourse) {
        ArrayList<Student> AllStpC = new ArrayList<>();
        StudentsPerCourse spc = new StudentsPerCourse();
        spc.setID(selectedCourse.getC_ID());
        String sql = "select student.St_ID,student.St_FName,student.St_LName\n" +
                        "from student\n" +
                        "join st_course on student.St_ID=st_course.St_Course\n" +
                        "join course on st_course.C_All_St=course.C_ID" +
                        "where C_ID = ?";
        
            PreparedStatement pst = null;
            ResultSet rs;
        try {
            Connection AllStpC_conn = Utils.getConnection();
                
            Student stpC;
            
            
            pst.setInt(1, selectedCourse.getC_ID());
            pst = AllStpC_conn.prepareStatement(sql);
            rs = pst.executeQuery();
            
            while(rs.next()) {
                stpC = new Student(
                        rs.getInt("St_ID") 
                );
                
                AllStpC.add(stpC);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudperCDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        spc.setSt(AllStpC);
        spc.getTitle();
        
        return spc;       
    }        
    
    
    // All STUDENTS PER COURSE //
    
    public static ArrayList<StudentsPerCourse> AllStpC() {
         ArrayList<Course> cl =  C_List();
         ArrayList<StudentsPerCourse> AllStpC = new ArrayList<>();
         
         for(Course course : cl) {
            AllStpC.add(countStpC(course));           
         
         }
        return AllStpC;
    }

    
    
    public static String stpC(StudentsPerCourse spc) {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a Course Title: ");
        String Title = sc.next();
        String specific_course = spc.getTitle();
        
        if(specific_course.equals(Title)) {
            return Title;
        }
        else {
            String st = "Wrong Input please try again: ";
         return st;
        }
    }
}

