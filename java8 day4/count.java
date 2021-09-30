import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
 
public class Terminal {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(17);
        list.add(15);
        list.add(10);
        list.add(35);
        list.add(12);
        list.add(8);
        System.out.println(list);

        int count = (int)list.stream().count();
        System.out.println("count of integer"+"\n" + count);
        }
        }

output:
[17, 15, 10, 35, 12, 8]
count of integer
6