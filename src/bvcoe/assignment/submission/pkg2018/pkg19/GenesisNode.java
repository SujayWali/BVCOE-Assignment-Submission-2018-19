/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bvcoe.assignment.submission.pkg2018.pkg19;

/**
 *
 * @author mca
 */
import java.util.*;
public class GenesisNode<T> {
    private Node<T> rootNode;
    private HashMap<Node<T>, List<Node<T>>> tree;

    //and then some kind of function to go through the tree.
    public void expandNode(Node<T> node) {
        if (tree.get(node) == null) {
            System.out.println(node);
            return;
        }
        for(Node<T> n : tree.get(node)) {
            System.out.println(node);
            expandNode(n);
        }
    }
}
