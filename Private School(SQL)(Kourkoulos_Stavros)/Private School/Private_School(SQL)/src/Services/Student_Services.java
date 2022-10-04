
package Services;

import Models.Student;
import java.sql.Date;
import java.util.Scanner;
import static private_school.sql.Utils.provideADate;




// SEARCH STUDENT WITH AN ID //
public class Student_Services {
    
    
    public static int Find_St_ID() {
        
        System.out.println("Type a Student ID: ");
        Scanner sc = new Scanner(System.in);
        int St_ID = sc.nextInt();
        
        return St_ID;
    }
  
    // ADD AND RETURN NEW STUDENT //
        
        public static Student addStudent() {
            
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Student ID: ");
        int St_ID = Integer.parseInt(sc.next());
        System.out.println("Student First Name: ");
        String St_FName = sc.next();
        System.out.println("Student Last Name: ");
        String St_LName = sc.next();
        System.out.println("Date of Birth (Type dd/MM/yyyy)");
        Date Date_of_Birth = java.sql.Date.valueOf(provideADate(sc));
        System.out.println("Tuition Fee of Student: ");
        int Tuition_Fee = Integer.parseInt(sc.next());
        
        
        Student new_Student = new Student(St_ID, St_FName, St_LName, Date_of_Birth, Tuition_Fee);
        System.out.println(new_Student);
        return new_Student;
        }
    
}
