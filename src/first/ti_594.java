package first;
import java.util.HashMap;
//����ɨ��һ��
//����Ҳ���� һ��洢 һ���ж�   ��-ֵ = Ԫ�� -����
public class ti_594 {
    public int findLHS(int[] nums) {
    	HashMap<Integer,Integer> map =new HashMap<>();
    	int res=0;
    	for(int n :nums) {
    		map.put(n,map.getOrDefault(n,0)+1);//�����򷵻�map�е�ֵ+1 �������򷵻�0+1
    		if(map.containsKey(n+1))
    			res =Math.max(res,map.get(n)+map.get(n+1));
    		if(map.containsKey(n-1))
    			res = Math.max(res,map.get(n)+map.get(n-1));
       	}
    	return res;
    	
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ti_594 a =new ti_594();
		int[] b = {1,3,2,2,5,2,3,7};
		System.out.print(a.findLHS(b));
	}

}
