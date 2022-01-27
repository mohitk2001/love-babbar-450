import java.util.*;

public class ObjectInTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer,Book> tmap=new TreeMap<>();
        Book b1=new Book("Let us C",250);
        Book b2=new Book("Rich Dad Poor Dad",350);
        Book b3=new Book("Rudest Book ever", 120);
        tmap.put(1,b1);
        tmap.put(2,b2);
        tmap.put(3,b3);
        for(Map.Entry<Integer,Book> map:tmap.entrySet()){
            int key=map.getKey();
            Book b=map.getValue();
            System.out.println(key+"---->"+b.name+"--"+b.cost);
        }
    }
}
class Book{
    String name;
    int cost;
    public Book(String name,int cost){
        this.name=name;
        
        this.cost=cost;
    }
}
