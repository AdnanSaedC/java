


/**
 * collection API is a concept
 * collection is an interface
 * collections is a class
 * 
 * it gives all the data structure in a readymade format
 * 
 * you have collection interface at the top
 * at many interfaces like list,set,queue and set implements the collection interface
 * 
 * 
 * collection->(list,queue,set)
 * list->multiple classes not interface(arraylist,linkedlist)
 * similarly
 * queue->deQueue class
 * 
 * set has hash set and linked hash set
 */

import java.util.ArrayList;
import java.util.Collection;

public class collectionAPI{
    public static void main(String[] args) {
        Collection<Integer> nums=new ArrayList<Integer>();
        
        //it is not array its different
        nums.add(5);
        nums.add(8);
        nums.add(4);
        nums.add(9);
        
        System.out.println(nums);
        for(int n:nums){
            System.out.println(n);
        }
    }
}