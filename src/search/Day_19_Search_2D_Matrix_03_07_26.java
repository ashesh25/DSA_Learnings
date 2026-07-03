package search;

public class Day_19_Search_2D_Matrix_03_07_26 {

    public static void main(String[] args) {
        int matrix[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 20;
        System.out.println(searchMatrix(matrix,target));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        for(int i = 0; i < matrix.length; i++){
            if(target <= matrix[i][matrix[i].length-1]){
                int left = 0;
                int right = matrix[i].length-1;
                
                //int j = 0;
                while(left<=right){
                    int mid = left + (right-left)/2;
                    if(target==matrix[i][mid]){
                        return true;
                    }
                    
                    else if(target>matrix[i][mid]){
                        //System.out.println(matrix[i][mid]);
                        left = mid+1;
                    }
                    else{
                        right = mid-1;
                    }
                    //j++;
                }
            }
            
        }
        return false;
    }
}
