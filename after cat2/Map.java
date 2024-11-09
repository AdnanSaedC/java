/**
 * it doesnot extends the collection interface
 * but it is a part of collection API concept
 * 
 * its like object in javaScript
 * which has key and value associated to it
 * 
 * here the keys are unique
 */

import java.util.Map;

public class Map{
    public static void main(String[] args) {
        Map<String,Integer> students=new HashMap<>();
        //if you are dealing with threads use hashtable
        students.put("adnan",45);
        students.put("saed",45);
        students.put("adnan",455);
        students.add("adnan",45);

        System.out.println(students);
    }
}