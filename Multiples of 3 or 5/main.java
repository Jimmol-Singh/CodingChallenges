
import java.util.*;
public class HelloWorld{

     public static void main(String []args){
       
       //Arraylist created
       ArrayList<Integer> multipleofthree = new ArrayList<Integer>();
       ArrayList<Integer> multipleoffive = new ArrayList<Integer>();
       ArrayList<Integer> combined = new ArrayList<Integer>();
       
       //Adding elements to arraylist(multipleofthree)
       for(int i = 3; i < 25; i=i+3){
           multipleofthree.add(i);
       }
       
       //Adding elements to arraylist(multipleoffive)
       for(int i = 5; i < 25; i=i+5){
           multipleoffive.add(i);
       }
       
       //Printing arraylist(multipleofthree)
       System.out.println();
       System.out.println();
       System.out.println("Multiple of 3: ");
       System.out.println(multipleofthree);
       System.out.println();
       
       
       //Printing arraylist(multipleoffive)
       System.out.println("Multiple of 5: ");
       System.out.println(multipleoffive);
       
       //Adding arraylist to another arrayList(combined)
       System.out.println();
       combined.addAll(multipleofthree);
       combined.addAll(multipleoffive);
       System.out.println("Combined: ");
       System.out.println(combined);
       
       //Set created
       Set<Integer> s = new HashSet<Integer>(combined);
      
       
       System.out.println();
       System.out.println("Sorted and Duplicates Deleted:");
       System.out.println(s);
      
       //Summing elements in set
       int sum = 0;
       
       for (Integer e : s){
           sum += e;
       } 
       
       System.out.println();
       System.out.println("Sum:");
       System.out.println(sum);
       
       
       
       
       
     }
}
