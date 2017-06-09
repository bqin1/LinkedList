
public class MyLinkedList {
	
	private MyLinkedListNode head;
	private MyLinkedListNode tail;
	 
	public MyLinkedList(MyLinkedListNode h)
	{
		// When the linkedlist is created, the head and tail is the 1st node
		head = h;
		tail = h;
	}
	
	public void append(MyLinkedListNode n)
	{
		// I do both a try catch and null check because there is potential
		// for user to somehow set tail to NULL and then attempt append to
		// tail. If this happens, program will not crash, but simply print
		// error message e which would be a null pointer.
		try {
			if (tail != null)
			{
				tail.setNext(n);
				tail = tail.getNext();
			}
		}catch (Exception e){
			System.out.println(e);
		}
	}
	
	public void removeTail()
	{
		try {
			if (head != null)
			{
				// Iterate through the singly linked list until we find the node
				// before tail, then set next = null for this node to effectively
				// delete tail, also set the new tail as current node
				MyLinkedListNode temp = head;
				
				while (temp.getNext() != tail)
				{
					temp = temp.getNext();
				}
				
				temp.setNext(null);
				tail = temp;
			}
		}catch (Exception e){
			System.out.println(e);
		}
	}
	
	public void removeGreater(int n)
	{
		try {
			if (head != null)
			{
				MyLinkedListNode temp = head;
				MyLinkedListNode prev = null;
				
				while (temp != null)
				{
					if (temp.getValue() > n)
					{
						// special case where the head node is < n
						if (temp == head)
						{
							head = temp.getNext();
						}else{
							// to delete a node, simply skip over it
							prev.setNext(temp.getNext());
							temp = prev;
						}
					}
					prev = temp;
					temp = temp.getNext();
				}
			}
		}catch (Exception e){
			System.out.println(e);
		}
	}
	
	public void printList()
	{
		try {
			if (head != null)
			{
				MyLinkedListNode temp = head;
				
				while (temp != null)
				{
					System.out.println(temp.getValue());
					temp = temp.getNext();
				}
			}
		}catch (Exception e){
			System.out.println(e);
		}
	}
	
	public MyLinkedListNode getHead()
	{
		return head;
	}
	
	public void setHead(MyLinkedListNode h)
	{
		head = h;
	}
	
	public MyLinkedListNode getTail()
	{
		return tail;
	}
	
	public void setTail(MyLinkedListNode t)
	{
		tail = t;
	}
}
