package first;

public class ti_409 {
    public int longestPalindrome(String s) {
    	int num =0;
    	int[] charnum = new int[58];
    	for(char a : s.toCharArray()) {
    		charnum[a-'A']++; //ascii A����ǰ��
    	}
    	//ͳ��ż���ĸ���
    	for(int n:charnum) {
    		num+=n-(n&1);//�������� ż���ۼ�
    	}
    	
    	return num<s.length()?num+1:num;
    	//С�����������������������һ�� �������ż��

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
