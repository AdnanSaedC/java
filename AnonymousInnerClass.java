class ParentClass{
    public void show1(){
        System.out.print("Parent");
    }
}
public class AnonymousInnerClass{
    public static void main(String args[]){
        //i dont want to print parent only for now i want to print 
        //child
        ParentClass obj1=new ParentClass(){
            public void show1(){
        System.out.print("child");
    }

        };
        obj1.show1();

        ParentClass obj2=new ParentClass(){
            //it will look here since we havenot did method
            //overriding it checked the og class
        };
        obj2.show1();
    }
}