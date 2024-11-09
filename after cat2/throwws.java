//in throws you just not dealing with exceptions 
//you are just telling the method which called you
//to deal with that stuff

//the flow is JVM-main-method
class DontKnow{
    public void show() throws ClassNotFoundException 
    {
        Class.forName("lamdaExpression");
        Class.forName("justTry");

        //here it will run that file
        //from my folder
        //it that file didnot found
        //it will transmit to main since
        //it was calling it
    }
}

public class throwws{
    public static void main(String[] args) {
        DontKnow obj=new DontKnow();
        try {
        obj.show();
        System.err.println("hello executed succesfully");
        } 
        catch(ClassNotFoundException e){
            System.err.println(e.getMessage());
            System.err.println("failed");
        }
    }
}