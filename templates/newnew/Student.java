package templates.newnew;

import java.util.ArrayList;

import java.util.*;

public class Student {

    ArrayList<Integer> rollno =new ArrayList<>();
    ArrayList<String> name =new ArrayList<>();
    ArrayList<Double> cgpa =new ArrayList<>();
    

     public void add(String name,int rollno) 
     {
         this.name.add(name);
         this.rollno.add(rollno);


     }

     public void cgpacalc()
     {Scanner sc =new Scanner(System.in);
        double sum=0;
        for(int i=0;i<6;++i)
        {
          System.out.println("Enter the gpa in subject "+(i+1)+" :");
          sum=sum+sc.nextInt();
        }
        cgpa.add(sum/6);
     }
     public void search(String n)
     {
        int i=this.name.indexOf(n);
        if (i==-1)
        {
            System.out.println("Name not found");
        }
        else{
        System.out.println("Name : "+ n +"\n"+ "Roll no : "+rollno.get(i)+ "\n" +"CGPA : " + cgpa.get(i));}
     }
     public void sorts()
     {
        for(int i=0;i<rollno.size()-1;++i)
        {    
            int pos=i;
        
            for(int j=i+1;j<rollno.size();++j)
            {
              if(rollno.get(j)<rollno.get(pos) )
              {
                pos=j;
    
              } }
              int temp=rollno.get(pos);
              rollno.set(pos,rollno.get(i));
              rollno.set(i,temp);
              String s=name.get(pos);
            name.set(pos,name.get(i));
            name.set(i,s);
            double c=cgpa.get(pos);
            cgpa.set(pos,cgpa.get(i));
            cgpa.set(i,c);
            
        }}
        public void show()
        {
           for(int i=0;i<rollno.size();++i)
           {
            
        System.out.println("Name : "+ name.get(i)+"\n"+ "Roll no : "+rollno.get(i)+ "\n" +"CGPA : " + cgpa.get(i));
           }
        }
     
     public static void main(String args[])
     {  
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of students to be added : ");
        int number=sc.nextInt();
        sc.nextLine();
        Student stud = new Student();
        for(int i=0;i<number;++i )
        {
        System.out.println("Enter the name of the student : ");
     String n= sc.nextLine();
     System.out.println("Enter the roll no: ");
     int r=sc.nextInt();
     sc.nextLine();
     stud.add(n, r);
     stud.cgpacalc();
    }
     stud.sorts();
     System.out.println("Enter y for searching an element,p for printing all values,n for nothing : ");
     char c=sc.next().charAt(0);
     sc.nextLine();
     
     switch(c)
     {
        case 'y': 
        {System.out.println("Enter name to be searched");
        String s=sc.nextLine();
            stud.search(s);
            break;}
            case 'p' :
            {
                stud.show();
                break;
            }
            case 'n' :
            {

            }

    
     }

     
     }
    }
