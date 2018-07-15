package test;

import java.util.Scanner;

import Lecture26.BST.Node;

public class nodepath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		public static void pathNode(Node root, int data) {
			System.out.println(pathNode(root, data,""));
		}
	
		private void pathNode(Node node, int data, String res) {
			if (node == null) {
				res="";
				return res;
			}
			if (data < node.data) {
				res += pathNode(node.left, data)+"";
			} else if (data > node.data) {
				res += pathNode(node.right, data)+"";
			} else
				res +=  node.data+"";
			return res;
		}
	
		}

}
