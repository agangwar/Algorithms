package Tree;

import org.testng.annotations.Test;
import org.testng.Assert;

public class TreeTest {
	TreeNode root = null;
	@Test(groups = { "A", "Z" })
	public void createTree(){	
		Assert.assertEquals(TreeUtils.height(root),0);
		root = new TreeNode(10);
		Assert.assertEquals(TreeUtils.height(root),1);
		root.setLeft(new TreeNode(20));
		Assert.assertEquals(TreeUtils.height(root),2);
		root.setRight(new TreeNode(30));
		Assert.assertEquals(TreeUtils.height(root),2);
		root.getLeft().setLeft(new TreeNode(40));
		Assert.assertEquals(TreeUtils.height(root),3);
		root.getLeft().setRight(new TreeNode(50));
		Assert.assertEquals(TreeUtils.height(root),3);
		root.getRight().setLeft(new TreeNode(60));
		Assert.assertEquals(TreeUtils.height(root),3);
		root.getRight().setRight(new TreeNode(70));		
		Assert.assertEquals(TreeUtils.height(root),3);
	}
	@Test(groups = { "A", "Z" })
	public void inorderTest(){
		Assert.assertEquals("40->20->50->10->60->30->70->", TreeUtils.inorder(root));
	}
	@Test(groups = { "A", "Z" })
	public void preorderTest(){
		Assert.assertEquals("10->20->40->50->30->60->70->", TreeUtils.preorder(root));
	}
	@Test(groups = { "A", "Z" })
	public void postorderTest(){
		Assert.assertEquals(TreeUtils.postorderI(root), TreeUtils.postorder(root));
	}
	@Test(groups = { "A", "Z" })
	public void levelorderTest(){
		System.out.println("Strating Level Order Test");
		TreeUtils.levelorder(root);
		System.out.println("Expected output:\n10->\n20->30->\n40->50->60->70->");
	}
	@Test(groups = { "A", "Z" })
	public void spiral_levelorderTest(){
		System.out.println("Strating Spiral Level Order Test");
		TreeUtils.spiral_levelorder(root);
		System.out.println("Expected output:\n10->\n30->20->\n40->50->60->70->");
	}
	@Test(groups = { "A", "Z" })
	public void levelorderITest(){
		//System.out.println("Strating Level Order Iterative Test");
		//System.out.println(TreeUtils.levelorderI(root));
		Assert.assertEquals("10->20->30->40->50->60->70->", TreeUtils.levelorderI(root));
	}
}
