package leetcode;

public class Earliest_Time_to_Finish_One_Task_3683 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{1,1}, {1,2}};
		earliestTime(arr);
	}
	
	public static int earliestTime(int[][] tasks) {
        int result = 0;
        
        int min = 32000;
        for( int i = 0; i < tasks.length; i++ ) {
        	result = tasks[i][0] + tasks[i][1];
        	if( result < min ) {
        		min = result;
        	}
        }
        System.out.println(min);
        return min;
    }

}
