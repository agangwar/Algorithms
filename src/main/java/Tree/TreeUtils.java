package Tree;

import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

import Stack.StackUtils;

public class TreeUtils{
	static String output = "";
	public static int height(TreeNode root){
		if(root==null)
			return 0;
		int l = height(root.getLeft())+1;
		int r = height(root.getRight())+1;
		if(l>r)
			return l;
		else
			return r;
	}
	public static String inorder(TreeNode root){
		output = "";
		return inorderSup(root);
	}
	private static String inorderSup(TreeNode root){
		if(root==null)
			return output;
		inorderSup(root.getLeft());
		output = output + root.getData()+"->";
		//For Debug
		//System.out.print(root.getData()+"->");
		inorderSup(root.getRight());
		return output;
	}
	public static String preorder(TreeNode root){
		output = "";
		return preorderSup(root);
	}
	private static String preorderSup(TreeNode root){
		if(root==null)
			return output;
		output = output + root.getData() + "->";
		preorderSup(root.getLeft());
		preorderSup(root.getRight());
		return output;
	}
	public static String postorder(TreeNode root){
		output = "";
		return postorderSup(root);
	}
	private static String postorderSup(TreeNode root){
		if(root==null)
			return output;
		postorderSup(root.getLeft());
		postorderSup(root.getRight());
		output = output + root.getData() + "->";
		return output;
	}
	public static void printLevel(TreeNode root, int level){
		if(root==null)
			return;
		if(level==0)
			return;
		if(level==1)
			System.out.print(root.getData()+"->");
		printLevel(root.getLeft(),level-1);
		printLevel(root.getRight(),level-1);
	}
	public static void levelOrder(TreeNode root){
		for(int i=1;i<=height(root);i++){
			printLevel(root,i);
			System.out.println();
		}
	}
	private static void spiralLevelOrderSup(TreeNode root, int level, boolean front){
		if(root==null)
			return;
		if(level==0)
			return;
		if(front==true){
			if(level==1)
				System.out.print(root.getData()+"->");
			spiralLevelOrderSup(root.getLeft(),level-1,front);
			spiralLevelOrderSup(root.getRight(),level-1,front);
		}else{
			if(level==1)
				System.out.print(root.getData()+"->");
			spiralLevelOrderSup(root.getRight(),level-1,front);
			spiralLevelOrderSup(root.getLeft(),level-1,front);			
		}
	}
	public static void spiralLevelOrder(TreeNode root){
		boolean front = true;
		for(int i=1;i<=height(root);i++){
			spiralLevelOrderSup(root,i,front);
			front = !front;
			System.out.println();
		}
	}
	public static String iLevelorder(TreeNode root){
		output = "";
		if(root==null)
			return output;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		while(!queue.isEmpty()){
			TreeNode temp = queue.peek();
			output = output + temp.getData() + "->";
			if(temp.getLeft()!=null)
				queue.add(temp.getLeft());
			if(temp.getRight()!=null)
				queue.add(temp.getRight());
			queue.remove();
		}
		return output;
	}
	public static TreeNode BST_LCA(TreeNode root, int n1, int n2){
		if(root==null)
			return null;
		if(root.getData()>n1 && root.getData()>n2)
			return BST_LCA(root.getLeft(),n1,n2);
		if(root.getData()<n1 && root.getData()<n2)
			return BST_LCA(root.getRight(),n1,n2);
		return root;
	}
	public static void printLeafPath(TreeNode root, TreeNode[] path, int i){
		if(root==null)
			return;
		if(root.getLeft()==null && root.getRight()==null){
			path[i]=root;
			printArray(path,i);
			return;
		}
		path[i]=root;
		printLeafPath(root.getLeft(),path,i+1);
		printLeafPath(root.getRight(),path,i+1);
	}
	private static void printArray(TreeNode[] path,int len){
		System.out.print("Leaf Path: ");
		for(int i=0;i<=len;i++)
			System.out.print(path[i].getData()+"->");
		System.out.println();	
	}
	public static void pathSumTree(TreeNode root, TreeNode target, int sum){
		if(root==null || target==null)
			return;
		if(root==target){
			sum = sum + root.getData();
			System.out.println("Sum->"+sum);
			return;
		}
		sum = sum + root.getData();
		pathSumTree(root.getLeft(),target, sum);
		pathSumTree(root.getRight(),target, sum);
		return;
	}
	public static boolean isFullTree(TreeNode root){
		if(root==null)
			return true;
		if(root.getLeft()==null && root.getRight()==null)
			return true;
		if(root.getLeft()!=null && root.getRight()!=null)
			return (isFullTree(root.getLeft()) && isFullTree(root.getRight()));
		return false;
	}
	
}