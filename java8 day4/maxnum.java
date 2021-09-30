[4:41 PM] P, Sugan
import java.util.ArrayList;

import java.util.List;

import java.util.Optional; public class Terminal {​​​​

    public static void main(String[] args) {​​​​

        List<Integer> list = new ArrayList<>();

        list.add(7);

        list.add(5);

        list.add(9);

        list.add(3);

        list.add(2);

        list.add(8);

        System.out.println(list);

        Optional<Integer> maxNumber = list.stream().max((b, a) -> b.compareTo(a));

        System.out.println("maximum values of integer"+"\n"+maxNumber.get()); 

        }​​​​

        }​​​​

output:

maximum values of integer

9

