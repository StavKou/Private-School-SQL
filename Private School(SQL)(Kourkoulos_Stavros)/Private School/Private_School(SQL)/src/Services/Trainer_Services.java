
package Services;

import Models.Trainer;
import java.util.Scanner;


public class Trainer_Services {
   
    public static int Find_Tr_ID() {
        
        System.out.println("Type a Trainer ID: ");
        Scanner sc = new Scanner(System.in);
        int Tr_ID = sc.nextInt();
        
        return Tr_ID;
    }
    
    // ADD AND RETURN NEW TRAINER //
      
      public Trainer addTrainer() {
          
          Scanner sc = new Scanner(System.in);
          System.out.println("Trainers ID:");
          int Tr_ID = Integer.parseInt(sc.next());
          System.out.println("Trainers First Name: ");
          String Tr_FName = sc.next();
          System.out.println("Trainers Last Name: ");
          String Tr_LName = sc.next();
          System.out.println("Subject Of Trainer: ");
          String Subject = sc.next();
          Trainer new_Trainer = new Trainer(Tr_ID, Tr_FName, Tr_LName, Subject);
          System.out.println(new_Trainer);
          return new_Trainer;
          
      }
    
}
