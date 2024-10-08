class A
{   
    String value="5";
    //public static int a=5;

    //read the comments of main class then come here
    public String toString(){
        return "madness";
    }

    // go to main now start reading again
    //overriding
    public boolean equals(A obj2){
        return this.value==obj2.value ;
    }
    //now we got true
}

public class ObjectClass{
    public static void main(String args[]){
        A obj1=new A();
        System.out.println(obj1);
        //behind the scene System.out.print(obj1.toString())
        //lets verify
        System.out.println(obj1.toString());
        //System.out.println(obj1.a);
        //output will be classname+@+hascode in hexadecimal format
        
        //hashcode- a code which comprise of everything which is in the class
        //run now and then comment out static variable 
        //and system.out and run you will get a different hashcode

        //lets override this method

        A obj2=new A();
        //lets compare
        System.out.print(obj1.equals(obj2));

        //we got false because it checks the in the
        //heap whether two objects share the same memory or not
        //lets override
        
        
    }
}