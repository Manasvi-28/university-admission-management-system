package UniversitySystem;

import java.util.*;

public class UniversityManagement {
    ArrayList<Student> students=new ArrayList<>();
     Scanner sc=new Scanner(System.in);
    Enrollment obj1=new Enrollment();

    public void addStudent()
    {      Student obj=new Student();
         Course obj2=new Course();
           System.out.print("Enter your competitive exam marks : ");
           obj.competitiveExamMarks=sc.nextDouble();
           sc.nextLine();
           obj.branch = obj1.enroll(obj.competitiveExamMarks);
           System.out.print("Enter your name : ");
           obj.name=sc.nextLine();
           sc.nextLine();
           obj2.yourcourses(obj.branch);
           obj.rollno= students.size()+1;
            Set<String> keys=obj2.courses.keySet();
           for(String key: keys)
           { 
            System.out.print(" Enter credits for " + key + " course with maximum credits " + obj2.courses.get(key)+ ": ");
            int n=sc.nextInt();
            obj.yourcourse.put(key,n);
            obj.cgpa+=n;
           }
           students.add(obj);
    }
    public void printDetails(String n)
      { boolean flag=true;
        for(Student stud : students)
        {
            if(n.equals(stud.name))
            {  flag=false;
               System.out.println("Name : "+ stud.name +"\nrollno : "+ stud.rollno+"\nbranch : "+ stud.branch +"\ncgpa : "+stud.cgpa );  
                Set<String> keys=stud.yourcourse.keySet();
           for(String key: keys)
           {
            System.out.println(key +" : "+ stud.yourcourse.get(key));
            }
        }}
        if(flag==true)
        {
            System.out.println("Student not found.");
        }
      }
      public void prints()
      {
        for(Student stud : students)
        {
               System.out.println("Name : "+ stud.name +"\nrollno : "+ stud.rollno+"\nbranch"+ stud.branch +"\ncgpa"+stud.cgpa );  
                Set<String> keys=stud.yourcourse.keySet();
           for(String key: keys)
           {
            System.out.println(key +" : "+ stud.yourcourse.get(key));
            }
        }
      }
      public void highestCgpa()
      {  int r=0;
        for(Student stud : students)
        {
            if(stud.cgpa>r)
            {
                r=stud.cgpa;
            }
        }
        for(Student stud : students)
        {
            if(stud.cgpa==r)
            {
                System.out.println("Name : "+ stud.name +"\nrollno : "+ stud.rollno+"\nbranch"+ stud.branch +"\ncgpa"+stud.cgpa ); 
            }
        }
      }
      }
