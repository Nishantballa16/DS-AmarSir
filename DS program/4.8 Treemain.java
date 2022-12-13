/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
class Node 
{ 
    int key; 
    Node left, right; 
  
    public Node(int item) 
    { 
        key = item; 
        left = right = null; 
    } 
}
public class Treemain {
    private Node root;
    static int c;
    Treemain(){
        root=null;
    }
    public void insert(Node r,Node n)
    {
        if (root==null)
        { root=n; }
        else
        {
            if(n.key<r.key)
            {
                if(r.left==null)
                    r.left=n;
                else
                    insert(r.left,n);
            }
            else
            {
               if(r.right==null)
                    r.right=n;
                else
                    insert(r.right,n);
        }
    }
    }
    public void inorder(Node r)
    {
        if(r!=null)
        {
            inorder(r.left);
            System.out.println(r.key);
            inorder(r.right);
        }
    }
    
    public void  counter(Node r)
    {
        if(r!=null)
        {
            counter(r.left);
         //  if(r.left==null && r.right==null)
            Treemain.c++;
            counter(r.right);
            
        }
        
    }
    
    public static void main(String args[])
    {
        Treemain t=new Treemain();
        Node n1=new Node(100);
        Node n2=new Node(5);
        Node n3=new Node(105);
        Node n4=new Node(200);
        Node n5=new Node(112);
        
        t.insert(t.root,n1);
        t.insert(t.root,n2);
        t.insert(t.root,n3);
        t.insert(t.root,n4);
        t.insert(t.root,n5);
        t.inorder(t.root);
        Treemain.c=0;
        t.counter(t.root);
        System.out.println("Total nodes:"+Treemain.c);
    }
}
