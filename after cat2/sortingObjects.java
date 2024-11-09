
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class sortingObjects{
    public static void main(String[] args) {


        
        List<Integer> nums=new ArrayList<Integer>();
        nums.add(8);
        nums.add(7);
        nums.add(6);
        nums.add(5);

        //lets sort this
        //collections is a class
        //it is used to sort objects
        Collections.sort(nums);
        System.out.println(nums);

        //lets sort them in my logic
        //which is descending
        //for that you need an object of comparator interface

        Comparator<Integer> obj1=new Comparator<Integer>()
        {
            @Override
            public int compare(Integer i,Integer j){
                //integer because sort is for objects
                if(i<j){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        };
        Collections.sort(nums,obj1);
        System.out.println(nums);

        //read the example too which is after this one
        
    }
}