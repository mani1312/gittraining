                               override static methods by referring methods:

import java.util.function.BiFunction;  
class Arithmetic{  
public static int add(int a, int b){  
return a+b;  
}  
public static float multiplication(int a, float b){  
return a*b;  
}  
public static float sub(float a, float b){  
return a-b;  
}  
}  
public class MethodReference4 {  
public static void main(String[] args) {  
BiFunction<Integer, Integer, Integer>adder = Arithmetic::add;  
BiFunction<Integer, Float, Float>multiplier = Arithmetic::multiplication;  
BiFunction<Float, Float, Float>sub = Arithmetic::sub;  
int result1 = adder.apply(10, 20);  
float result2 = multiplier.apply(10, 20.0f);  
float result3 = sub.apply(100.0f, 20.0f);  
System.out.println(result1);  
System.out.println(result2);  
System.out.println(result3);  
}  
}  
Output:
30
200.0
80.0