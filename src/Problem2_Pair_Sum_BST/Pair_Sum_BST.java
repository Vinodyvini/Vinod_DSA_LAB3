package Problem2_Pair_Sum_BST;

import java.util.HashSet;
import java.util.Set;

public class Pair_Sum_BST {
	 private Node root;

	    private class Node {
	        int data;
	        Node left, right;

	        public Node(int data) {
	            this.data = data;
	            left = right = null;
	        }
	    }

	    public void insert(int data) {
	        root = insertRecursive(root, data);
	    }

	    private Node insertRecursive(Node root, int data) {
	        if (root == null) {
	            root = new Node(data);
	            return root;
	        }

	        if (data < root.data)
	            root.left = insertRecursive(root.left, data);
	        else if (data > root.data)
	            root.right = insertRecursive(root.right, data);

	        return root;
	    }

	    // Method to find all pairs with the given sum
	    public void findAllPairsWithSum(int sum) {
	        Set<Integer> set = new HashSet<>();
	        boolean found = findAllPairsWithSum(root, set, sum);
	        if (!found) {
	            System.out.println("nodes are not found.");
	        }
	    }

	    // Helper method to find pairs and print them
	    private boolean findAllPairsWithSum(Node root, Set<Integer> set, int sum) {
	        if (root == null) {
	            return false;
	        }

	        // Check in the left subtree
	        boolean found = findAllPairsWithSum(root.left, set, sum);

	        // Check for pair in the current node
	        int complement = sum - root.data;
	        if (set.contains(complement)) {
	            System.out.println("Pair is (" + complement + ", " + root.data + ")");
	            found = true; // Continue searching even after finding a pair
	        }
	        set.add(root.data);

	        // Check in the right subtree
	        found = findAllPairsWithSum(root.right, set, sum) || found;

	        return found;
	    }
}
