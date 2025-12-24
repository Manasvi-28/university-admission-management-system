package UniversitySystem;

import java.util.*;

public class Working {
    public static void main(String[] args) {
         UniversityManagement obj =new UniversityManagement();
         Scanner sc =new Scanner(System.in);
         char ch =' ';
         while(ch!='n')
         {System.out.println("Enter 'a' for adding a student,'b' for printing details of a student',"+
          "'c' for printing details of all students,'d' for printing the students with highest cgpa and 'n' to exit ");
          ch =sc.next().charAt(0);
          sc.nextLine();
          switch(ch)
          {
            case 'a' :
            {
               obj.addStudent();
               break;
            }
              case 'b' :
            {  
                System.out.println("Enter student name to be searched: ");
                String s =sc.nextLine();
               obj.printDetails(s);
               break;
            }
              case 'c' :
            {
               obj.prints();
               break;
            }
             case 'd' :
            {
               obj.highestCgpa();;
               break;
            }
          }
        }
    }
    
}
