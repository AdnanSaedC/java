import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        //getting the input from the user
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of classes: ");
        int numberOfClasses=sc.nextInt();
        System.out.print("Enter the number of classes attended: ");
        int numberOfClassesAttended=sc.nextInt();


        //converting the value from float to integer
        numberOfClassesAttended*=100;

        //calculating the difference
        int  difference=(numberOfClassesAttended/numberOfClasses);

        //to show the output
        int extraClasses=0;

        //to do the opeartion
        int totalClasses=0;
        if(difference==100){
            System.out.print("You have got 100% attendance\nCongragulations");
        }
        else if(difference > 75){
            totalClasses=numberOfClasses;
            while((numberOfClassesAttended/totalClasses)>75){
                totalClasses++;//since we are calculating how many class we have to relax
                extraClasses++;//storing the value in this variable
            }
            System.out.print("Extra classes to relax: "+extraClasses);
        }
        else if(difference < 75){
            totalClasses=numberOfClasses;
            extraClasses=numberOfClassesAttended;
            while((extraClasses/totalClasses) < 75){
                totalClasses++;
                extraClasses+=100;//since we have multiplied by 100 in the top
            }
            System.out.print("Extra Classes to recover 75%: "+((extraClasses-numberOfClassesAttended)/100));
        }
    }
}