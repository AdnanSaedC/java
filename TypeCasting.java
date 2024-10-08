class ParentClass{
    public void show1(){
        System.out.print("Parent");
    }
}
class ChildClass extends ParentClass{
    public void show2(){
        System.out.print("child");
    }
}

public class TypeCasting{
    public static void main(String args[]){
        ChildClass obj2=new ChildClass();
        obj2.show1();
        /* this what happens in the backend 
        *ChildClass obj2=(ParentClass) new ChildClass();
        it is known as upcasting
        */
        
        ParentClass obj1=(ParentClass) obj2;
        obj2.show1();
        //now this cant call the function of childclass
        //this will not work
        
        //our aim to use the same object for child by creating 
        //a refrence variable which point to the same location
        //pointed by obj1
        ChildClass obj3=(ChildClass)obj1;
        obj3.show2();
        //this is what we call downcasting
        //same object but different use cases
    }
}