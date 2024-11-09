//single abstarct method
//or an interface with only one method

//the goal here is you want an interface wbhich has only one
//method

@FunctionalInterface
interface A{
    void show();
    //they are public and abstract
}
class B implements A{
    @Override
    public void show(){
        System.out.println("hello");
    }
}
public class functionalInterfacee{
    public static void main(String args[]){
        B obj1=new B();
        obj1.show();
        A obj2=new A(){
            public void show(){
                System.err.println("Hello");
            }
        };
        obj2.show();
    }
}