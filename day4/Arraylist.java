                                                         Array list:

import java.util.ArrayList;
 
public class Main {
  public static void main(String[] args){
    // create ArrayList
    ArrayList<String> languages = new ArrayList<>();
 
    // add() method without the index parameter
    languages.add("Java");
    languages.add("C");
    languages.add("Python");
    System.out.println("ArrayList: " + languages);
    String str = languages.get(1);
    System.out.print("Element at index 1: " + str);
    languages.set(2, "JavaScript");
    System.out.println("\n" + "Modified ArrayList: " + languages);
    String sty = languages.remove(1);
    System.out.println("Updated ArrayList: " + languages);
    System.out.println("Removed Element: " + sty);
  }
}


Output:
ArrayList: [Java, C, Python]
Element at index 1: C
Modified ArrayList: [Java, C, JavaScript]
Updated ArrayList: [Java, JavaScript]
Removed Element: C