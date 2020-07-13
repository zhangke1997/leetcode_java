package first;
//通过695 面积修改得到周长
public class ti_463 {
    public int islandPerimeter(int[][] grid) {
    	int res=0;
    	for(int i =0;i<grid.length;i++) {
    		for(int j =0;j<grid[0].length;j++) {
    			if(grid[i][j] == 1) {//遍历所有的陆地块
    				res =Math.max(res,dfs(grid,i,j));
    			}
    			
    		}
    	}
    	return res;

    }
    int dfs(int[][] grid,int i,int j) {
    	
    	//陆地边界
    	if(i<0 || j<0 || i>grid.length-1 || j>grid[0].length-1) return 1;
    	if(grid[i][j] == 0) return 1; //陆地水边界
    	if(grid[i][j]!=1) return 0; //排除0 2 访问过和海洋
    	
    	grid[i][j] = 2;
    	return dfs(grid,i-1,j)  //返回0+上下左右的边界值
    			+dfs(grid,i+1,j)
    			+dfs(grid,i,j-1)
    			+dfs(grid,i,j+1);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
