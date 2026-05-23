import java.util.*;
public class Knapsack{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] wt=new int[n];
        int[] val=new int[n];
        for(int i=0;i<n;i++){
            wt[i]=sc.nextInt();
            val[i]=sc.nextInt();
        }
        int W=sc.nextInt();
        int[][] dp=new int[n+1][W+1];
        knap(wt,val,W,dp);
    }
    public static void knap(int[] wt,int[] val,int W,int[][] dp){
        int n=wt.length;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=W;j++){
                if(i==0 || j==0) dp[i][j]=0;
                else{
                    int pick=0,not=0;
                    if(wt[i-1]<=j){
                        pick=val[i-1]+dp[i-1][j-wt[i-1]];
                    }
                    not=dp[i-1][j];
                    dp[i][j]=Math.max(pick,not);
                }
            }
        }
        System.out.println(dp[n][W]);
    }
}