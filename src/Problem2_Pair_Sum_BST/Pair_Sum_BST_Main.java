package Problem2_Pair_Sum_BST;

import java.util.Scanner;

public class Pair_Sum_BST_Main {
	public static void main(String[] args) {
        Pair_Sum_BST bst = new Pair_Sum_BST();
        bst.insert(10);
        bst.insert(30);
        bst.insert(50);
        bst.insert(70);
        bst.insert(20);
        bst.insert(60);
        bst.insert(40);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the sum: ");
        int sum = scanner.nextInt();

        bst.findAllPairsWithSum(sum);
        scanner.close();
    }
}

