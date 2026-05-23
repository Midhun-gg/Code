import java.util.*;

public class MaxSlidingDeque {
    
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0) return new int[0];
        int n = nums.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            // Remove out-of-window indices
            if (!dq.isEmpty() && dq.peekFirst() < i - k + 1) {
                dq.pollFirst();
            }
            // Remove smaller elements from back
            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) {
                dq.pollLast();
            }
            dq.offerLast(i);
            // Add to result when window is complete
            if (i >= k - 1) {
                result[i - k + 1] = nums[dq.peekFirst()];
            }
        }
        return result;
    }
}