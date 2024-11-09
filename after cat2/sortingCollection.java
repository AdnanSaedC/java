
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sortingCollection{
    public static void main(String[] args) {
        
        List<Integer> nums=new ArrayList<Integer>();
        nums.add(8);
        nums.add(7);
        nums.add(6);
        nums.add(5);

        //lets sort this
        //collections is a class
        Collections.sort(nums);

        int arr[]=new int[4];
        arr[0]=1;
        arr[1]=10;
        arr[2]=8;
        arr[3]=2;
        Collections.sort(arr);
        System.out.println(arr);
    }
}