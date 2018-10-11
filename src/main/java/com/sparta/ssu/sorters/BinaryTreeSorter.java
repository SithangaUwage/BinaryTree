//package com.sparta.ssu.sorters;
//
//public class BinaryTreeSorter {
//
//    private Node parent;
//    private int data;
//    private int size = 0;
//
//
//    //Constructor is called when the instance of the node object is called.
//    private class Node {
//        Node left, right;
//        int data = 0;
//        public Node(int data) {
//            this.data = data;   // this keyword refers to the instance on which the method is called.
//        }
//    }
//
//    public BinaryTreeSorter() {
//        parent = new Node(data);
//    }
//    // these methods allows new data to be added into the binary tree.
//    public void AddNewDataToNode(int data) {
//        if (size == 0) {
//            parent.data = data;
//            size++;
//        } else {
//            AddNewDataToNode(parent, new Node(data));
//        }
//    }
//
//    private void AddNewDataToNode(Node root, Node newNode) {
//        if (root == null) {
//            return;
//        }
//
//        if (newNode.data < root.data) {
//            if (root.left == null) {
//                root.left = newNode;
//                size++;
//            } else {
//                AddNewDataToNode(root.left, newNode); // adding data to the left node which is less than the root node
//            }
//        } else {
//            if (root.right == null) {
//                root.right = newNode;
//                size++;
//            } else {
//                AddNewDataToNode(root.right, newNode); // adding data to the right node which is less than the root node
//            }
//        }
//    }
//    // Getting the root node
//    public int getRoot() {
//        Node current = parent;
//        System.out.println("Root: " + current.data);
//        return 0;
//    }
//    // Getting the size of the binary tree
//    public int getSize() {
//        int current = size;
//        System.out.println("Size: " + current);
//        return 0;
//    }
//
//    // getting the lowest value in the binary tree
//    public int getLowestValue() {
//        Node current = parent;
//        while (current.left != null) {
//            current = current.left;
//        }
//        return current.data;
//    }
//    // getting the highest value in the binary tree
//    public int getHighestValue() {
//        Node current = parent;
//        while (current.right != null) {
//            current = current.right;
//        }
//        return current.data;
//    }
//
//    private void in(Node node) {
//        if (node != null) {
//            in(node.left);
//            System.out.print(node.data + " ");
//            in(node.right);
//        }
//    }
//    // Displaying values in the ascending order
//    public void ascendingOrder() {
//        System.out.print("Ascending Order: ");
//        in(parent);
//        System.out.println();
//    }
//
//    public String toString() {
//        Node current = parent;
//        System.out.print("Left of Root: ");
//
//        while (current.left != null && current.right != null) {
//
//            System.out.print(current.data + " [" + current.left.data + " " + current.right.data + "] ");
//            current = current.left;
//        }
//
//        System.out.println();
//        System.out.print("Right of Root: ");
//
//        current = parent;
//
//        while (current.left != null && current.right != null) {
//
//            System.out.print(current.data + " [" + current.left.data + " " + current.right.data + "] ");
//            current = current.right;
//        }
//        return "";
//    }
//}
