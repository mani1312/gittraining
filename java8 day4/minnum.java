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

         Optional<Integer> minNumber = list.stream().min((a, b) -> a.compareTo(b));

        System.out.println("minimum values of integer"+"\n"+minNumber.get()); 

        }​​​​

        }​​​​

output:

minimum values of integer

2

