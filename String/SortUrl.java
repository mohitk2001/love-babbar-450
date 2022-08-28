import java.util.*;
public class SortUrl {
   public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
       HashMap<String, Integer>CountMap = new HashMap<String, Integer>();
      int N=sc.nextInt();
      String [] inp=new String[N];
      for(int i=0;i<N;i++){
          inp[i]=sc.next();
      }
      for(int i=0;i<N;i++){
          if(CountMap.containsKey(inp[i])){
              CountMap.put(inp[i],CountMap.get(inp[i])+1);
          }
          else{
               CountMap.put(inp[i],1);
          }
      }
      int max =0;
        for (Map.Entry entry : CountMap.entrySet()) {
            int temp=(int)entry.getValue();
                max=Math.max(temp,max);
        }
        System.out.println(max);
   List<String> al= helper(inp,N);
   Iterator iterator = al.iterator();
      while(iterator.hasNext()) {
         System.out.println(iterator.next());
      }
   }
   private static List<String> helper(String[] S, int N) {
        Map<String, Integer> map = new HashMap<>();
        for( String str : S) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        List<String> ls = new ArrayList<>();

        PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> {
            if( map.get(a) == map.get(b)) {
                if( a.length() == b.length())
                    return a.compareTo(b);
                return a.length() - b.length();
            }
            return map.get(b) - map.get(a);
        });
        pq.addAll(map.keySet());
        while ( !pq.isEmpty()) {
            ls.add(pq.poll());
        }
        return ls;
    }
}
