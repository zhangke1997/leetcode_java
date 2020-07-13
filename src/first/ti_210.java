package first;

import java.awt.List;
import java.util.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

//拓扑 bfs
//https://leetcode-cn.com/problems/course-schedule-ii/solution/bao-mu-shi-ti-jie-tuo-bu-pai-xu-si-lu-zen-yao-yi-2/

public class ti_210 {
	class Solution {
	    public int[] findOrder(int numCourses, int[][] prerequisites){
	        int[] inDegree = new int[numCourses];
	        HashMap<Integer, List<Integer>> map = new HashMap<>();
	        Queue<Integer> queue = new LinkedList<>();
	        //创建入度表和哈希表
	        for (int i = 0; i < prerequisites.length; i++) {
	            inDegree[prerequisites[i][0]]++;//写入度
	            if(map.containsKey(prerequisites[i][1])){
	                map.get(prerequisites[i][1]).add(prerequisites[i][0]);
	            } else {
	                List<Integer> list = new ArrayList<>();
	                list.add(prerequisites[i][0]);
	                map.put(prerequisites[i][1], list);
	            }
	        }
	        //遍历，将index入队
	        List<Integer> res = new ArrayList<>();
	        for (int i = 0; i < numCourses; i++) {
	            if(inDegree[i] == 0){
	                queue.offer(i);
	            }
	        }
	        // 出队，查哈希表，将入度为零的入队
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
	        //使用list的流来转为int[]数组，也可以通过遍历一遍完成转换。
	        return res.size() == numCourses ? res.stream().mapToInt(Integer::valueOf).toArray() : new int[0];
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
