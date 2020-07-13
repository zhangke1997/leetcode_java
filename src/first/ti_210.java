package first;

import java.awt.List;
import java.util.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

//���� bfs
//https://leetcode-cn.com/problems/course-schedule-ii/solution/bao-mu-shi-ti-jie-tuo-bu-pai-xu-si-lu-zen-yao-yi-2/

public class ti_210 {
	class Solution {
	    public int[] findOrder(int numCourses, int[][] prerequisites){
	        int[] inDegree = new int[numCourses];
	        HashMap<Integer, List<Integer>> map = new HashMap<>();
	        Queue<Integer> queue = new LinkedList<>();
	        //������ȱ�͹�ϣ��
	        for (int i = 0; i < prerequisites.length; i++) {
	            inDegree[prerequisites[i][0]]++;//д���
	            if(map.containsKey(prerequisites[i][1])){
	                map.get(prerequisites[i][1]).add(prerequisites[i][0]);
	            } else {
	                List<Integer> list = new ArrayList<>();
	                list.add(prerequisites[i][0]);
	                map.put(prerequisites[i][1], list);
	            }
	        }
	        //��������index���
	        List<Integer> res = new ArrayList<>();
	        for (int i = 0; i < numCourses; i++) {
	            if(inDegree[i] == 0){
	                queue.offer(i);
	            }
	        }
	        // ���ӣ����ϣ�������Ϊ������
	        while (!queue.isEmpty()){
	            Integer cur = queue.poll();
	            res.add(cur);
	            if(map.containsKey(cur) && map.get(cur).size() != 0){
	                for (Integer num : map.get(cur)) {
	                    inDegree[num]--;
	                    if(inDegree[num] == 0) queue.offer(num);
	                }
	            }
	        }
	        //ʹ��list������תΪint[]���飬Ҳ����ͨ������һ�����ת����
	        return res.size() == numCourses ? res.stream().mapToInt(Integer::valueOf).toArray() : new int[0];
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
