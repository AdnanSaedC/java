import  java.lang.Exception;

class ExceptionHandling{
    public static void main(String[] args) {
        //they are two types of statement
        //normal and critical one
        //critical Stattement are those which depends on others

        int i=5;
        int j=0;
        int arr[]=new int[5];
        //normal statement
        String str=null;

        try {
            str.length();
            //look you got an exception which you itself dont know
            //so basically play with these 3 statement

            j=45/i;
            System.out.println(arr[10]);
        //it is a critical one
        //thus we tell the compiler try to execute if works
        //fine else move on
        }
        catch (ArithmeticException error){
            //this will run if you put i=0
            //here exception is a class
            //in order to catch the error you need 
            //an object
            System.out.println("Something went wrong..\\||"+error.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Hey: "+e.getMessage());
        }
        catch(Exception e)
        {   
            //make sure this is at the bottom
            //this is parent it has everything
            System.out.println("new Exception dont know  "+e.getMessage());
        }
        finally{
            System.out.println("the code got executed");
        }
        System.out.println("this is the end");

    }
}