package first;

public class ti_560 {
    public int subarraySum(int[] nums, int k) {
    	int sum = 0 ;
    	for(int i =0 ;i<nums.length;i++) {
    		int num =0;
    		for(int j =i ;j<nums.length;j++) {
    			
    				num+=nums[j];
    			if(num == k) {
    				sum++;
    				continue;
    			}
    			else if(num>k) continue;
    		}
    	}
    	return sum;

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
