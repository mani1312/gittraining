import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
 
public class Terminal {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(2);
        list.add(8);
        System.out.println(list);
 
        int sum = list.stream().reduce(0, (a, b) -> a+b);
        System.out.println("sum of integer " + "\n"+ sum);

        }
        }

output:
[7, 5, 9, 3, 2, 8]
sum of integer 
34