package first;

public class ti_485 {
    public int findMaxConsecutiveOnes(int[] nums) {
    	int max=0,cur=0;
    	for(int n:nums)
    	{
    		if(n==1) cur++;
    		else 
    			{
    				max=Math.max(max, cur);
    				cur=0;
    			}
    	}
    	return Math.max(max, cur); //全是一的时候不能漏掉

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
