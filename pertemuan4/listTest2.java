package pertemuan4;

public class listTest2 {
	public static void main(String[] args) {
		strukturList myList = new strukturList();
		myList.addTail(5.5);
		myList.addMid(2.1, 1);
		myList.addMid(1.1, 2);
		myList.addMid(4.5, 3);
		myList.addHead(3.4);
		myList.displayElement();
	}
}
