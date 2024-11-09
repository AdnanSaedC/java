//simply means supllement to the compiler during runtime
//also known as meta data
//its like we are providing extras data to the compiler
//during runtime

class A{
    public void showTheData(){
        System.out.println("hello from A");
    }
}
class B extends A{
    //this tells the compiler that we are overriding
    //if the name didnot match it will throw an error
    //similarly you will have @deprecated
    //there are different levels of annotations too
    @Override
    public void showTheData(){
        System.out.println("hello from B");
    }
}

class annotation{
    public static void main(String args[]){
        B obj1=new B();
        obj1.showTheData();
    }
}