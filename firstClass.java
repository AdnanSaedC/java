//Classes and objects 
import java.util.Scanner;

class Input{
    int a;
    int b;

    public int getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the fist number: ");
        a=sc.nextInt();
        System.out.print("Enter the second number: ");
        b=sc.nextInt();
        Add obj2=new Add();
        int result=obj2.add(a,b);
        a=5;
        return result;
        
    }
}

class Add{
    public int add(int num1,int num2){
        int result =num1+num2;
        return result;
    }
}

public class firstClass{
    public static void main(String args[]){
        
        Input obj1=new Input();
        int x=obj1.getInput();
        System.out.print(obj1.a);

    }
}