import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
 
public class Example {
    public static void main(String[] args) {

        List<String> listOfStrings = new ArrayList<>();
        listOfStrings.add("lion");
        listOfStrings.add("Tiger");
        listOfStrings.add("dog");
        listOfStrings.add("horse");
        listOfStrings.add("monkey");
        listOfStrings.stream().forEach(System.out::println);

        if(listOfStrings.stream().noneMatch((String name) -> name.length() == 2))
          {
              System.out.println("There is no two letter name");
          }
          }
          }

output:
lion
Tiger
dog
horse
monkey
There is no two letter name