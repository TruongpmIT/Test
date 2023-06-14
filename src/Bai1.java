
public class Bai1 {

	public static void main(String[] args) {
		LinkedList aList = new LinkedList();
		aList.add(3);
		aList.add(5);
		aList.add(7);
		aList.add(5);
		aList.add(9);
		System.out.print("aList: ");
		System.out.println(aList);
		aList.remove(5);
		System.out.println("List sau khi xóa phần tử có giá trị = 5");
		System.out.println(aList);
		LinkedList bList = new LinkedList();
		bList.add(2);
		bList.add(4);
		bList.add(6);
		System.out.print("bList: ");
		System.out.println(bList);
		LinkedList merged = LinkedList.merge(aList, bList);
		System.out.println("List sau khi gộp");
		System.out.println(merged);
	}

}
