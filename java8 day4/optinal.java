Optional Class
 
import java.util.Optional;  
public class OptionalExample {  
    public static void main(String[] args) {  

        String[] str = new String[10];        
        str[5] = "JAVA ";

        Optional<String> checkNull = Optional.ofNullable(str[5]);  

        if(checkNull.isPresent()){ 
            String lowercaseString = str[5].toLowerCase();  
            System.out.print(lowercaseString);  
        }else  
            System.out.println("String value is not present");  
    }  
}  
 
output:
java 