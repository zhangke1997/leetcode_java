package first;

public class ti_409 {
    public int longestPalindrome(String s) {
    	int num =0;
    	int[] charnum = new int[58];
    	for(char a : s.toCharArray()) {
    		charnum[a-'A']++; //ascii A排在前面
    	}
    	//统计偶数的个数
    	for(int n:charnum) {
    		num+=n-(n&1);//奇数消掉 偶数累加
    	}
    	
    	return num<s.length()?num+1:num;
    	//小于则有消掉的奇数项可增加一项 相等则都是偶数

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
