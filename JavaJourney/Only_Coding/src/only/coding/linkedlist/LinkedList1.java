package only.coding.linkedlist;

/************************************************/
public class LinkedList1 {
//LinkedList consists of:	
//1.head,tail,length
	private Node head;
	private Node tail;
	private int length;

	public LinkedList1(int val) {
		Node newNode = new Node(val);
		head = newNode;
		tail = newNode;
		length = 1;
	}

//2.Node	
	class Node {
		int value;
		Node next;

		Node(int value) {
			this.value = value;
		}
	}

	/***********************************************/
//3.operations	
	public void append(int n) {
		Node newNode = new Node(n);
		if (length == 0) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
		length++;
	}

	public void prepend(int n) {
		Node newNode = new Node(n);
		if (length == 0) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
		length++;
	}

	public Node removefirst() {
		if (length == 0) {
			return null;
		}
		Node temp = head;
		head = head.next;
		temp.next = null;
		length--;
		if (length == 0) {
			tail = null;
		}
		return temp;
	}

	public Node removeLast() {
		if (length == 0) {
			return null;
		}
		Node temp = head;
		Node pre = head;
		while (temp.next != null) {
			pre = temp;
			temp = temp.next;
		}
		tail = pre;
		tail.next = null;
		length--;
		if (length == 0) {
			head = null;
			tail = null;
		}
		return temp;
	}

	public Node get(int index) {
		if (index < 0 || index >= length) {
			return null;
		}
		Node temp = head;
		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public boolean set(int index, int set) {
		Node temp = get(index);
		if (temp != null) {
			temp.value = set;
			return true;
		}

		return false;

	}

	public boolean insert(int index, int value) {
		if (index < 0 || index > length) {
			return false;
		}
		if (index == 0) {
			prepend(value);
			return true;
		}
		if (index == length) {
			append(value);
			return true;

		}

		Node newNode = new Node(value);
		Node prev = get(index - 1);
		newNode.next = prev.next;
		prev.next = newNode;
		length++;
		return true;
	}

	public Node remove(int index) {
		if (index < 0 || index >= length) {
			return null;
		}
		if (index == length - 1) {
			return removeLast();
		}
		if (index == 0) {
			return removefirst();
		}

		Node prev = get(index - 1);
		Node current = prev.next;

		prev.next = current.next;
		current.next = null;

		length--;
		return current;

	}

	public static void main(String[] args) {
		System.out.println("yo");
	}
}
