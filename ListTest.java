package cop2805;

import java.util.*;

/*
 * Author: Brian Banfield
 * Date: 1/23/2022
 * Program demonstrates the use of Collections methods reverse, fill, copy.
 */

public class ListTest {
    public static void main(String[] args) {
    	
        //Initial List
    	String[] things = { "N", "H", "L"};
    	List<String> List1 = new ArrayList<String>();
    	
    	for(String x: things)
    		List1.add(x);
    	
    	System.out.printf("\n     Initial List", List1);
    	Output(List1);
    	
    	//Reverse 
        Collections.reverse(List1);
        System.out.print("\n     Reversed List");
        Output(List1);
     
        //Create copy
        List<String> copy = new ArrayList<>(List1);
       
        //Copied
        Collections.copy(copy, List1);
        System.out.print("\n     Copied List");
        Output(List1);
       
        //Fill the list with R
        Collections.fill(List1, "R");
        System.out.print("\n     R Filled List");
        Output(List1);
       
    }

    public static void Output(List<String> List1){
        System.out.print("\n       ");
        for(int i=0; i<List1.size(); i++){
            System.out.print(" " + List1.get(i));
        }
        System.out.println();
    }

}
