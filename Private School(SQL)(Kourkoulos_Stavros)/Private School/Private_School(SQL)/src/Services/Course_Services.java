
package Services;


import Models.Course;
import java.util.Scanner;
import java.sql.Date;
import static private_school.sql.Utils.provideADate;




public class Course_Services {
    
    public static int Find_C_ID() {
        
        System.out.println("Type a Course ID: ");
        Scanner sc = new Scanner(System.in);
        int C_ID = sc.nextInt();
        
        return C_ID;
    }
                        
                
                // ADD AND RETURN NEW COURSE //
      
      public Course addCourse() {
          
          Scanner sc = new Scanner(System.in);
          System.out.println("Course ID: ");
          int C_ID = sc.nextInt();
          System.out.println("Course Title: ");
          String Title = sc.nextLine();
          System.out.println("Course Type: ");
          String Type = sc.nextLine();
          System.out.println("Course Stream: ");
          String Stream = sc.nextLine();
          System.out.println("Start Date of Course: ");
          Date Start_Date = java.sql.Date.valueOf(provideADate(sc));
          System.out.println("End Date of Course: ");
          Date End_Date = java.sql.Date.valueOf(provideADate(sc));
          Course new_Course = new Course(C_ID, Title, Type, Stream, Start_Date, End_Date);
          System.out.println(new_Course);
          return new_Course;
      }
}
