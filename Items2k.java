import java.util.*;
public class Items2k {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if(validd(arr,n,k)) System.out.println("True");
        else System.out.println("False");
    }
    public static boolean validd(int[] arr,int n,int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i],(map.getOrDefault(arr[i],0)+1));
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>2*k) return false;
        }
        return true;
    }
}
