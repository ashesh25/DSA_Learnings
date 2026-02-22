package sorting;

public class SelectionSort {

	public static void main(String[] args) {
		
		int arr[] = {5,9,1,4,6,2,7};
		int n = arr.length;
		
		for(int i = 0; i < n-1; i++ ) {
			int minIndex = i;
			for( int j = i; j < n; j++ ) {
				if ( arr[j] < arr[minIndex] ) {
					minIndex = j;
				}
			}
			
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
			
		}
		
		for( int i = 0; i < n; i++ ) {
			System.out.print(arr[i]+ " ");
		}
				
		
	}
}
