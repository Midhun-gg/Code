import java.util.*;
public class BubbleSortR {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        bubblesort(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }
    public static void bubblesort(int[] arr,int n){
        if(n==1) return;
        boolean swapped=false;
        for(int j=0;j<=n-2;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                swapped=true;
            }
        }
        if(!swapped) return;
        bubblesort(arr, n-1);
    }
}
