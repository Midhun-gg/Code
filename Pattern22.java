import java.util.*;
public class Pattern22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<2*n-1;i++){
            for(int j=0;j<2*n-1;j++){
                int top=i;
                int left=j;
                int right=2*n-2-j;
                int bottom=2*n-2-i;
                int v=Math.min(Math.min(top,left),Math.min(right,bottom));
                System.out.print(4-v);
            }
            System.out.println();
        }
        sc.close();
    }
}
