package Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import Stack.StackUtils;

public class TreeUtils {
	//All the Traversal orders in Recursive manner
	static String output = "";
	public static String inorder(TreeNode root){
		output = "";
		return inorderSup(root);
	}
	private static String inorderSup(TreeNode root){
		if(root==null)
			return output;
		inorderSup(root.getLeft());
		//For Debug
		System.out.print(root.getData()+"->");
		output = output + root.getData()+"->";
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
		//For Debug
		//System.out.print(root.getData()+"->");
		output = output + root.getData()+"->";
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
		//For Debug
		//System.out.print(root.getData()+"->");
		output = output + root.getData()+"->";
		return output;
	}
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
	public static void printLevel(TreeNode root,int level){
		if(root==null)
			return;
		if(level==1)
			System.out.print(root.getData()+"->");
		printLevel(root.getLeft(),level-1);
		printLevel(root.getRight(),level-1);
	}
	public static void levelorder(TreeNode root){
		int h = height(root);
		for(int i=1;i<=h;i++){
			printLevel(root,i);
			System.out.println();
		}
	}
	private static void printSpiralLevel(TreeNode root, int level, boolean front){
		if(root==null)
			return;
		if(front==true){
			if(level==1)
				System.out.print(root.getData()+"->");
			printSpiralLevel(root.getLeft(),level-1,front);
			printSpiralLevel(root.getRight(),level-1,front);
		}else{
			if(level==1)
				System.out.print(root.getData()+"->");		
			printSpiralLevel(root.getRight(),level-1,front);
			printSpiralLevel(root.getLeft(),level-1,front);
		}
	}
	public static void spiral_levelorder(TreeNode root){
		int h = height(root);
		boolean front = true;
		for(int i=1;i<=h;i++){
			printSpiralLevel(root,i,front);
			front = !front;
			System.out.println();
		}
	}
	//All the Traversal orders in Iterative manner
	public static String levelorderI(TreeNode root){
		output = "";
		if(root==null)
			return output;
		return levelorderISup(root);
	}
	private static String levelorderISup(TreeNode root){
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		while(!q.isEmpty()){	
			TreeNode temp = q.peek();
			//System.out.print(temp.getData()+"->");
			output = output + temp.getData()+"->";
			if(temp.getLeft()!=null)
				q.add(temp.getLeft());
			if(temp.getRight()!=null)
				q.add(temp.getRight());
			q.remove();
		}
		return output;
	}
	public static String postorderI(TreeNode root){
		if(root==null)
			return null;
		return postorderISup(root);
	}
	private static String postorderISup(TreeNode root){
		Stack<TreeNode> st1 = new Stack<TreeNode>();
		Stack<TreeNode> st2 = new Stack<TreeNode>();
		st1.push(root);
		while(!st1.isEmpty()){
			TreeNode temp = st1.peek();
			st2.push(st1.pop());
			if(temp.getLeft()!=null)
				st1.push(temp.getLeft());
			if(temp.getRight()!=null)
				st1.push(temp.getRight());
		}
		String output = StackUtils.printTreeNode(st2);
		st1.clear();
		st2.clear();
		return output;
	}
}
