import java.util.*;
public class Subset {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean[][] dp=new boolean[n+1][t+1];
        sub(arr,dp,t,n);
        sc.close();
    }
    public static void sub(int[] arr,boolean[][] dp,int t,int n){
        for(int i=0;i<=n;i++){
            for(int j=0;j<=t;j++){
                if(j==0) dp[i][j]=true;
                if(i==0) dp[i][j]=false;
                else{
                    boolean include=false,exclude=false;
                    if(arr[i-1]<=j) include=dp[i-1][j-arr[i-1]];
                    else exclude=dp[i-1][j];
                    dp[i][j]=exclude || include;
                }
            }
        }
        System.out.println(dp[n][t]);
    }
}