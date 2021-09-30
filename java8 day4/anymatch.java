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
 
          if(listOfStrings.stream().anyMatch((String name) -> name.length() == 5))
            {
                System.out.println("Yes... There is a name exist with 5 letters" );
            }
            }
            }

output:
lion
Tiger
dog
horse
monkey
Yes... There is a name exist with 5 letters