package first;
//ÖØ¸´ÔªËØÅĞ¶Ï 
import java.util.HashMap;

public class ti_217 {
    public boolean containsDuplicate(int[] nums) {
    	HashMap<Integer , Integer> map = new HashMap<>();
    	for(int i = 0 ;i<nums.length;i++) {
    		if(map.containsKey(nums[i])) {
    			return true;
    		}
    		else map.put(nums[i], i);
    	}
    	return false;

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ti_217 a = new ti_217();
		int[] b = {1,2,3};
		System.out.print(a.containsDuplicate(b));

	}

}
