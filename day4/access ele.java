                     Access Elements in hashmap

import java.util.HashMap;

class Main {
  public static void main(String[] args) {

    HashMap<Integer, String> languages = new HashMap<>();
    languages.put(1, "Java");
    languages.put(2, "Python");
    languages.put(3, "JavaScript");
    System.out.println("HashMap: " + languages);

    // get() method to get value
    String value = languages.get(1);
    System.out.println("Value at index 1: " + value);
  }
}
output:
HashMap: {1=Java, 2=c, 3=c++}
Keys: [1, 2, 3]
Values: [Java, c, c++]
Key/Value mappings: [1=Java, 2=c, 3=c++]