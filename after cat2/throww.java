//here we are going to learn how to call a catch function
class throww{
    public static void main(String args[]){
        int i=20;
        int j=0;
        try{
            j=10/i;
            System.out.println(j);
            //let call the catch
            throw new ArithmeticException();
            
            //the statement below wont work because its like return 
            //System.out.println("Hai");
            //throw new ArithmeticException("just calling for fun");
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}