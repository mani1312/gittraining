public class Main {
    public static void main(String[] args) {
        Vector<String> mammals= new Vector<>();
 
        
        mammals.add("Dog");
        mammals.add("Horse");
 
       
        mammals.add(2, "Cat");
        System.out.println("Vector: " + mammals);
 
        
        Vector<String> animals = new Vector<>();
        animals.add("Crocodile");
 
        animals.addAll(mammals);
        System.out.println("New Vector: " + animals);

        String element = animals.get(2);
        System.out.println("Element at index 2: " + element);

        String ele = animals.remove(1);
        System.out.println("Removed Element: " + ele);
        System.out.println("New Vector: " + animals);
    }
}
Output:
Vector: [Dog, Horse, Cat]
New Vector: [Crocodile, Dog, Horse, Cat]
Element at index 2: Horse
Removed Element: Dog
New Vector: [Crocodile, Horse, Cat]