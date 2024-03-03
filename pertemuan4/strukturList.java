package pertemuan4;

public class strukturList {
private Node HEAD;
	
	public strukturList() {
		this.HEAD = HEAD;
	}
	public void addTail(double data) {
		Node newNode = new Node(data);
		
		if (isEmpty()) {
			HEAD = newNode;
		}else {
			Node posNode = null;
			Node curNode = HEAD;
			
			while(curNode != null) {
				posNode = curNode;
				curNode = curNode.getNext();
			}
			
			posNode.setNext(newNode);
		}
	}
	
	public boolean isEmpty() {
		return HEAD == null;
	}
	
	public void displayElement() {
		Node curNode = HEAD;
		
		while(curNode != null) {
			System.out.print(curNode.getData()+ " ");
			curNode = curNode.getNext();
		}
	}


	void addMid(double data, int position) {
		Node newNode = new Node(data);
		int i;
		Node curNode = HEAD;
		Node posNode = null;
		if (isEmpty()) {
			HEAD = newNode;
		}else {
			curNode = HEAD;
			if (position == 1) {
				newNode.setNext(curNode);
				HEAD = newNode;
			} else {
				i = 1;
				while (curNode != null && i < position) {
					posNode = curNode;
					curNode = curNode.getNext();
					i++;
				}
				posNode.setNext(newNode);
				newNode.setNext(curNode);
			}

	}
	}

	public void addHead(double data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			HEAD = newNode;
		}else {
			newNode.setNext(HEAD);
			HEAD = newNode;
		}
	}
	}

