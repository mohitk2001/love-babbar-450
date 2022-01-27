import java.util.*;

import javax.swing.text.html.HTMLDocument.Iterator;

/**
 * TreeMapList
 */
public class TreeMapList {

    public static void main(String[] args) {
        TreeMap<Integer,String> tmap=new TreeMap<>(Collections.reverseOrder());
        Scanner sc=new Scanner(System.in);
        tmap.put(1,sc.nextLine());
        tmap.put(2,sc.nextLine());
        tmap.put(3,sc.nextLine());
        tmap.put(4,sc.nextLine());
        tmap.put(5,sc.nextLine());
       // System.out.print(tmap);
        for(Map.Entry m:tmap.entrySet()){
            System.out.println(m.getKey()+"----"+m.getValue());
        }
    }
}