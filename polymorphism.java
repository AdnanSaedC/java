//polymorphism
/**
 * a variable behaves differently at different 
 * ocassions
 * 
 * it is possible only in inheritance
 */

class ParentClass{
    void show(){
        System.out.print("parent here");
    }
}
class ChildClass extends ParentClass{
    public int test=0;
    void show(){
        System.out.print(test);
    }
}
class Myself{
    void show(){
        System.out.print("no one");
    }
}
public class polymorphism{
    public static void main(String args[]){
        ParentClass obj1=new ChildClass();
        obj1.show();
        //int value=obj1.test
        //will not work because it is a parent class thing
        ChildClass obj2=new ChildClass();
        int value=obj2.test;
        System.out.print(value);

        //ParentClass obj2=new Myself();
        //this will not work
    }
}