//the speciality is it allows only unique values
//it gives values in its own sequence so no index value


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class set{
    public static void main(String[] args) {
        Set<Integer> nums=new HashSet<Integer>();
        
        //it is not array its different
        nums.add(445);
        nums.add(87852);
        nums.add(478);
        nums.add(1449);
        
        System.out.println("nums: "+nums);
        

        System.out.println("Element of nums");
        for(int n:nums){
            System.out.println(n);
        }
        
        //you can also works with iterator
        

        Set<Integer> nums1=new TreeSet<Integer>();
        //the beauty is you will get a sorted array(not exactly array)
        //it is not array its different
        nums1.add(445);
        nums1.add(87852);
        nums1.add(478);
        nums1.add(1449);
        
        Iterator<Integer> values=nums1.iterator();
        //.iterator gives Iterator object
        

        //hasNext will tell you do we have next element
        System.out.println("nums after sorted");
        while(values.hasNext()){
            //.next will give the current element
            System.out.println(values.next());
        }

        System.out.println("Tree set ouput");
        System.out.println(nums1);
        
        for(int n:nums1){
            System.out.println(n);
        }
    }
}