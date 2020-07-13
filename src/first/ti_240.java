package first;
//从右上二分
public class ti_240 {
    public boolean searchMatrix(int[][] matrix, int target) {
    	if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
    	int m=matrix.length,n=matrix[0].length;
    	int i=0,j=n-1;
    	while(i<m && j>=0) {
    		if(matrix[i][j] == target) return true;
    		else if(matrix[i][j]>target) j--;
    		else i++;
    	}
        return false;
    	
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
