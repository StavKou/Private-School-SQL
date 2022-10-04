
package Services;

import Models.Assignment;
import java.sql.Date;
import java.util.Scanner;
import static private_school.sql.Utils.provideADate;


public class Assignment_Services {
    
    public static int Find_Ass_ID() {
        
        System.out.println("Type an Assignment ID: ");
        Scanner sc = new Scanner(System.in);
        int Ass_ID = sc.nextInt();
        
        return Ass_ID;
    }
    
    // ADD AND RETURN NEW ASSIGNMENT //
      
      public Assignment addAssignment() {
      
          Scanner sc = new Scanner(System.in);
          System.out.println("Assignment ID: ");
          int Ass_ID = sc.nextInt();
          System.out.println("Assignments Title");
          String Title = sc.nextLine();
          System.out.println("Assignments Description: ");
          String Description = sc.nextLine();
          Date Sub_Date_Time = java.sql.Date.valueOf(provideADate(sc));
          System.out.println("Oral Mark Of Assignment: ");
          int Oral_Mark = sc.nextInt();
          System.out.println("Total Mark of Assignment: ");
          int Total_Mark = sc.nextInt();
          Assignment new_Assignment = new Assignment(Ass_ID, Title, Description, Sub_Date_Time, Oral_Mark, Total_Mark);
          System.out.println(new_Assignment);
          return new_Assignment;
      }
}
