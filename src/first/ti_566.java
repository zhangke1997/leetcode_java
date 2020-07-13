package first;
import java.io.*;

public class ti_566 {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
    	if(nums.length*nums[0].length != r*c ) return nums;
    	int[][] nums2=new int[r][c];
    	int count =0 ;
    	for(int i = 0 ;i<r;i++)
    	{
    		for(int j = 0;j<c;j++)
    		{
    			nums2[i][j]=nums[count/nums[0].length][count%nums[0].length];
    			count++;
    		}
    	}
    	return nums2;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,c;
		//有问题
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		ti_566 a = new ti_566();
		while(true) {
			try {
			System.out.println("输入行列");
			r = br.read();
			c = br.read();
			int[][] nums = new int [r][c];
			for(int i=0;i<nums.length;i++)
			{
				
				for(int j=0;j<nums[0].length;j++)
				{
					System.out.println("输入"+i+"行"+j+"列");
					nums[i][j]=br.read();
				
				}
			}
			int rn,cn;
			System.out.println("输入新的行列");
			rn = br.read();
			cn = br.read();
			int[][] numsnew =new int[rn][cn];
			numsnew = a.matrixReshape(nums, rn, cn);
			for(int[] n :numsnew)
				for(int n2:n) {
					System.out.print(n2);
					
				}
		
			}catch(IOException e) {
				e.printStackTrace();
			}
		}	

	}

}
