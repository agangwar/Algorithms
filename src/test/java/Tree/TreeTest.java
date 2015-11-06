package Tree;

import java.util.ArrayList;

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
		Assert.assertEquals("40->50->20->60->70->30->10->", TreeUtils.postorder(root));
		//Assert.assertEquals(TreeUtils.postorder(root),TreeUtils.iPostorder(root));
	}
	@Test(groups = { "A", "Z" })
	public void printLevelTest(){
		TreeUtils.printLevel(root, 0);
		TreeUtils.printLevel(root, 1);
	}
	@Test(groups = { "A", "Z" })
	public void levelOrderTest(){
		TreeUtils.levelOrder(root);
		Assert.assertEquals("10->20->30->40->50->60->70->", TreeUtils.iLevelorder(root));
	}
	@Test(groups = { "A", "Z" })
	public void spiralLevelOrderTest(){
		TreeUtils.spiralLevelOrder(root);
	}
	@Test(groups = { "A", "Z" })
	public void pathSumTreeTest(){
		TreeUtils.pathSumTree(root, null,0);
		TreeUtils.pathSumTree(null, null,0);
		TreeUtils.pathSumTree(null, root,0);
		TreeUtils.pathSumTree(root, root,0);
		TreeUtils.pathSumTree(root, root.getLeft(),0);
		TreeUtils.pathSumTree(root, root.getRight(),0);
	}
	@Test(groups = { "A", "Z" })
	public void printPathTest(){
		TreeNode[] path = new TreeNode[100];
		TreeUtils.printLeafPath(root, path, 0);
	}
}
