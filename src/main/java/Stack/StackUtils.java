package Stack;

import java.util.Stack;

import Tree.TreeNode;

public class StackUtils {
	public static String printTreeNode(Stack<TreeNode> st){
		String output = "";
		if(st.isEmpty()==true)
			return output;	
		while(!st.isEmpty()){
			TreeNode temp = st.pop();
			//System.out.print(temp.getData()+"->");
			output = output + temp.getData()+"->";
		}
		return output;
	}
}
