import java.util.*;
public class Hashtotree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<String,Integer> map=new HashMap<>();
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String k=sc.nextLine();
            int v=sc.nextInt();
            sc.nextLine();
            map.put(k,v);
        }
        TreeMap<String,Integer> treeMap=new TreeMap<>(map);
        System.out.println(treeMap);
        sc.close();
    }
}