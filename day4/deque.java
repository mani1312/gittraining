
                                  Deque:

 class Main {
 
    public static void main(String[] args) {
 
        Deque<Integer> numbers = new ArrayDeque<>();
 
        numbers.offer(3);
        numbers.offer(2);
        numbers.offer(1);
        System.out.println("Deque: " + numbers);
 
        int firstElement = numbers.peekFirst();
        System.out.println("First Element: " + firstElement);
 
        int lastElement = numbers.peekLast();
        System.out.println("Last Element: " + lastElement);
 
        int removedNumber1 = numbers.pollFirst();
        System.out.println("Removed First Element: " + removedNumber1);
 
        int removedNumber2 = numbers.pollLast();
        System.out.println("Removed Last Element: " + removedNumber2);
 
        System.out.println("Updated Deque: " + numbers);
    }
}
output:
Deque: [3, 2, 1]
First Element: 3
Last Element: 1
Removed First Element: 3
Removed Last Element: 1
Updated Deque: [2]