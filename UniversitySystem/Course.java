package UniversitySystem;
import java.util.*;
public class Course {
    Map<String,Integer> courses=new HashMap<String,Integer>();
    String courseCode;
    public void yourcourses(String s)
    {
    if(s.equals("CSE"))
    {   courseCode="CS101";
        courses.put("DBMS",4);
        courses.put("CSbasics",2);
        courses.put("OS",4);
    }
     else if(s.equals("IT"))
    {   courseCode="IT102";
        courses.put("JAVA",4);
        courses.put("CPP",2);
        courses.put("DSA",4);
    }
    else if(s.equals("ECE"))
    {   courseCode="EC103";
        courses.put("SNS",4);
        courses.put("MICROELECTRONICS",2);
        courses.put("DCS",4);
    }
    else if(s.equals("EE"))
    {   courseCode="EE104";
        courses.put("EEbasics",4);
        courses.put("DCmachines",2);
        courses.put("ACmachines",4);
    }
    else if(s.equals("ME"))
    {   courseCode="ME105";
        courses.put("CAD",4);
        courses.put("AUTOMATION",2);
        courses.put("ROBOTICS",4);
    }}

    
}
