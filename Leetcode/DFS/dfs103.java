package DFS;

import BFS.zigzag103;

import java.util.ArrayList;
import java.util.List;

public class dfs103 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(root, res, 0);
        return res;
    }
    public void dfs(TreeNode root, List<List<Integer>> res,  int height){
        if(root == null) return;
        if(height == res.size()){
            res.add(new ArrayList<>());
        }
        if(height % 2 == 0){
        res.get(height).add(root.val);}
        else{
            res.get(height).add(0, root.val);
        }
        dfs(root, res, height + 1);
        dfs(root, res, height + 1);
    }
}

