package first;
//贪心
public class ti_45 {
    public int jump(int[] nums) {
    	int end =0;
    	int max =0;
    	int step =0;
    	for(int i=0;i<nums.length-1;i++) {
    		max=Math.max(max, nums[i]+i);//得到最远的索引值
    		
    		if(i == end) {
    			end =max;
    			step++;
    		}
    	}

    	return step;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
