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
public class Node {

    public static final int N = 12;

    public Node right = null; 
    public Node left = null;
    public int data; 
    public boolean flag;

    public Node(int valeur, boolean flag) {
        this.data = valeur;
        this.flag = flag;
    }
}
