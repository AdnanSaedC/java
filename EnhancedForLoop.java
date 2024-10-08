//Enhanced for loop
import java.util.Scanner;
package java;
class Students{
    int rollNo;
    String name;
    Scanner sc=new Scanner(System.in);

    public void getInfo(){
        System.out.print("Enter the rollno: ");
        rollNo=sc.nextInt();
        sc.nextLine();//why this line because whenever
        //i enter the number and press enter (5\n) this is what
        //happening behind the scene so iam consuming \n by this line
        System.out.print("Enter the Name: ");
        name=sc.nextLine();
        
    }
}


public class EnhancedForLoop{
    public static void main(String args[]){
        Students S1=new Students();
        Students S2=new Students();
        Students S3=new Students();
        S1.getInfo();
        S2.getInfo();
        S3.getInfo();

        Students studentArray[]= new Students[3];
        studentArray[0]= S1;
        studentArray[1]= S2;
        studentArray[2]= S3;

        for(Students studentOfInterest : studentArray){
            System.out.println(studentOfInterest.rollNo + " + " + studentOfInterest.name);
        }
        
    }
}