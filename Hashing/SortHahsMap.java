import java.security.KeyStore.Entry;
import java.util.*;
public class SortHahsMap {
    Map<String,Integer> hm=new HashMap<>();
  public static void main(String[] args) {
      
      SortHahsMap sv=new SortHahsMap();
      sv.createMap();
      System.out.println("---Before Sorting---");
      sv.printMap(sv.hm);
      System.out.println("---After Sorting--->ascending");
      sv.SortByOrder(true);
      //sv.printMap(sv.hm);
      System.out.println("---After Sorting--->descending");
      sv.SortByOrder(false);
      //sv.printMap(sv.hm);

  } 
  public void createMap(){
    hm.put("Mohit",100);
    hm.put("Sam", 102);
    hm.put("sahil", 105);
  } 
  public void printMap(Map<String,Integer> map){
      for(Map.Entry entry:map.entrySet()){
          System.out.println(entry.getKey()+"-->" + entry.getValue());
      }
  }
  public void SortByOrder(boolean order){
      //covert map into list
      List<Map.Entry<String,Integer>> list=new LinkedList<Map.Entry<String,Integer>>(hm.entrySet());
      //sorting the list
      Collections.sort(list,new Comparator<Map.Entry<String,Integer>>(){
          public int compare(Map.Entry<String,Integer> o1,Map.Entry<String,Integer> o2){
              if(order)
              return o1.getValue().compareTo(o2.getValue());
              else
              return o2.getValue().compareTo(o1.getValue());
          }
      });
      //System.out.print(list);
      Map<String,Integer> hashmap=new LinkedHashMap<>();
      for(Map.Entry<String,Integer> entry:list){
        hashmap.put(entry.getKey(),entry.getValue());
      }
      printMap(hashmap);
  }
}
