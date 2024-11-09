
import java.util.ArrayList;
import java.util.List;

public class list{
    public static void main(String[] args) {
        List<Integer> nums=new ArrayList<Integer>();
        
        //it is not array its different
        nums.add(5);
        nums.add(8);
        nums.add(4);
        nums.add(9);
        
        System.out.println(nums);
        System.out.println("hh: "+nums.get(0));
        System.out.println("rr: "+nums.indexOf(4));
        for(int n:nums){
            System.out.println(n);
        }
        //in list you can access index too
    }
}