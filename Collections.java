package cop2805;

import java.util.*;

public class Collections {

	public static void main(String[] args) {
		List l = new ArrayList();
		List l2 = new ArrayList();
		l.add("Hello");
		l.add("World");
		
		List<String> copy = new ArrayList<>(l);
		 
		Collections.copy(copy, l2, l);
		 System.out.print("\n     Copied List");
	     Output(l,l2);
/*		//ArrayList List1 = new ArrayList();
		//List1.add("N H L");
		
	//	for(Object str : List1) 
	//	{
			System.out.println("Initial List");
			System.out.print(List l, List  l2);
		
		
		 //Reverse 
  //      Collections.reverse(ArrayList);
   //     System.out.print("\n     Reversed List");
  //      Output(List1);
	
		 
*/	
//	 public static void Output(List<String> (l, l2){
	//        System.out.print("\n       ");
//	        for(int i=0; i<List1.size(); i++){
//	            System.out.print(" " + List1.get(i));
//	        }
//	        System.out.println();

}

	private static void Output(List l, List l2) {
		// TODO Auto-generated method stub
		System.out.println("jj");
	}

	private static void copy(List<String> copy, List l2, List l) {
		// TODO Auto-generated method stub
		
	}
}
