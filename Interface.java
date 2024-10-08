interface A{
    int a=58;
    //this is final(cant be changed) and static
    //because the work of interface is 
    //to provide blueprint 


    void show();
    void display();

    //they both are now public and abstract functions
    //we dont declare because child of A
    //must have these things but it there way
    /**
     * interfacs animal
     * they would have void sound(){}
     * they value and the behaviour depends on the 
     * specific animal but it must posses a sound
     */
}

abstract class B implements A
//careful not extends but implements
{
    public void show(){
        System.out.println("bye");
    }

    //it is an abstract class since it dont declares the 
    //function display
}
class C extends B{
    public void display(){
        System.out.println("Display");
    }
}


//Need of Interface
/*
 * help us to generalize stufff
 */

interface Computer{
    void coding();
}
interface Server extends Computer{
    //Inheritance works here perfectly
}
interface Server2{
    void coding();
    void compile();
}
class Desktop implements Server,Server2{
    //you can extends two interface with same function also 
    //possible

    //the thing to play is parameters then
    //you have to declare both
    //return type will give you an error
    public void coding(){
        System.out.println("Faster");
    }
    public void compile(){

    }
}
class Laptop implements Computer{
    public void coding(){
        System.out.println("Working");
    }
}
public class Interface{
    public static void main(String args[]){
        C obj1=new C();
        //B obj=new B(); this will not work
        obj1.show();
        obj1.display();
        System.out.println(obj1.a);

        //we can create a general refrence variable and use it 
        //everywhere
        Computer obj8=new Laptop();
        obj8.coding();
        //we are using the same and doing our work
        obj8=new Desktop();
        obj8.coding();
        //since the refrence variable is of computer you cant
        //call compile

        
    }
}