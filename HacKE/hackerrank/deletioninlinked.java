package hackerrank;

public class deletioninlinked {

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
		public void delete (int  key)
		{
			node temp = head;
			 node prev = null;
			if(temp!=null && temp.data==key)
				head  = temp.next;
			
			while(temp!=null && temp.data !=key)
			{
				prev = temp;
				temp = temp.next;
				
			}
			if(temp==null)
			{
				System.out.println("no key found");
				return;
			}
			
			prev.next = temp.next;
			
			
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
		
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		deletioninlinked dd = new deletioninlinked();
		
		dd.push(5);
		dd.push(10);
		dd.push(7);
		dd.push(3);
		dd.print();
		
		dd.delete(500);
		System.out.println(" after deletion");
		dd.print();
		
	}

}
