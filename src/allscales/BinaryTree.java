/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allscales;

/**
 *
 * @author fkerisit
 */
public class BinaryTree {

    Node root;
    int N = 11;

    public Node construireArbre(int i, boolean flag) {

        Node tNoeud = new Node(i, flag);

        if (i < N) {
            tNoeud.right = construireArbre(i + 1, true);
            tNoeud.left = construireArbre(i + 1, false);
        }

        return tNoeud;

    }

    void printPaths(Node node) {
        int path[] = new int[1000];
        printPathsRecur(node, path, 0);
    }

    /* Recursive helper function -- given a node, and an array
       containing the path from the root node up to but not 
       including this node, print out all the root-leaf paths.*/
    void printPathsRecur(Node node, int path[], int pathLen) {
        if (node == null) {
            return;
        }

        /* append this node to the path array */
        if (node.flag) {
            path[pathLen] = node.data;
            pathLen++;
        }

        /* it's a leaf, so print the path that led to here  */
        if (node.right == null && node.left == null) {
            printArray(path, pathLen);
        } else {
            /* otherwise try both subtrees */
            printPathsRecur(node.right, path, pathLen);
            printPathsRecur(node.left, path, pathLen);
        }
    }

    /* Utility function that prints out an array on a line. */
    void printArray(int ints[], int len) {
        int i;
        for (i = 0; i < len; i++) {
            System.out.print(ints[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        // TODO code application logic here

        BinaryTree tree = new BinaryTree();
        Node root = tree.construireArbre(0, true);
        tree.printPaths(root);

    }
}


