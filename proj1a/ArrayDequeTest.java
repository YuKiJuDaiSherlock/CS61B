public class ArrayDequeTest {

    public static void main(String[] args) {
		ArrayDeque<Integer> wxy = new ArrayDeque<>();
		 wxy.addLast(0);
         System.out.println(wxy.removeFirst());    
         wxy.addLast(2);
         System.out.println(wxy.get(0));   
         wxy.addLast(4);
         wxy.addFirst(5);
         wxy.addFirst(6);
         System.out.println(wxy.removeFirst());   
         System.out.println(wxy.removeFirst());   
         wxy.addLast(9);
         wxy.addFirst(10);
         wxy.addLast(11);
         System.out.println(wxy.get(4));   
         System.out.println(wxy.get(3));      
         wxy.addLast(14);
         wxy.addLast(15);
         System.out.println(wxy.removeLast());    
         wxy.addLast(17);
         wxy.addFirst(18);
         System.out.println(wxy.removeFirst());     
	}
}
