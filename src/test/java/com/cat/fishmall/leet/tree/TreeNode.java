package com.cat.fishmall.leet.tree;

/**
 * @Author: xaa
 * @Date: 2024/6/12
 * @Version: V1.0
 * @Description:
 **/
public class TreeNode {

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
