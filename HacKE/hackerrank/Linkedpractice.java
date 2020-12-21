package hackerrank;

public class Linkedpractice {
	
	Node head ;
	class Node
	{
		Node next;
		int data;
		Node(int d)
		{
			data = d;
			next = null;
		}}
		//1.Inserting at Front (add)
		public void push(int data)
		{
			Node newnode = new Node (data);
			newnode.next = head;
			head = newnode;
			
		}
		//2.delete a Linked list
		void deleteList ()
		{
			head =null;
			System.out.println("List deleted");
		}
		//3.Insert at End
		void append(int data)
		{
			
			Node newnode = new Node(data);
			if(head==null)
			{
				head = newnode;
				return;
			}
			newnode.next = null;
			Node tnode = head;
			while(tnode.next!=null)
				tnode = tnode.next;
			tnode.next = newnode;
			System.out.println();
			System.out.println("Append Done");
			return;
			
		}
		//4.Traversing a Linked List 
	public	void print()
		{
			Node pointer = head;
			while(pointer!=null)
			{	System.out.print(pointer.data+" ");
				pointer = pointer.next;
			}
		}
		//5.deleting a Linked List by given node position
	public	void deleteAtposition(int position)
		{
			if(head==null)
				return;
			Node temp = head;
			if(position == 0)
			{
				head = head.next;
			}
			else
			{
				for(int i =0 ;temp!=null&& i<position-1 ;i++)
				{
					temp = temp.next;
				}
				if(temp==null || temp.next==null)
					return;
				Node next;
				
				next = temp.next.next;
				temp.next= next;
				
			}}
	//6. Search and retrive posiiton of element given
			public void SearchAndRetrivePos(int key)
			{
				Node Tnode = head;
				int Counter =0;
				boolean ispresent = false;
				while(Tnode!=null)
				{
					Counter++;
					if(Tnode.data==key)
					{
						ispresent = true;
						System.out.println("Element found is" +" "+Tnode.data+ "and Pos is "+ " "+Counter);
					}
					Tnode = Tnode.next;
				}
				if(!ispresent)
					System.out.println("element not found");
				
			}
			//7. Get Nth Node 
			public void GetAnode(int x)
			{
				Node Tnode = head;
				int count=0;
				while(Tnode!=null)
				{
					if(x==count)
						System.out.println(Tnode.data);
					count++;
					Tnode = Tnode.next;
				}
			}
			//8.Get Middle Element
		public void middleelement()
		{
			Node fastptr = head;
			Node slowptr = head;
			if(head!=null)
			{
				while(fastptr!=null &&fastptr.next!=null)
				{
					fastptr = fastptr.next.next;
					slowptr = slowptr.next;
					
					
				}
				System.out.println("The middle element is "+ slowptr.data + "\n");
				
			}
		}
		//9.Nth Node From end
		public void NodeFromEnd (int n)
		{
			Node Tnode = head;
			if(head==null)
				return;
			int len =0 ;
			while(Tnode != null)
			{
				
				Tnode=Tnode.next;
				len++;
			}
			if(len<n)
				return;
			Tnode = head;
			for(int i =1 ;i<len-n+1;i++)
			{
				Tnode = Tnode.next;
			}
			System.out.println("From End"+ Tnode.data);
			
		}
		//10.Detect Loop (Floyd Loop detection Algo)
		public void detectLoop() {
			
			Node slwptr = head;
			Node fastptr = head;
			int flag =0;
			while(slwptr!=null && fastptr!=null && fastptr.next!=null)
			{ 
				slwptr = slwptr.next;
				fastptr = fastptr.next.next;
				
			if(slwptr == fastptr) {
				flag=1;
				break;}
			}
			if(flag==1)
				System.out.println("Loop Found");
			else
				System.out.println("Loop not Found");
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linkedpractice l = new Linkedpractice();
		l.push(20);
		l.push(4);
		l.push(15);
		l.push(10);
		
		l.print();
		
		l.head.next.next.next.next = l.head;
		l.detectLoop();
	}

}
