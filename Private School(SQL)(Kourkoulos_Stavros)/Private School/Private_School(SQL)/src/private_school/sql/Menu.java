
package private_school.sql;

import Dao.AssignmentDao;
import Dao.CourseDao;
import Dao.StudentDao;
import Dao.TrainerDao;
import Models.AssPerC;
import Models.Assignment;
import Models.Course;
import Models.Student;
import Models.Trainer;
import java.util.Scanner;
import Models.StudentsPerCourse;
import Models.TrainersPerC;


public class Menu {
    
    
    
    public Menu allMenu() {
        StudentsPerCourse spc = new StudentsPerCourse();
        TrainersPerC tpc = new TrainersPerC();
        AssPerC apc = new AssPerC();
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 to make a new Registration "
        + " 2 to see the Lists " + "3 to Search something specific, " + "4 to see the Students with more than one Course, " + "5 to see everything per Course " + "or 0 to terminate the programm ");
        int choice1 = sc.nextInt();
        while ((choice1 != 1) && (choice1 != 2) && (choice1 !=3) && (choice1 !=4) && (choice1 !=5) && (choice1 != 0)) {
        System.out.println("Wrong Input! Please press one from the choices above: ");
        choice1 = Integer.parseInt(sc.next());
        }
        
        
        if (choice1 != 0) 
        do{
            if (choice1 == 1) {
                 System.out.println("Press 6 to add new Student, " + "7 to add new Trainer, " + "8 to add new Course, " +
                         "9 to add new Assignment " + "or 0 to terminate the programm");
                 int choice2 = Integer.parseInt(sc.next());
                 
                 while ((choice2 != 6) && (choice2 != 7) && (choice2 != 8) && (choice2 != 9) && (choice2 != 0)) {
                 System.out.println("Wrong input! Please press one from the above");
                 choice2 = Integer.parseInt(sc.next());
                 }
                 
                 switch (choice2) {
                     case 6:
                         System.out.println("Add new Student: ");
                         StudentDao addstudent = new StudentDao();
                         addstudent.Operate();
                         break;
                         
                     case 7:
                         System.out.println("Add new Trainer: ");
                         TrainerDao addtrainer = new TrainerDao();
                         addtrainer.Operate();
                         break;
                         
                     case 8:
                         System.out.println("Add new Course: ");
                         CourseDao addcourse = new CourseDao();
                         addcourse.Operate();
                         break;
                         
                     case 9:
                         System.out.println("Add new Assignment: ");
                         AssignmentDao addassignment = new AssignmentDao();
                         addassignment.Operate();
                         break;
                         
                     default:
                         System.out.println("Termination ");
                         choice1 = 0;
                         break;
                 }
                 
                 
              } else if (choice1 == 2) {
                  System.out.println("Press 10 to see the List of All Students, " + "11 to see the List of All Trainers, " + "12 to see the List of All Courses, " +
                           "13 to see the List of All Assignments " + "or 0 to terminate programm ");
                  int choice3 = Integer.parseInt(sc.next());
                  while ((choice3 != 10) && (choice3 != 11) && (choice3 != 12) && (choice3 != 13) && (choice3 != 0)) {
                      System.out.println("Wrong input! Please press one from the above");
                      choice3 = Integer.parseInt(sc.next());
                  }
                  switch (choice3) {
                      case 10:
                          System.out.println("All Students List: ");
                          System.out.println(StudentDao.St_List());
                          break;
                          
                      case 11:
                          System.out.println("Trainers List: ");
                          TrainerDao trlist = new TrainerDao();
                          System.out.println(TrainerDao.Tr_List());
                          break;
                          
                      case 12:
                          System.out.println("Courses List: ");
                          CourseDao clist = new CourseDao();
                          System.out.println(clist.C_List());
                          break;
                          
                      case 13:
                          System.out.println("Assignments List: ");
                          AssignmentDao asslist = new AssignmentDao();
                          System.out.println(asslist.Ass_List());
                          break;
                          
                      default:
                          System.out.println("Termination");
                          choice1 = 0;
                          break;
                  }
                  
                  
            } else if (choice1 == 3) {
                System.out.println("Press 15 to search a specific Student, " + "16 to search a specific Trainer, " + 
                        "17 to search a specific Course, " + "18 to search a specific Assignment " + "or 0 to terminate the programm: ");
                int choice4 = Integer.parseInt(sc.next());
                while ((choice4 != 15) && (choice4 != 16) && (choice4 !=17) && (choice4 !=18) && (choice4 != 0)) {
                System.out.println("Wrong input! Please choose one from above");
                choice4 = Integer.parseInt(sc.next());
                }
                
                switch (choice4) {
                    case 15:
                    int St_ID = Integer.parseInt(sc.next());       
                    Student student = StudentDao.FindStfromID(St_ID);
                    System.out.print(student);
                    break;
                        
                    case 16:
                        int Tr_ID = Integer.parseInt(sc.next());       
                    Trainer trainer = TrainerDao.FindTrfromID(Tr_ID);
                    System.out.print(trainer);
                    break;
                       
                    case 17:
                        int C_ID = Integer.parseInt(sc.next());       
                    Course course = CourseDao.FindCfromID(C_ID);
                    System.out.print(course);
                    break;
                       
                    case 18:
                        int Ass_ID = Integer.parseInt(sc.next());       
                    Assignment assign = AssignmentDao.FindAssfromID(Ass_ID);
                    System.out.print(assign);
                    break;
                        
                    default:
                        System.out.println("Termination");
                                choice1 = 0;
                        break;
                }
            
            } else if (choice1 == 4) {
                System.out.println("Those Are the Students with more than one Course: ");
                System.out.println(Utils.AllStwmtoc());
                break;
                
            } else if (choice1 == 5) {
                System.out.println("Press 20 to find All Students per Course, " + "21 to find All Trainers per Course, " + 
                        "22 to find All Assignments per Course " + "or 0 to terminate the programm: ");
                int choice5 = Integer.parseInt(sc.next());
                while ((choice5 != 20) && (choice5 != 21) && (choice5 != 21) && (choice5 != 0)) {
                System.out.println("Wrong input! Please choose one from above");
                choice5 = Integer.parseInt(sc.next());
                
                
                switch (choice5) {
                    case 20:
                        System.out.println("Give me a Course Title: ");
                        String Title = sc.next();
                        Title = Dao.StudperCDao.stpC(spc);
                        System.out.println(spc.getTitle());
                        break;
                        
                    case 21:
                        System.out.println("Give me a Course Title: ");
                        String C_Title = sc.next();
                        C_Title = Dao.TrperCDao.stpC(tpc);
                        System.out.println(tpc.getTitle());
                        break;
                        
                    case 22:
                        System.out.println("Give me a Course Title: ");
                        String A_C_Title = sc.next();
                        A_C_Title = Dao.AssperCDao.stpC(apc);
                        System.out.println(apc.getTitle());
                        break;
                        
                    default:
                            System.out.println("Termination");
                                choice1 = 0;
                                break;
                    }
                    }
                    
            } else {
                System.out.println("Termination");
             
            } 
            }   while (choice1 != 0);
              System.out.println("Terminatation");
              
                 Menu allMenu = new Menu();
                 return allMenu;
    }
}           