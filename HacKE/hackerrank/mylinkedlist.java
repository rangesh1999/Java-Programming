package hackerrank;

public class mylinkedlist {

	node head;
	
	 class node
	{
		node next ; 
		int data;
		node(int d)
		{
			data = d;
			next = null;
		}
	}
		public void push ( int x)
		{
			node newnode = new node(x);
			newnode.next = head;
			
			head = newnode;
			
			
		}
		public void insertafter(node previousnode,int x)
		{
			if(previousnode == null) {
				System.out.println("cannot be null");
			return;	
			}
			node newnode = new node(x);
			newnode.next = previousnode.next ;
			previousnode.next = newnode;
			
			
		}
		public void append(int x)
		{
			node newnode = new node(x);
			if(head == null)
			{
				head = new node(x);
				return;
			}
			newnode.next = null;
			
			//travesing till last
			
			node last = head; 
			while(last.next!= null)
			{
				last = last.next;
			
			}
			last.next = newnode;
			return;
		}
		public void printlist()
		{
			node t = head;
			while(t	!=null)
			{
				System.out.print(t.data+" ");
				t = t.next;
			}
			 	
			
			
		}
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
mylinkedlist  ll = new mylinkedlist();

ll.append(5);
ll.push(9);
ll.append(10);
ll.insertafter(ll.head.next, 15);

ll.printlist();
	}

}
