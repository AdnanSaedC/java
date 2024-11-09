import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * System.out.printLn()
 * 
 * //here println is a function
 * of PrintStream
 * 
 * out is a static object of a PrintStream class
 * the beauty is it is created as a static variable inside 
 * the system class
 * 
 * system has a variable which an object of a class called 
 * PrintStream which has a function called println
 * 
 * crazy
 */
class howInputWorks{
    public static void main(String[] args) throws IOException
    {
        // int num=System.in.read();
        // System.out.println("the ascii value: "+num);
        // System.out.println("value: "+(num-48));
        //reads only one character


        //inoreder to get input like file network etc
        InputStreamReader ISObj=new InputStreamReader(System.in);
        BufferedReader obj2=new BufferedReader(ISObj);

       
        

        int num=Integer.parseInt(obj2.readLine());
        //readLine gives output as string

        System.out.println("the ascii value: "+num);
        
        obj2.close();
        //closing the resource

        //best Approach is to try and close
        try(BufferedReader obj3=new BufferedReader(new InputStreamReader(System.in));) 
        {
            //do all the opeeration
            //once all the opeartion is done
            //obj3 will be delated
        } 
    }
}