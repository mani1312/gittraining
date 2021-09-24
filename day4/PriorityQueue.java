 
                                        PriorityQueue:      
 import java.util.PriorityQueue;
 
public class Main {
    public static void main(String[] args) {
 
        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        numbers.add(4);
        numbers.add(2);
        numbers.add(6);
        System.out.println("PriorityQueue: " + numbers);
 
        int number = numbers.peek();
        System.out.println("Accessed Element: " + number);

        numbers.offer(3);
        System.out.println("Updated PriorityQueue: " + numbers);

        boolean result = numbers.remove(2);
        System.out.println("Is the element 2 removed? " + result);

        int num = numbers.poll();
        System.out.println("Removed Element Using poll(): " + num);  

    }
}

output:
PriorityQueue: [2, 4, 6]
Accessed Element: 2
Updated PriorityQueue: [2, 3, 6, 4]
Is the element 2 removed? true
Removed Element Using poll(): 3