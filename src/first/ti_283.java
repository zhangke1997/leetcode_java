package first;
//1.����ָ�� �������

public class ti_283 {
    public void moveZeroes(int[] nums) {
    	int slow = 0 ;//��ָ��
    	for(int i=0;i<nums.length;i++) {//��ָ��
    		if(nums[i]!=0)
    			nums[slow++]=nums[i];
    	}
    	while(slow<nums.length)
    	{
    		nums[slow++] = 0;
    	}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] c= {0,1,0,3,12};
		ti_283 a =new ti_283();
		a.moveZeroes(c);
		for(int i : c) {
			System.out.println(i);
		}
		

	}

}
