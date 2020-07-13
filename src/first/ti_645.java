package first;

import java.util.Arrays;

public class ti_645 {
	
	//排序后判断重复和缺失
    public int[] findErrorNums(int[] nums) {
    	Arrays.sort(nums);
    	int dup =-1,miss = 1;//初始
    	for(int i = 1;i<nums.length;i++) {
    		if(nums[i] == nums [i-1]) dup=nums[i];
    		if(nums[i]> nums[i-1]+1) miss = nums[i-1]+1;
    	}
    	
    	//要考虑最后位的缺失
    	return new int[] {dup,nums[nums.length-1]!=nums.length?nums.length:miss};
    	

    }
    //map计数 循环判断次数和缺失
    //异或运算

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
