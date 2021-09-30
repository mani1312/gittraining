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

          Optional<String> anyElement = Stream.of("lion", "Tiger", "dog", "horse").findAny();
          System.out.println(anyElement);

        }
        }


output:
lion
Tiger
dog
horse
monkey
Optional[lion]