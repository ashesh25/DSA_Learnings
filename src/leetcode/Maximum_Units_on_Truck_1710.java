package leetcode;

import java.util.Arrays;

public class Maximum_Units_on_Truck_1710 {

	public static void main(String[] args) {
		int a[][] = {{5,10},{2,5},{4,7},{3,9}};
		System.out.println(maximumUnits1(a,10));
	}
	
	public static int maximumUnits(int[][] boxTypes, int truckSize) {
        int count = 0;
        int unit = 0;
        boolean flag = false;
        int a[] = new int[boxTypes.length];
        int b[] =  new int[boxTypes.length];
        int c[] =  new int[boxTypes.length];
        for(int i =0;i<boxTypes.length;i++) {
        	a[i] = boxTypes[i][0];
        }
        
        for(int i =0;i<boxTypes.length;i++) {
        	b[i] = boxTypes[i][1];
        	c[i] = boxTypes[i][1];
        }
        
        Arrays.sort(b);
        for(int i = b.length-1;i>=0;i--) {
        	for(int j = 0;j<b.length;j++) {
        		if(c[j] == b[i] ) {
        			unit = unit + a[j];
        			if(unit<truckSize) {
        				count = count + a[j]*b[i];
        				break;
        			}
        			else {
        				unit = unit - a[j];
        				count = count+ (truckSize - unit)*b[i];
        				flag =true;
        				break;
        			}
        		}
        	}
        	if(flag == true) {
        		break;
        	}
        }
        
		return count;
    }
	
	 public static int maximumUnits1(int[][] boxTypes, int truckSize) {
		 int units = 0;
	        Arrays.sort(boxTypes,(a,b)->-Integer.compare(a[1],b[1]));
	        int max=0;
	        for(int[] box:boxTypes){
	            if(truckSize<box[0]){
	              return units+box[1]*truckSize;
	            }
	            units+=box[0]*box[1];
	            truckSize-=box[0];
	        }
	        return units;
	    }
}
