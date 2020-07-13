package first;

public class ti_29 {

    public int[] spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new int[0];
        }

    	int left =0,right=matrix[0].length-1,up = 0,down = matrix.length-1;
    	int[] matrix2 = new int[right+1*down+1];
    	int index =0 ;
    	
    	while(left<=right && up<=down) {
    		
    		
    		//左到右  一行也可以
		    	for(int i=left;i<=right;i++) {
		    		matrix2[index++]=matrix[up][i];
		    	}
    		//上到下  一列也可以
		    	for(int j =up+1;j<=down;j++) {
		    		matrix2[index++]=matrix[j][right];
		    	}
    		if(left<right && up<down) {
    			//一行或一列不能操作
		    	for(int i=right-1;i>left;i--) {
		    		matrix2[index++] = matrix[down][i];
		    	}
    		
		    	for(int j=down;j>up;j--) {
		    		matrix2[index++] =matrix[j][left];
		    	}
    		}
    		
		    	left++;
		    	right--;
		    	up++;
		    	down--;
    	}
    	return matrix2;
    }
    
    //官方对比 不知道哪里错的
    public int[] spiralOrder2(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new int[0];
        }
        int rows = matrix.length, columns = matrix[0].length;
        int[] order = new int[rows * columns];
        int index = 0;
        int left = 0, right = columns - 1, top = 0, bottom = rows - 1;
        while (left <= right && top <= bottom) {
            for (int column = left; column <= right; column++) {
                order[index++] = matrix[top][column];
            }
            for (int row = top + 1; row <= bottom; row++) {
                order[index++] = matrix[row][right];
            }
            if (left < right && top < bottom) {
                for (int column = right - 1; column > left; column--) {
                    order[index++] = matrix[bottom][column];
                }
                for (int row = bottom; row > top; row--) {
                    order[index++] = matrix[row][left];
                }
            }
            left++;
            right--;
            top++;
            bottom--;
        }
        return order;
    }



}
