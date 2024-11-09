//single abstarct method
//or an interface with only one method

//the goal here is you want an interface wbhich has only one
//method

@FunctionalInterface
interface A{
    void show(int i);
    //they are public and abstract
}
class B implements A{
    @Override
    public void show(int i){
        System.out.println("hello");
    }
}
public class lamdaExpression{
    public static void main(String args[]){

        //this line can be
        /**
         * A obj1=(int i)
         * A obj1=(i)
         */
        A obj1= i -> {
            System.out.println("Hai hello: "+i);
            //this works only on functional interface
            //since they have only one function
            //the compiler knows whats happening in the back

            //the beauty is that it doesnot creates a new file
        };
        obj1.show(5);
    }
}