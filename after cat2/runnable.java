//here we are ctrating thread in another way

//it is mainly used to in inheritance

//since multiple inheritance is not possible in java

class A extends Thread{

    //now all the objects created in this class
    //is a thread
    public void run(){
        for (int i = 0; i < 5; i++) {
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


class runnable{
    public static void main(String[] args) {

        //one way
        Runnable obj1=new Runnable(){
            public void run(){
                for (int i = 0; i < 5; i++) {
            System.out.println("hello forom runnable");
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
        };
        Runnable obj2=()->{
            for (int i = 0; i < 5; i++) {
            System.out.println("hello from lamda");
            try {
                
                //this is to print hi hello one by one
                Thread.sleep(10);

                //you can even get hi twice or hello twice
                //because both of them reached the compiler simultaneously
            } catch (InterruptedException ex) {
                System.err.println(ex.getMessage());
            }
        }
        };
        Runnable obj3=new A();

        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        Thread t3=new Thread(obj3);
        //inorder to create a thread we need a runnable object

        

        t1.start();
        t2.start();
        t3.start();
    }
}