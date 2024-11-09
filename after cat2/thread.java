//hw->Os->sw
//thread are used to break different things and
//manage them simultaneosly
class A extends Thread{

    //now all the objects created in this class
    //is a thread
    public void run(){
        for (int i = 0; i < 100; i++) {
                System.out.println("hi");
            try {
                
                //this is to print hi hello one by one
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                System.err.println(ex.getMessage());
            }
        }
    }
}
class B extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("hello");
            try {
                
                //this is to print hi hello one by one
                Thread.sleep(10);

                //you can even get hi twice or hello twice
                //because both of them reached the compiler simultaneously
            } catch (InterruptedException ex) {
                System.err.println(ex.getMessage());
            }
        }
    }
}
class thread{
    public static void main(String[] args) {
        A obj1=new A();
        B obj2=new B();

        obj1.start();
        obj2.start();
        //this will execute the run function
        //you are not getting one hi one hello
        //because of scheduling and time sharing


        obj2.setPriority(Thread.MAX_PRIORITY);
        obj1.setPriority(10);


        System.err.println(obj1.getPriority());
        System.err.println(obj2.getPriority());
        //the range is from 1-10 10 is the max
    }
}