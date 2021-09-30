[4:33 PM] P, Sugan
import java.util.ArrayList;

import java.util.Arrays;

import java.util.List;

import java.util.Optional;

import java.util.stream.Stream; public class Example {​​​​

    public static void main(String[] args) {​​​​

        List<String> listOfStrings = new ArrayList<>();

        listOfStrings.add("lion");

        listOfStrings.add("Tiger");

        listOfStrings.add("dog");

        listOfStrings.add("horse");

        listOfStrings.add("monkey");

        listOfStrings.stream().forEach(System.out::println);

          Stream.of("lion", "Tiger", "dog", "horse").limit(3).forEach(System.out::println);

          }​​​​

          }​​​​

output:

lion

Tiger

dog

horse

monkey

lion

Tiger

dog

