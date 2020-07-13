package first;
//动态规划

public class ti_53 {
    public int maxSubArray2(int[] nums) {
    	int cnt = nums[0];
    	int sum =0;
 
    	for(int n:nums) {
    		if(sum<0) sum=n;
    		else
    			sum+=n; //连续一段之和
    		cnt = Math.max(sum, cnt);//连续几段对比 
    	}    	
    	return cnt;

    }
public int maxSubArray(int[] nums) {
    	int[] dp = new int[nums.length];
    	dp[0] = nums[0];
    	int max = nums[0];
    	for(int i=1;i<nums.length;i++) {
    		dp[i] =Math.max(dp[i-1]+nums[i], nums[i]);
    		max=Math.max(max, dp[i]);//记录dp表中最大值    		
    	}
    	return max;
    } 
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ti_53 a =new ti_53();
		int[] b = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.print(a.maxSubArray(b));

	}

}
