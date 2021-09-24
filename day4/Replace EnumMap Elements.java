            Replace EnumMap Elements:

import java.util.EnumMap;

class Main {

    enum Size {
        SMALL, MEDIUM, LARGE, EXTRALARGE
    }
    public static void main(String[] args) {

        // Creating an EnumMap of the Size enum
        EnumMap<Size, Integer> sizes = new EnumMap<>(Size.class);
        sizes.put(Size.SMALL, 28);
        sizes.put(Size.MEDIUM, 32);
        sizes.put(Size.LARGE, 36);
        sizes.put(Size.EXTRALARGE, 40);
        System.out.println("EnumMap: " + sizes);

        // Using the replace() Method
        sizes.replace(Size.MEDIUM, 30);
        sizes.replace(Size.LARGE, 36, 34);
        System.out.println("EnumMap using replace(): " + sizes);

        // Using the replaceAll() Method
        sizes.replaceAll((key, oldValue) -> oldValue + 3);
        System.out.println("EnumMap using replaceAll(): " + sizes);
    }
}
[2:42 PM] P, Sugan
output:

EnumMap: {​​​​SMALL=28, MEDIUM=32, LARGE=36, EXTRALARGE=40}​​​​

EnumMap using replace(): {​​​​SMALL=28, MEDIUM=30, LARGE=34, EXTRALARGE=40}​​​​

EnumMap using replaceAll(): {​​​​SMALL=31, MEDIUM=33, LARGE=37, EXTRALARGE=43}​​​​

