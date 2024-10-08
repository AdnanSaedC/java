class OuterClass{
    public void show(){
        System.out.println("hi");
    }
        class SubClass{
            public void show(){
                System.out.println("bye");
            }
        }
        static class SubClass2{
            public void show(){
                System.out.println("bye2");
            }
        }
    
}

public class InnerClass{
    public static void main(String args[]){
        OuterClass obj1=new OuterClass();

        //to access inner class you need obj of outer class
        OuterClass.SubClass obj2=obj1.new SubClass();
        obj2.show();
        

        //since sublclass2 is a static class no need of object of outerclass
        OuterClass.SubClass2 obj3=new OuterClass.SubClass2();
        obj3.show();
        obj1.show();
        //from that it is clear that obj1 will call the outerclas
        //obj2 will call the subclass
        //obj3 will by default call the subclass3 function
    }
}