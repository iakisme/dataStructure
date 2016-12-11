package dataStructure;

public class BinaryTreeTest {
	class TreeNode{
		int val;
		TreeNode left,right;
		TreeNode(int val){
			this.val = val;
			this.left = null;
			this.right = null;
		}
	}
	public void preorder(TreeNode root){
		if(root!=null){
			System.out.println(root.val);
			preorder(root.left);
			preorder(root.right);
		}
	}
	
	public void inorder(TreeNode root){
		if(root!=null){
			inorder(root.left);
			System.out.println(root.val);
			inorder(root.right);
		}
	}

	
	public void postorder(TreeNode root){
		if(root!=null){
			postorder(root.left);
			postorder(root.right);
			System.out.println(root.val);
		}
	}

}
