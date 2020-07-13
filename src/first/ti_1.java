package first;
import java.util.*;
//暴力 n^2 时间复杂度
//yici hashmap  n时间复杂度
public class ti_1 {
    public int[] twoSum(int[] nums, int target) {
    	if(nums.length<1)  throw new IllegalArgumentException("no solution");
    	HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
    	for(int i = 0 ;i<nums.length;i++) {
    		if(map.containsKey(target - nums[i]))
    			return new int[]{map.get(target- nums[i]),i};
    		else
    			map.put(nums[i], i);
    		
    	}
    	throw new IllegalArgumentException("no solution");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ti_1 a =new ti_1();
		 
		int[] b = {2,7,11,15};
		int[] res =a.twoSum(b, 13);
		for(int i:res)
			System.out.println(i);
	}

}
