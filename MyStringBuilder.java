//String builder private constructor static method

import java.util.Scanner;

class Static{
        String rollno;
        static String prefix;
        
        static{
            prefix="23MIS";
            System.out.print("Hi");
            Static q2=new Static();
        }
        
        private Static(){
            Scanner sc=new Scanner(System.in);
            
            rollno=sc.nextLine();
            rollno=prefix.concat(rollno);
            System.out.print(rollno);
        }
        public static void main(){
            System.out.println("Bye: ");
            //from here it is optional but iam calling
            Static q1=new Static();
        }
    
}


public class MyStringBuilder{
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder("Adnan");
        /**
         * the functions are
         * sb.append(String)
         * String x=sb.toString();
         * sb.deleteCharAt(index)
         * sb.insert(index,string)
         */
        sb.append("SAEd");
        System.out.println(sb);
        Static.main();
        //only hi and bye you acn expect hi since class 
        //got loaded and a object got created
        //static method to do that
        
    }
}