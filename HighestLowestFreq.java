import java.util.*;

public class HighestLowestFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, mink = -1, maxk = -1;
        int[] arr = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int val = entry.getValue();
            if (val > max) {
                max = val;
                maxk = key;
            }
            if (val < min) {
                min = val;
                mink = key;
            }
        }
        System.out.println(mink + " " + maxk);
        sc.close();
    }
}
