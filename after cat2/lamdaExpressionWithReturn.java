//single abstarct method
//or an interface with only one method

//the goal here is you want an interface wbhich has only one
//method

@FunctionalInterface
interface A{
    int show(int i);
    //they are public and abstract
}
class B implements A{
    @Override
    public int show(int i){
        System.out.println("hello");
        return i;
    }
}
public class lamdaExpressionWithReturn{
    public static void main(String args[]){
        // A obj1=i->{
        //     return  i;
        // };

        
        //Another way 
        A obj1= i -> i;
        //since you are giving the parameter
        //it bydefault becomes the retutn type


        int x=obj1.show(5);
        System.out.println(x);
    }
}