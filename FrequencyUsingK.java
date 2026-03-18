import java.util.Arrays;
import java.util.Scanner;

public class FrequencyUsingK {
    public static int maxFrequency(int[] nums, int k) {
        int n = nums.length, left = 0, right = 0, w = 0;
        long total = 0;
        Arrays.sort(nums);
        while (right < n) {
            total += (long) nums[right];
            while ((long) nums[right] * (right - left + 1) > total + k) {
                total -= nums[left];
                left++;
            }
            w = Math.max(right - left + 1, w);
            right++;
        }
        return w;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(maxFrequency(nums, k));
        sc.close();
    }
}