Streams:Filtering Collection without using Stream


import java.util.*;  
class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class JavaStreamExample {  
    public static void main(String[] args) {  
        List<Product> productsList = new ArrayList<Product>();  
        
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
        List<Float> productPriceList = new ArrayList<Float>();  
        for(Product product: productsList){  
              
            
            if(product.price<30000){  
                productPriceList.add(product.price);    // adding price to a productPriceList  
            }  
        }  
        System.out.println(productPriceList);   // displaying data  
    }  
}  
Output:
[25000.0, 28000.0, 28000.0]



2. Filtering Collection by using Stream:
import java.util.*;  
import java.util.stream.Collectors;  
class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class JavaStreamExample {  
    public static void main(String[] args) {  
        List<Product> productsList = new ArrayList<Product>();  
        
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
        List<Float> productPriceList2 =productsList.stream()  
                                     .filter(p -> p.price > 30000) 
                                     .map(p->p.price)        
                                     .collect(Collectors.toList()); 
        System.out.println(productPriceList2);  
    }  
}  
Output:

[90000.0]


3. Filtering and Iterating Collection:
import java.util.*;  
class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class JavaStreamExample {  
    public static void main(String[] args) {  
        List<Product> productsList = new ArrayList<Product>();  
       
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
         
        productsList.stream()  
                             .filter(product -> product.price == 30000)  
                             .forEach(product -> System.out.println(product.name));    
    }  
}  
Output:

Dell Laptop

4. Method Reference in stream
import java.util.*;  
import java.util.stream.Collectors;  
  
class Product{  
    int id;  
    String name;  
    float price;  
      
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
          
    public int getId() {  
        return id;  
    }  
    public String getName() {  
        return name;  
    }  
    public float getPrice() {  
        return price;  
    }  
}  
  
public class JavaStreamExample {  
  
    public static void main(String[] args) {  
          
        List<Product> productsList = new ArrayList<Product>();  
          
       
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
          
        List<Float> productPriceList =   
                productsList.stream()  
                            .filter(p -> p.price > 30000) 
                            .map(Product::getPrice)         
                            .collect(Collectors.toList());  
        System.out.println(productPriceList);  
    }  
}  
Output:
[90000.0]