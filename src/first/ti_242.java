package first;

public class ti_242 {
    public boolean isAnagram(String s, String t) {
    	if(s.length() != t.length()) return false;
    	int[] cnts = new int[26];
    	for(char s1:s.toCharArray()) {
    		cnts[s1-'a']++;
    	}
    	for(char t1:t.toCharArray()) {
    		cnts[t1-'a']--;
    		if(cnts[t1-'a']<0)
    			return false;
    	}
    	return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ti_242 a =new ti_242();
		String s = "aagram";
		String t = "nagaram";
		System.out.print(a.isAnagram(s, t));

	}

}
