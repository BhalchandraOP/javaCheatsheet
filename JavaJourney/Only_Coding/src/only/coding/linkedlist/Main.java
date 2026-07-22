package only.coding.linkedlist;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList myLinkedList = new LinkedList(4);
		myLinkedList.getHead();
		myLinkedList.getTail();
		myLinkedList.getLength();

		myLinkedList.append(9); /// 1.APPEND

		myLinkedList.getHead();
		myLinkedList.getTail();
		myLinkedList.getLength();

		myLinkedList.printList(); // 2. PRINT THE LIST

		myLinkedList.Prepend(2);
		// myLinkedList.removeLast(); // 3. REMOVE LAST

//		myLinkedList.getHead();
//		myLinkedList.getTail();
//		myLinkedList.getLength();

		myLinkedList.printList();
	}

}
