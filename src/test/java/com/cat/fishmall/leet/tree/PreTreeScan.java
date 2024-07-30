package com.cat.fishmall.leet.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**前序遍历
 * 先 根节点，再左边节点，再右边节点
 * 根节点在前
 * @Author: xaa
 * @Date: 2024/6/12
 * @Version: V1.0
 * @Description:
 **/
public class PreTreeScan {

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
		res.add(tree.val);
		recursiveOrder(tree.left, res);
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
		stack.push(tree);
		while(!stack.isEmpty()) {
			TreeNode pop = stack.pop();//出栈，并弹出
			res.add(pop.val);
			if (pop.right != null) {//取值 先左后右， 压栈的时候先右后左， 这样就可以实现取值 先左后右
				stack.push(pop.right);
			}
			if (pop.left != null) {
				stack.push(pop.left);
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
