package first;

import java.util.Arrays;

public class ti_645 {
	
	//������ж��ظ���ȱʧ
    public int[] findErrorNums(int[] nums) {
    	Arrays.sort(nums);
    	int dup =-1,miss = 1;//��ʼ
    	for(int i = 1;i<nums.length;i++) {
    		if(nums[i] == nums [i-1]) dup=nums[i];
    		if(nums[i]> nums[i-1]+1) miss = nums[i-1]+1;
    	}
    	
    	//Ҫ�������λ��ȱʧ
    	return new int[] {dup,nums[nums.length-1]!=nums.length?nums.length:miss};
    	

    }
    //map���� ѭ���жϴ�����ȱʧ
    //�������

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
