package UniversitySystem;
public class Enrollment {
         
         public String enroll(double marks)
         {  
        
           if(marks>90&&marks<=100)
           {System.out.println("You have been alloted CSE branch.");
            return "CSE";
           }
           else if(marks>80&&marks<=90)
           {System.out.println("You have been alloted IT branch.");
            return "IT";
           }
           else if(marks>70&&marks<=80)
           {System.out.println("You have been alloted ECE branch.");
            return "ECE";
           }
           else if(marks>60&&marks<=70)
           {System.out.println("You have been alloted EE branch.");
            return "EE";
           }
           else if(marks>50&&marks<=60)
           {System.out.println("You have been alloted ME branch.");
            return "ME";
           }
            else
            {
                System.out.println("Sorry you are not selected.");
                System.exit(0);
                return null;
            }

         }

}
