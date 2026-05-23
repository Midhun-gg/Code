import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode() {}
    TreeNode(int val) {
        this.val = val;
    }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class LeftView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        dfs(root, 0, res);
        return res;
    }
    public void dfs(TreeNode node, int depth, List<Integer> res) {
        if (node == null) return;

        if (depth == res.size()) res.add(node.val);

        dfs(node.left, depth + 1, res);
        dfs(node.right, depth + 1, res);
    }
    public static TreeNode buildTree(String[] values) {
        if (values.length == 0 || values[0].equals("-1")) return null;
        TreeNode root = new TreeNode(Integer.parseInt(values[0]));
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int i = 1;
        while (!q.isEmpty() && i < values.length) {
            TreeNode curr = q.poll();
            if (!values[i].equals("-1")) {
                curr.left = new TreeNode(Integer.parseInt(values[i]));
                q.add(curr.left);
            }
            i++;
            if (i >= values.length) break;
            if (!values[i].equals("-1")) {
                curr.right = new TreeNode(Integer.parseInt(values[i]));
                q.add(curr.right);
            }
            i++;
        }
        return root;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] values = sc.nextLine().split(" ");
        TreeNode root = buildTree(values);
        LeftView obj = new LeftView();
        List<Integer> result = obj.rightSideView(root);
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
