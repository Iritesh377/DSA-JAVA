/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tree;

/**
 *
 * @author RITX
 */
public class BinarySearchTree {
    TreeNode root;

    public boolean searchBST(int data) {
        TreeNode t=root;
        if (t!= null) {
            while(t!=null){
            if (data == t.data) {
                System.out.println(data + "is found");
                return true;
            } else if (data < t.data) {
                t=t.left;
            } else if (data > t.data) {
                t=t.right;
            }
            }
        } else {
            System.out.println("Tree is empty");
        }
        return false;
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.root = new TreeNode(16);
        tree.root.left = new TreeNode(12);
        tree.root.right = new TreeNode(18);
        tree.root.left.left = new TreeNode(10);
        tree.root.left.right = new TreeNode(13);
        System.out.println("Is 122 in the tree?" + tree.searchBST(120));
        System.out.println("Is 12 in the tree?" + tree.searchBST(10));
    }
}
