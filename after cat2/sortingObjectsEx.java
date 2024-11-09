
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Students{
    int age;
    String name;

    public Students(int age,String name){
        this.age=age;
        this.name=name;
    }

    public String display(){
        return (this.age+" : "+this.name);
    }
}


public class sortingObjectsEx{
    public static void main(String args[]){
        List<Students> stud=new ArrayList<Students>();
        stud.add(new Students(19,"adnan"));
        stud.add(new Students(29,"saed"));
        stud.add(new Students(9,"adnan0042N"));


        for(Students s:stud){
            System.out.println(s.display());
        }

        //my goal is to sort the objects based on age
        //it is a functional inetrface so lamda 
        // Comparator<Students> obj1=new Comparator<Students>()
        // {

        //     @Override
        //     public int compare(Students s1,Students s2){
        //         //here this is the calling obj and that is someone
        //         if (s1.age<s2.age) {
        //             return 1;
        //         } else {
        //             return -1;
        //         }
        //     }
        // };

        //another way
        Comparator<Students> obj1=(s1,s2)->(s1.age>s2.age)?  1: -1;

        Collections.sort(stud,obj1);
        for(Students s:stud){
            System.out.println(s.display());
        }
    }
}