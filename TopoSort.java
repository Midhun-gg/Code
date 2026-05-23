import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TopoSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int V=sc.nextInt();
        int E=sc.nextInt();
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        int[] indeg=new int[V];
        for(int i=0;i<E;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();
            adj.get(u).add(v);
            indeg[v]++;
        }
        Queue<Integer> queue=new LinkedList<>();
        for(int i=0;i<V;i++){
            if(indeg[i]==0) queue.add(i);
        }
        while(!queue.isEmpty()){
            int u=queue.poll();
            System.out.print(u+" ");
            for(int v:adj.get(u)){
                if(--indeg[v]==0) queue.add(v);
            }
        }
    }
}
