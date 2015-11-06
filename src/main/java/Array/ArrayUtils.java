package Array;

public class ArrayUtils {
	public static void displayMatrix(int mat[][],int row, int col){
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.print(mat[i][j]);
				System.out.print(" ");
			}
			System.out.println("");
		}
	}
	public static void initMatrix(int mat[][],int row, int col){
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				mat[i][j]=i*j+i+j;
		   }
		}
	}
	public static int[][] rotate(int row, int col){
		int mat[][];           
		mat = new int[row][col]; 
		initMatrix(mat,row,col);
		displayMatrix(mat,row,col);
		int dup[][] = new int[col][row];
		initMatrix(dup,col,row);
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				dup[j][row-i-1]=mat[i][j];
		   }
		}
		return dup;
	}
}
