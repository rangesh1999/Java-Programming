package hackerrank;

public class linkedlist {
 node head;

static class node
{
	int data;
	node next;
	node (int d)
	{
		
		data = d;
		next = null;
		
	}
}

public void insertfront (int x)
{
	node newnode = new node(x);
	
	newnode.next = head;
	head = newnode;
	
	
}

public void insertafter(node previousnode, int x)
{
	if(previousnode == null)
	{
		System.out.println("The given previous node cannot be null");  
        return;
	}
	
	node newnode = new node(x);
	newnode.next = previousnode.next;
		previousnode.next= newnode;
	
}
public void push(int new_data) 
{ 
    /* 1 & 2: Allocate the Node & 
              Put in the data*/
    node new_node = new node(new_data); 

    /* 3. Make next of new Node as head */
    new_node.next = head; 

    head = new_node; 
} 

public void insertend (int x)
{
	node newnode = new node(x);
	
	if(head == null )
	{
		head = new node(x);
		return;
		
	}
	newnode.next = null;
	
	node last = head;
	while(last.next!=null)
	{
		last = last.next;
		
	}
	last.next = newnode;
	
	return;
}

	public void printlist ()
	{
		node n = head;
		
		while(n!=null)
		{
			System.out.println(n.data + " ");
			n  = n.next;
		}
		
		
	}
	

	public static void main(String[] args) {
		

		linkedlist l = new linkedlist();
		l.push(5);
		l.push(7);
		l.insertfront(4);
		l.insertafter(l.head, 8);
		l.insertend(4);
			 l.printlist();
		
		
	}

}
