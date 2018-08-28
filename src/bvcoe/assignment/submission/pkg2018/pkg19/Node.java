/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bvcoe.assignment.submission.pkg2018.pkg19;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mca
 */

public class Node<T> 
{
    private Node<T> root; // a T type variable to store the root of the list
    private Node<T> parent; // a T type variable to store the parent of the list
    private T child;
    private List<Node<T>> children = new ArrayList<Node<T>>(); // a T type list to store the children of the list

    // default constructor
    public Node(T child)
    {
        setParent(null);
        setRoot(null);
        setItem(child);
    }  

    public void addChild(Node<T> child)
    {
        child.root = null;
        child.setParent((Node<T>)this);
        this.children.add(child); // add this child to the list
    }

    public void removeChild(Node<T> child)
    {
        this.children.remove(child); // remove this child from the list
    }

    public Node<T> getRoot() {
        return root;
    }

    public boolean isRoot()
    {
        // check to see if the root is null if yes then return true else return false
        return this.root != null;     
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }

    public Node<T> getParent() {
        return parent;
    }

    public void setParent(Node<T> parent) {
        this.parent = parent;
    }

    public T getItem() {
        return child;
    }

    public void setItem(T child) {
        this.child = child;
    }

    public boolean hasChildren()
    {
        return this.children.size()>0;
    }
}