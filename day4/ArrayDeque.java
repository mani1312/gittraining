  
                             ArrayDeque:
  
  
  
  import java.util.ArrayDeque;
 
class Main {
    public static void main(String[] args) {
        ArrayDeque<String> animals= new ArrayDeque<>();
 
        
        animals.add("Dog");
 
       
        animals.addFirst("Cat");
 
       
        animals.addLast("Horse");
        System.out.println("ArrayDeque: " + animals);

          String firstElement = animals.getFirst();
        System.out.println("First Element: " + firstElement);
 
        // Get the last element
        String lastElement = animals.getLast();
        System.out.println("Last Element: " + lastElement);

        String lastEle = animals.pollLast();
        System.out.println("Removed Last Element: " + lastEle);

        System.out.println("New ArrayDeque: " + animals);
    }
}
output:
ArrayDeque: [Cat, Dog, Horse]
First Element: Cat
Last Element: Horse
Removed Last Element: Horse
New ArrayDeque: [Cat, Dog]