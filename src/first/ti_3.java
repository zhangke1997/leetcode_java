package first;
import java.util.HashMap;

// »¬¶¯´°¿Ú

public class ti_3 {
    public int lengthOfLongestSubstring(String s) {
    	if(s.length() == 0) return 0;
    	HashMap<Character,Integer> map = new HashMap<Character,Integer>();
    	int pre =0;
    	int size =0;
    	for(int now =0 ;now<s.length();now++) {
    		if(!map.isEmpty() && map.containsKey(s.charAt(now))){
    			pre = Math.max(pre, map.get(s.charAt(now))+1);
    			
    		}
    		
    		map.put(s.charAt(now),now);
    		size=Math.max(size, now-pre+1);
    		
    	}
    	return size;

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ti_3 a = new ti_3();
		String b = new String();
		b=  "bbbbbbbb";
		System.out.println(a.lengthOfLongestSubstring(b));
	}

}
