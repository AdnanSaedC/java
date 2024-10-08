//Enum is nothing but constant
//it extends a class called enum calss
enum Status{
    Running,Failed,Working,Success;
    //they all are assinged by me
    //and has the value of 0 1 2 3
}


public class Enum{
    public static void main(String args[]){
        Status s=Status.Running;//Status.state
        System.out.println(s);

        //lets check the class the enum extends
        //remember c is small in superclass
        System.out.println(s.getClass().getSuperclass());

        System.out.println(s.ordinal());
        //lets print all the values

        Status variable[]=Status.values();
        for(Status s2: variable){
            System.out.println(s2+" : "+s2.ordinal());
        }

        //for each
        //dataType arrayName[]=array values
        /**
         * for(dataType object(i) : arrayName)
         */

        //how to use enum with if else and switch
        //if 
        //you have to give the Status class explicitly
        if(s==Status.Running){
            System.out.println("all good ");
        }
        else{
            System.out.println("sorry");
        }
        //Switch

        switch(s){
            case Running:
                //no need to mention class name explicitly
                System.out.println("all good in switch");
                break;
            default:
                System.out.println("hhfhf");
                break;
        }
        
    }
}