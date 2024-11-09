
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class streamApI{
    public static void main(String[] args) {
        List<Integer> nums=Arrays.asList(4,5,6,4,58);
        System.out.println(nums);
        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }

        //another way
        System.out.println("forEach loop");
        nums.forEach(i->{
            System.out.println(i);
        });

        //behind the scene
        //since it is a functional ineterface
        //an interface which has only one method 

        //if you convert that to lamda you get 
        //Consumer<Integer> obj2=i->System.out.println(i);
        //and obj2=i->System.out.println(i);
        //we are just assigning the same

        Consumer<Integer> obj1=new Consumer<Integer>(){
            public void accept(Integer i){
                System.out.println(i);
            }
        };
        nums.forEach(obj1);

        //stream can be used only once
        //stream is used if you dont want any changes in your existing data
        Stream<Integer> s1=nums.stream();
        System.out.println("after stream");
        s1.forEach(i->{
            System.out.println(i);
        });

        //actuall use case
        //filter is a method which returns boolean value
        //n%2==0(itself will tell you whether its true or false)
        //map is a function which takes a parameter and does the operation
        //and returns in the same data type

        //reduce is another function
        //which has three parameter
        //(initialValue(like-0),(value1,value2),opertaion(v1+v2,v1-v2 etc))
        Stream<Integer> s2 =nums.stream()
                                .filter(n->n%2==0)
                                .map(n->n*2)
                                .sorted();
        System.out.println("hello");
        s2.forEach(i->{
            System.out.println(i);
            var a=10;
            System.out.println(a);
        });
    }
}