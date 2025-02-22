package DestiantionFang.BinaryTree;

import java.util.HashSet;
import java.util.Set;
//https://leetcode.com/problems/find-elements-in-a-contaminated-binary-tree/description/?envType=daily-question&envId=2025-02-21
//Using DFS
class FindElements {


    Set<Integer>set = new HashSet<>();

    void dfs(TreeNode root, int x) {

        if(root == null) return;

        root.val = x;
        set.add(x);

        dfs(root.left, 2*x+1);
        dfs(root.right, 2*x+2);

    }

    public FindElements(TreeNode root) {
        set.clear();
        dfs(root,0);
    }

    public boolean find(int target) {
        return set.contains(target);
    }

}

public class ElementContaminatedBT {
}


