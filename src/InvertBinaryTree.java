import com.sun.source.tree.Tree;

public class InvertBinaryTree {
    /*
    Given the root of a binary tree, invert the tree, and return its root.
     */
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}
