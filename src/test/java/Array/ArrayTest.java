package Array;

import org.testng.annotations.Test;

public class ArrayTest {
	@Test(groups = { "A", "Z" })
	public void rotateTest(){
		int mat[][]=ArrayUtils.rotate(3, 5);
		System.out.println();
		ArrayUtils.displayMatrix(mat, 5, 3);
	}
	@Test(groups = { "A", "Z" })
	public void printParenthesisTest(){
		ArrayUtils.printParenthesis(3);
	}

}
