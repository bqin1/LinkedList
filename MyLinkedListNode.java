
public class MyLinkedListNode {
	
	private int value;
	private MyLinkedListNode next;
	
	public MyLinkedListNode(int v)
	{
		value = v;
		next = null;
	}
	
	public int getValue()
	{
		return value;
	}
	
	public void setValue(int v)
	{
		value = v;
	}
	
	public MyLinkedListNode getNext()
	{
		return next;
	}
	
	public void setNext(MyLinkedListNode n)
	{
		next = n;
	}
}
