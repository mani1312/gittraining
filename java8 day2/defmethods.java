                                        Default methods in java8
Definitions:Java 8 introduces a new concept of default method implementation in interfaces
            *For example, ‘List’ or ‘Collection’ interfaces do not have ‘forEach’ method declaration
            *Thus, adding such method will simply break the collection framework implementations
			*java 8 introduces default method so that List/Collection interface can have a default implementation of forEach method, 
			 and the class implementing these interfaces need not implement the same

Program for Default methods:


public class Java8Tester {

   public static void main(String args[]) {
      Vehicle vehicle = new Car();
      vehicle.print();
   }
}

interface Vehicle {

   default void print() {
      System.out.println("I am a vehicle!");
   }
	
   static void blowHorn() {
      System.out.println("Blowing horn!!!");
   }
}

interface FourWheeler {

   default void print() {
      System.out.println("I am a four wheeler!");
   }
}

class Car implements Vehicle, FourWheeler {

   public void print() {
      Vehicle.super.print();
      FourWheeler.super.print();
      Vehicle.blowHorn();
      System.out.println("I am a car!");
   }
}										
Output:
I am a vehicle!
I am a four wheeler!
Blowing horn!!!
I am a car!