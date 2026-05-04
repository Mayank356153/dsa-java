import java.util.*;
public class Arraylist {
     public static void main(String args[]){
        ArrayList <Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(1);
        list.add(6);
        list.add(9);
        list.add(0);
        
        System.out.println(list);
        Collections.sort(list); // if u want in descendiing order then u need to pass comparator like (lst,list.reverseOrder())
        System.out.println(list);
        System.out.println(list.reversed());


        ArrayList <ArrayList<Integer> > list1 = new ArrayList<>(); 

     }
    
}
