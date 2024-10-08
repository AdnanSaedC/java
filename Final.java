class ParentClass{
    public final void show(){
        System.out.print("You are my child remember");
        final double pi=3.46;
        //pi=4;  
        /*
        *this will not work since final */
    }
}
final class ChildClass extends ParentClass{
    //public void show(){
        //you cant do this because it is a final function
        //
        //similarly you cant inheret this class 
        //since it is a final class
    
}

public class Final{
    public static void main(String args[]){
        ChildClass obj1=new ChildClass();
    }
}