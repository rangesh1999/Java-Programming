package hackerrank;

import hackerrank.deletioninlinked.node;

public class deletionatposition {

	node head ;
	class node
	{
		int data;
		node next;
		node(int d)
		{
			data = d;
			next = null;
			
		}
	}
		public void delete (int  postion)
		{
			 if (head == null) 
		            return; 
			 
			node temp = head;
			
			
			
			if(postion ==0)
			{		head = temp.next;
			return;	
		}	
			for(int i =0; temp!=null && i<postion-1;i++)
				temp = temp.next;
			
			
			if(temp==null || temp.next==null)
				return;
			
			node next = temp.next.next;
			
			temp.next = next;
		}
		
		public void push (int key)
		{
			node newnode = new node(key);
			newnode.next = head;
			
			head = newnode;
			
		}
		public void print ()
		{
			node tnode = head;
			while(tnode!=null)
			{
				System.out.print(tnode.data + " ");
				tnode = tnode.next;
			}
			
		}
		
	
	public void getcount ()
	{
		node pointer = head;
		int count=0;
		while(pointer!=null)
		{
			count++;
			pointer = pointer.next;
		}
		System.out.println("count of the listnode"+" "+count);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		deletionatposition dd = new deletionatposition();
		
		dd.push(7);
		dd.push(1);
		dd.push(3);
		dd.push(2);
		dd.push(8);
		dd.print();
		System.out.println();
		dd.getcount();
		dd.delete(4);
		System.out.println(" after deletion");
		dd.print();
		System.out.println();
		dd.getcount();
	}

}
