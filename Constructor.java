class ParentClass
//it extends object class by default
{
    ParentClass(){
        System.out.print("Parent");
    }
    ParentClass(int n){
        System.out.print("Parent with int");
    }
}
class ChildClass extends ParentClass{
    ChildClass(){
        //super();
        //calling parent
        super(4);
        //you can call any one constructor at a time
        //it should be on the top
        // this(5);
        System.out.print("Child Class");
        //calling parameterized constructor of this 
        //class
    }
    ChildClass(int n){
        System.out.print("Child Class int");
    }
    
}


class Constructor{
    public static void main(String args[]){
        ChildClass obj1=new ChildClass();
    }
}