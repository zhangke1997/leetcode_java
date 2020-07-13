package first;
//找出依赖关系， 动态规划
public class ti_221 {
    public int maximalSquare(char[][] matrix) {
    	if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return 0;
    	int maximal  =  0;
    	int m =matrix.length,n=matrix[0].length;
    	int[][] dp = new int[m][n];
    	for(int i=0;i<m;i++) {
    		for(int j =0 ;j<n;j++)
    		{
    			if(matrix[i][j]=='1') {//字符数组输入
	    			if(i==0 || j==0) dp[i][j] = matrix[i][j];
	    			else 
	    				dp[i][j]=Math.min(Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1])+1;
    			}
	    		maximal=Math.max(maximal, dp[i][j]);
    		}
    	}
    	
    	
    	
    	return maximal*maximal;
    	

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
