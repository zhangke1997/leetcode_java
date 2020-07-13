package first;
//ͨ��695 ����޸ĵõ��ܳ�
public class ti_463 {
    public int islandPerimeter(int[][] grid) {
    	int res=0;
    	for(int i =0;i<grid.length;i++) {
    		for(int j =0;j<grid[0].length;j++) {
    			if(grid[i][j] == 1) {//�������е�½�ؿ�
    				res =Math.max(res,dfs(grid,i,j));
    			}
    			
    		}
    	}
    	return res;

    }
    int dfs(int[][] grid,int i,int j) {
    	
    	//½�ر߽�
    	if(i<0 || j<0 || i>grid.length-1 || j>grid[0].length-1) return 1;
    	if(grid[i][j] == 0) return 1; //½��ˮ�߽�
    	if(grid[i][j]!=1) return 0; //�ų�0 2 ���ʹ��ͺ���
    	
    	grid[i][j] = 2;
    	return dfs(grid,i-1,j)  //����0+�������ҵı߽�ֵ
    			+dfs(grid,i+1,j)
    			+dfs(grid,i,j-1)
    			+dfs(grid,i,j+1);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
