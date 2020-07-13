package first;
//二分hard

public class ti_4 {
	public double findMedianSortedArrays(int[] A, int[] B) {
	    int m = A.length;
	    int n = B.length;
	    int len = m + n;
	    int left = -1, right = -1;
	    int aStart = 0, bStart = 0;
	    for (int i = 0; i <= len / 2; i++) {
	        left = right;
	        if (aStart < m && (bStart >= n || A[aStart] < B[bStart])) {
	            right = A[aStart++];
	        } else {
	            right = B[bStart++];
	        }
	    }
	    if ((len & 1) == 0)
	        return (left + right) / 2.0;
	    else
	        return right;
	}


	//作者：windliang
	//链接：https://leetcode-cn.com/problems/median-of-two-sorted-arrays/solution/xiang-xi-tong-su-de-si-lu-fen-xi-duo-jie-fa-by-w-2/


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
