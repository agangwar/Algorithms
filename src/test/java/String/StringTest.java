package String;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StringTest {
	@Test(groups = { "A", "Z" })
	public void TransformInMinimumOperationTest_1(){
		TransformInMinimumOperation obj = new TransformInMinimumOperation();
		Assert.assertEquals(obj.transform("EACBD", "EABCD"), 3);
	}
	@Test(groups = { "A", "Z" })
	public void TransformInMinimumOperationTest_2(){
		TransformInMinimumOperation obj = new TransformInMinimumOperation();
		Assert.assertEquals(obj.transform("ABD", "BAD"), 1);
	}
	@Test(groups = { "A", "Z" })
	public void TransformInMinimumOperationTest_3(){
		TransformInMinimumOperation obj = new TransformInMinimumOperation();
		Assert.assertEquals(obj.transform(null, "EABCD"), -1);
	}
	@Test(groups = { "A", "Z" })
	public void TransformInMinimumOperationTest_4(){
		TransformInMinimumOperation obj = new TransformInMinimumOperation();
		Assert.assertEquals(obj.transform(null, null), -1);
	}
	@Test(groups = { "A", "Z" })
	public void TransformInMinimumOperationTest_5(){
		TransformInMinimumOperation obj = new TransformInMinimumOperation();
		Assert.assertEquals(obj.transform("abcd", null), -1);
	}
	@Test(groups = { "A", "Z" })
	public void TransformInMinimumOperationTest_6(){
		TransformInMinimumOperation obj = new TransformInMinimumOperation();
		//HashMap<Character,Integer> hp = obj.createMap("testing");
	}
	@Test(groups = {"A", "Z"})
	public void testHashmap(){
		HashMap<Character,Integer> hp = StringUtils.createMap("testing");
	}
}
