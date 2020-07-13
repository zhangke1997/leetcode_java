package first;

/*二分搜索
 * 

    public int search(int[] nums, int target) {
    	int head = 0,back = nums.length-1;
    	while(head<back)
    	{
    		int mid =head + (back-head)/2; //防止int越界 左边界0 2 1   0 3 1
    		if(nums[mid]==target)
    			return mid;
    		if(nums[mid]<target)
    		{
    			head = mid+1;
    		}
    		else back = mid-1;
    	}
    	return -1;
    }
    
    */
	public class ti_33 {
    public int search(int[] nums, int target) {
    	int head = 0,back = nums.length-1;
    	while(head<=back)
    	{
    		int mid =head + (back-head)/2; //防止int越界 左边界0 2 1   0 3 1
    		//四种情况
    		if(nums[mid]==target)
    			return mid;
    		if(nums[mid]>nums[head] && target>=nums[head] && target<=nums[mid] )
    		{
    			back = mid-1;
    		}
    		else 
    			if(nums[mid]<nums[back] && target>=nums[mid] && target<=nums[back])
    				head = mid+1;
    				
    			else if(nums[mid]>nums[back])
    				head = mid+1;
    				else
    					back =mid-1;
    	}
    	return -1;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ti_33 a =new ti_33();
		int[] test = {4,5,6,7,0,1,2};
		System.out.println(a.search(test,0));

	}

}
