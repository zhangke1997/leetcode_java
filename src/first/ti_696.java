package first;
//����ɨ��
public class ti_696 {
	
    public int countBinarySubstrings(String s) {
    	int cur = 1, pre=0, count =0;
    	for(int i=1;i<s.length();i++) {
    		if(s.charAt(i)!=s.charAt(i-1)) {
    			count +=Math.min(cur, pre);
    			pre =cur;
    			cur =1;
    		}
    		else
    			cur++;
    	}
    	return count+Math.min(pre, cur);//���һ��ɨ��δ�Ƚ�

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
