package sorting;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,8,6,1,4};
		boolean swap;
		int n = arr.length;
		
		for( int i = 0; i < n-1; i++ ) {
			swap = false;
			for( int j = 0; j < n - i -1; j++) {
				
				int temp = 0;
				if( arr[j] > arr[j+1] ) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swap = true;
				}
				
			}
			if(!swap) break;
		}
		
		for( int i = 0; i < n; i++) {
			System.out.print(arr[i]+ " ");
		}
		
	}

}
