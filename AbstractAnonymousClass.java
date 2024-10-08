abstract class Parent{
    public abstract void show();
    public void config(){
        System.out.println("Hi");
    }
    abstract void Parent();
}

public class AbstractAnonymousClass{
    public static void main(String args[]){
        Parent obj1=new Parent(){
            public void show(){
                System.out.println("An object of anonymous class is created");
                //not abstract class
            }
            void Parent(){
                System.out.println("After a long time");
            }
            //it will not work with constructors
            
        };
        obj1.show();
        obj1.config();
    }
}