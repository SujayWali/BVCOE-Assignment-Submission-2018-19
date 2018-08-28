/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bvcoe.assignment.submission.pkg2018.pkg19;

/**
 *
 * @author mca
 */
public class Solution9
{
    class BinaryTreeNode<T>{
        T data;
        BinaryTreeNode<T>left;
        BinaryTreeNode<T>right;
        public BinaryTreeNode(T data){
        this.data = data;
        }        
    }
}
public static boolean isNodePresent(BinaryTreeNode<Integer> root,int x){
if(root == null)
{
    return false;
}
boolean found = root.data.equals(x);
{
    if (found){
    return found;
}
    found = found || isNodePresent(root.left,x);
{
    if (found){
    return found;
}
    found = found || isNodePresent(root.right,x);
        
    return found;
}
}