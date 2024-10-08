public class WrapperClass{
    public static void main(String args[]){
        /** need - you can't use primitive datatypes
         * in some frameworks and stuff like collection
         * 
         */
        int num1=5;
        System.out.println(num1);

        Integer num2=new Integer(num1);
        System.out.println(num2);
        //this is known as boxing 
        //converting int into Integer object manually

        Integer num3=(num1);
        System.out.println(num3);
        //autoboxing
        
        
        //deboxing
        int num4=num3.intValue();
        System.out.println(num4);
    
        //autodeboxing
        int num5=num3;
        System.out.println(num5);

        //some uses of wrapper class in java 
        String str="45";
        System.out.println(Integer.parseInt(str)*2);
    }
}