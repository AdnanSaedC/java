import java.lang.Exception;

class AdnanException extends Exception{
    public AdnanException(String str){
        super(str);
        //calling the parent constructor

        System.out.println("From Adnan: "+str);

        //another way is to give it to the parents
    }
}

class cretingYourOwnException{
    public static void main(String[] args) {
        try {
            throw new AdnanException("just for fun");
        } 
        catch (AdnanException e) {
            System.err.println(e.getMessage());
        }
    }
}