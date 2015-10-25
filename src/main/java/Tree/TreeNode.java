package Tree;

public class TreeNode {
	int data;
	TreeNode right;
	TreeNode left;
	TreeNode(int data){
		this.data=data;
		this.right=null;
		this.left=null;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public TreeNode getRight() {
		return right;
	}
	public void setRight(TreeNode right) {
		this.right = right;
	}
	public TreeNode getLeft() {
		return left;
	}
	public void setLeft(TreeNode left) {
		this.left = left;
	}
}
