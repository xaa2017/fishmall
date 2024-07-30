package com.cat.fishmall.leet.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**中序遍历
 * 先 左边节点，再根节点，再右边节点
 * 根节点在中
 * @Author: xaa
 * @Date: 2024/6/12
 * @Version: V1.0
 * @Description:
 **/
public class MidTreeScan {

	public static void main(String[] args) {
		TreeNode tree = createTree();
		System.out.println(recursive(tree));
		System.out.println(iterator(tree));
	}

	/**
	 * 递归
	 * @param tree
	 * @return
	 */
	private static List<Integer> recursive(TreeNode tree) {
		List<Integer> res = new ArrayList<>();
		recursiveOrder(tree, res);
		return res;
	}

	private static void recursiveOrder(TreeNode tree, List<Integer> res) {
		if (tree == null) {
			return;
		}
		recursiveOrder(tree.left, res);
		res.add(tree.val);
		recursiveOrder(tree.right, res);
	}

	/**
	 *
	 * @param tree
	 * @return
	 */
	private static List<Integer> iterator(TreeNode tree) {
		List<Integer> res = new ArrayList<>();
		if (tree == null) {
			return res;
		}
		Stack<TreeNode> stack = new Stack<>();
		while(tree !=null || !stack.isEmpty()) {
			while(tree!=null) {
				stack.push(tree);
				tree = tree.left;
			}
			if (!stack.isEmpty()) {
				tree = stack.pop();
				res.add(tree.val);
				tree = tree.right;
			}
		}
		return res;
	}

	private static TreeNode createTree() {
		TreeNode tree = new TreeNode(1);
		TreeNode tree2 = new TreeNode(2);
		TreeNode tree3 = new TreeNode(3);
		tree.right = tree2;
		tree2.left = tree3;
		return tree;
	}

}
