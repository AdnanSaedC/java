/**
 * Mutation-something which you can change
        int i=0;
        i=10

    one bank account with two card
    when you work with same variable using two threads

    if you are working with threads make sure that you rae dealing with
    immutable data types like string

    if not possible make it thread safe
    only one thread can deal with that at a time
 */

class Counter{
    int counter;
    int counterSynchoronized;

    public void counter(){
        counter++;
    }
    public synchronized void Scounter(){
        counterSynchoronized++;
        //synchronized keyword make the other thred
        //wait if someone using the critical section

    }
}

class raceCondition{
    public static void main(String args[]) throws InterruptedException
    {
        Counter c1=new Counter();
        Runnable obj1=()->{
            for(int i=0;i<10000;i++){
                c1.counter();
            }
        };
        Runnable obj2=()->{
            for(int i=0;i<10000;i++){
                c1.counter();
            }
        };
        Runnable obj3=()->{
            for(int i=0;i<10000;i++){
                c1.Scounter();
            }
        };
        Runnable obj4=()->{
            for(int i=0;i<10000;i++){
                c1.Scounter();
            }
        };
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        Thread t3=new Thread(obj3);
        Thread t4=new Thread(obj4);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        

        //main should wait till all the 4 completes their job
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        System.out.println(c1.counter);
        System.out.println(c1.counterSynchoronized);


        //there are chance that you will get a wrong output

    }
}

//thraed state
/**
 * new state-declaring 
 * runnable the state before executing and after declaring
 *          waiting for the cpu(start())
 * running-actual running
 * waiting-waiting for something(sleep(),wait())
 * dead
 * 
 * flow is new->runnable->dead,running->waiting,dead
 * waiting->runnable(not running)
 */