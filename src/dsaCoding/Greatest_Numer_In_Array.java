package dsaCoding;

public class Greatest_Numer_In_Array {

	public static void main(String[] args) {
		
		int array[] = {11,2,5,7,6,8,9};
		
		int max = 0;
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		System.out.println(max);
	}
}
