import java.util.*;
class ReverseArray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
        int[] n=new int[l];
        for(int i=0;i<l;i++){
            n[i]=sc.nextInt();
        }
		reverse_array(n);
		System.out.println();
		reverse_array1(n);
		System.out.println();
		reverse_array2(n);
        sc.close();
	}
	public static void reverse_array(int[] n){
	   int left=0,right=n.length-1;
	   while(left<right){
		int temp=n[left];
	    n[left]=n[right];
		n[right]=temp;
		right--;
		left++;
	   }
	   for(int i=0;i<n.length;i++){
	    System.out.print(n[i]+" ");
	   }
	}
	public static void reverse_array1(int[] n){
	   int[] a=new int[n.length];
	   for(int i=0;i<n.length;i++){
		a[i]=n[n.length-1-i];
	   }
	   for(int i=0;i<n.length;i++){
	    System.out.print(n[i]+" ");
	   }
	}
	public static void reverse_array2(int[] n){
	   Collections.reverse(Arrays.asList(n));
	   for(int i=0;i<n.length;i++){
	    System.out.print(n[i]+" ");
	   }
	}
}