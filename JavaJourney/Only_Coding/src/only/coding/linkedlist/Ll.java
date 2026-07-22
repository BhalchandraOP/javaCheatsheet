package only.coding.linkedlist;

/*Constructor
append()
prepend()
get()
set()
insert()
removeFirst()
removeLast()
remove(index)
*/
public class Ll {
	private Node head;
	private Node tail;
	private int length;

//constructor
	public Ll(int value) {
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
		length = 1;
	}

	class Node {
		int value;
		Node next;

		Node(int value) {
			this.value = value;
		}
	}

//append
	public void append(int value) {
		Node newNode = new Node(value);
		if (length == 0) {
			head = newNode;
			tail = newNode;
		} else {

			tail.next = newNode;
			tail = newNode;
		}
		length++;
	}

//prepend
	public void prepend(int value) {
		Node newNode = new Node(value);
		if (length == 0) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
		length++;
	}

//get
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

//set
	public boolean set(int index, int set) {
		Node temp = get(index);
		if (temp != null) {
			temp.value = set;
			return true;
		}
		return false;
	}

//insert()
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
		Node prev = get(index - 1);
		Node newNode = new Node(value);

		newNode.next = prev.next;
		prev.next = newNode;
		length++;
		return true;
	}

//removeFirst()
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

//removeLast
	public Node removelast() {
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

	// remove(index)
	public Node remove(int index) {
		if (index < 0 || index >= length) {
			return null;
		}
		if (index == 0) {
			return removefirst();
		}
		if (index == length - 1) {
			return removelast();
		}
		Node prev = get(index - 1);
		Node current = prev.next;

		prev.next = current.next;
		current.next = null;
		length--;

		return current;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
