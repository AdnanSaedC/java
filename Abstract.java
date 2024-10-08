abstract class ParentClass
//since parent has abstract function
{
    public abstract void experience();
    public abstract void interpretations();
    public void relegion(){
        System.out.println("Muslim");
    }
}
abstract class ChildClass1 extends ParentClass
//since it also dont know exp and interpretation
{
    public abstract void experience();
    public abstract void interpretations();
    public void givenEducation(){
        System.out.println("Yes");
    }
}

class Me extends ChildClass1{
    public void experience(){
        //defined
    }
    public void interpretations(){
        System.out.print("hi");
    }

}


public class Abstract{
    public static void main(String args[]){
        ParentClass obj1=new Me();
        obj1.interpretations();
        //obj1.givenEducation();
        //this will not work since it dont know about 
        //its child function

        // ChildClass1 obj2=new ChildClass1();
        /**
         * this will alos not work because you cant create an
         * object of a child class
         * 
         * but but you can create a refrence variable
         */
        Me obj2=new Me();
        obj2.relegion();
        obj2.experience();
        obj2.interpretations();
        obj2.givenEducation();

    }
}