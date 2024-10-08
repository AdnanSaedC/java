//code to find common prefix

import java.util.Scanner;


public class Checkinhg{
    public static void main(String[] args){
    System.out.print("This programme tells the common string\n");
    
    //creating a string array
    String inputs[]=new String[50];

    //creating an object of scanner class
    Scanner sc=new Scanner(System.in);

    System.out.print("Give input as exit to terminate the programme\n");
    
    int count=0;

    //getting the input
    loop1:
    for(int i=0;i<50;i++){
        System.out.print("Enter the "+(i+1)+" string: ");
        inputs[i]=sc.nextLine();
        count++;
        if(inputs[i].equalsIgnoreCase("exit")){
        break loop1;
        }
    }
    
    char prefix[]=new char[20];
    int lastindex=0;

    //finding total length of first string
    int lengthOfFirstSting=inputs[0].length();
    count--;
    //to remove exit


    loop2:
    for(int j=0;j<lengthOfFirstSting;j++){
        //taking the cahracters of first string
        char charOfInterest=inputs[0].charAt(j);
        
        //considering from string two
        //j is the location and k is the index
        for(int k=1;k<count;k++){
            char currentCharacter=inputs[k].charAt(j);
            if(charOfInterest!=currentCharacter){
                break loop2;
            }
        }

        //if all the string has same value at the index j
        //adding in the array prefix
        prefix[j]=charOfInterest;

        //just to keep track of does something common exits or not
        lastindex=j;
    }
    
    if(lastindex>0){
        for(int n=0;n<lastindex+1;n++){
            System.out.print(prefix[n]);
        }
    }
    else{
        System.out.print("Nothing Common");
    }

    }
}

