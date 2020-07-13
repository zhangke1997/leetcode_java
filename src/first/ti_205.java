package first;
import java.util.HashMap;
//map映射
//ascii数组对应位置计数

public class ti_205 {
    public boolean isIsomorphic(String s, String t) {
    	if(s.length()!=t.length()) return false;
    	HashMap<Character,Character> maps =new HashMap<>();
    	HashMap<Character,Character> mapt =new HashMap<>();
    	for(int i=0;i<s.length();i++) {
    		//s到t映射判断
    		if(maps.containsKey(s.charAt(i)) && maps.get(s.charAt(i))!=t.charAt(i))
    			return false;
    		//t到s映射判断
    		if(mapt.containsKey(t.charAt(i)) && mapt.get(t.charAt(i))!=s.charAt(i))
    			return false;
    		else 
    			{
    				maps.put(s.charAt(i), t.charAt(i));   
    				 mapt.put(t.charAt(i),s.charAt(i));
    			}
    		
    	}
    	return true;
        
    }
    //数组对应元素的ascii位置计数
    public boolean isIsomorphic2(String s, String t) {
        int[] preIndexOfS = new int[256];
        int[] preIndexOfT = new int[256];
        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i), tc = t.charAt(i);
            if (preIndexOfS[sc] != preIndexOfT[tc]) {
            	//不存在为零 。 存在则判断位置是否一样
                return false;
            }
            //更新不同字母最近的位置
            preIndexOfS[sc] = i + 1;
            preIndexOfT[tc] = i + 1;
        }
        return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ti_205 a =new ti_205();
		String s ="add";
		String t ="caa";
		System.out.print(a.isIsomorphic(s, t));
		
	}

}
