package hackerrank;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.SortedSet;
import java.util.TreeSet;



public class binarysearchtree {

	class node 
	{
		int key;
		node right , left;
		public node(int item)
		{
			key = item;
			right = left = null;
			
			
		}
		}
		node root;
	
		binarysearchtree()
		{
			root = null;
		}
		void insert(int key)
		{
			root = insertrec( root , key);
					
			
			
		}
		node insertrec (node root ,int key)
		{
			if(root == null)
			{
				root = new node(key);
				return root;
				
			}
			if(key < root.key)
					root.left = insertrec(root.left,key);
			else if (key > root.key)
					root.right = insertrec(root.right,key);
			
			return root;
		}
		void inorder()  
	    {  
	        // inorderRec(root);  
	    } 
	  
	  void levelorderrec()
	  {
		  levelorder(root);
	  }
	//    void inorderRec(node root) 
	  //  { 
	    //    if (root != null) { 
	      //      inorderRec(root.left); 
	        //    System.out.println(root.key); 
	          //  inorderRec(root.right); 
	       // } 
	   // }
	     static void levelorder (node root)
	    {
	    		Queue  <node> ss =  new LinkedList<>();
	    		ss.add(root);
	    		
	    			while(!ss.isEmpty())
	    			{
	    				node current = ss.remove();
	    				System.out.println(current.key+" ");
	    				
	    				if(current.left!=null)
	    					ss.add(current.left);
	    				if(current.right!=null)
	    					ss.add(current.right);
	    				
	    			}
	    			
	    		
	    		}
	    	
	    	
	     
	    public node search(node root, int key) 
	    { 
	        // Base Cases: root is null or key is present at root 
	        if (root==null || root.key==key) 
	        {
	            return root; 
	        }
	        // Key is greater than root's key 
	        if (root.key < key) 
	           return search(root.right, key); 
	      
	        // Key is smaller than root's key 
	        return search(root.left, key); 
	        
	    }

	
	public static void main(String[] args) {
		binarysearchtree tree = new binarysearchtree();
		tree.insert(50);
		tree.insert(36);
		tree.insert(24);
		tree.insert(10);
		tree.insert(46);
		tree.insert(98);
		tree.insert(75);
		
		tree.levelorderrec();
	tree.search( tree.root,75);
}}
