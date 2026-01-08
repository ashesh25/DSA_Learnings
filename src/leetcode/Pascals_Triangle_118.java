package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Pascals_Triangle_118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(generate(1));
	}
	
	 public static List<List<Integer>> generate(int numRows) {
		 List<Integer> list1 = new ArrayList<Integer>();
		 List<Integer> list2 = new ArrayList<Integer>();
		 
		 List<List<Integer>> finalList = new ArrayList<List<Integer>>();
		 list1.add(1);
		 list2.add(1);
		 list2.add(1);
		 finalList.add(list1);
		 if( numRows == 1 ) {
			 return finalList;
		 }
		 finalList.add(list2);
		 if( numRows == 2 ) {
			 return finalList;
		 }
		 if( numRows > 2 ) {
			 
			 for(int i = 2; i < numRows ; i++) {
				 int range = 0;
				 List<Integer> list3 = new ArrayList<Integer>();
				 list3.add(0, 1);
				 range = finalList.get(finalList.size()-1).size() - 1;
				 for(int j = 0; j < range ; j++) {
					 list3.add(finalList.get(finalList.size()-1).get(j) + finalList.get(finalList.size()-1).get(j+1));
				 }
				 list3.add(range+1, 1);
				 finalList.add(list3);
			 }
		 }
		 
		 return finalList;
	     
	 }

}
