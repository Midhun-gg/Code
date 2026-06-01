import java.util.*;
public class SelectionSort{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        arr=selectionsort(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
    public static int[] selectionsort(int[] arr){
        int n=arr.length;
        for(int i=0;i<=n-2;i++){
            int mini=i;
            for(int j=i+1;j<=n-1;j++){
                if(arr[j]<arr[mini]) mini=j;
            }
            int temp=arr[mini];
            arr[mini]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }
}