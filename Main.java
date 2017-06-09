
public class Main {

	public static void main(String[] args) {
		
		// Sample test data
		MyLinkedListNode n0 = new MyLinkedListNode(5);
		MyLinkedListNode n1 = new MyLinkedListNode(1);
		MyLinkedListNode n2 = new MyLinkedListNode(7);
		MyLinkedListNode n3 = new MyLinkedListNode(8);
		MyLinkedListNode n4 = new MyLinkedListNode(15);
		MyLinkedListNode n5 = new MyLinkedListNode(10);
		
		MyLinkedList mList = new MyLinkedList(n0);
		
		// Requirement 1: append element to linkedlist
		System.out.println("Testing Requirement 1: appending to list");
		mList.append(n1);
		mList.append(n2);
		mList.append(n3);
		mList.append(n4);
		mList.append(n5);
		mList.printList();
		
		// Requirement 2: remove tail
		System.out.println("Testing Requirement 2: remove tail");
		mList.removeTail();
		mList.printList();
		
		/*
		 *  There are 2 approaches to this method. 1st is to just iterate through the list
		 *  and remove nodes that are greater than n. The 2nd approach is to sort the linked
		 *  list first using some O(nlogn) algorithm like merge sort, then iterate
		 *  through the list until we arrive at a value greater than n, and set tail
		 *  equals to the node previous to it. There are advantages and disadvantages
		 *  to either approach based on how large or frequently changing the data is.
		 *  I choose method 1 because sorting will incur extra space and time overhead
		 *  method 1 is only O(n) since we just go through the list once
		 *  and I wouldn't have to create extra buffer linked lists needed for merge sort
		 */
		
		System.out.println("Testing Requirement 3: remove all values in linked list greater than N");
		mList.removeGreater(7);;
		mList.printList();
	}
}
