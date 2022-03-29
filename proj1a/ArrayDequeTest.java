public class ArrayDequeTest {

    public static void main(String[] args) {
		ArrayDeque<Integer> wxy = new ArrayDeque<>();
		wxy.addFirst(1);
		wxy.addFirst(2);
		wxy.addLast(3);
		wxy.addFirst(4);
		wxy.addFirst(5);
		wxy.addFirst(6);
		wxy.addFirst(7);
		wxy.addFirst(8);
		wxy.addFirst(9);
		wxy.addFirst(10);
		System.out.println(wxy.get(2));
		wxy.printDeque();
	}
}
